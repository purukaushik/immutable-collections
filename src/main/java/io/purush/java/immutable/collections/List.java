package io.purush.java.immutable.collections;
// TODO: 2/1
// 1. Iterator support
// 2. Stream support
// 3. Monadic support

/**
 * A simplistic abstraction of immutable <code>List</code>s. <br>
 * Ability to add, remove, update elements to/from the <code>List</code>.<br>
 * Additional ability to merge, split, piece-out lists from a <code>List</code>.
 * @author Purush Swaminathan
 * @since 1.0
 */
public interface List<E> {

  /**Add an element to this <code>List</code> and return a fresh list containing it.
   * @param e
   * @return fresh <code>List</code>
   */
  List<E> add(E e);

  /** Update element at an index to this <code>List</code> and return a fresh list containing it. Implementations should maintain the <code>List</code> remain immutable.
   * @param index 
   * @param e
   * @return fresh <code>List</code>
   */
  List<E> update(int index, E e);

  /** Creates a fresh <code>List</code> without the first occurrence of e.
   * @return fresh <code>List</code> without e
   */
  List<E> remove(E e);

  /** Return the element at index given.
   * @param index
   * @return E
   */
  E get(int index);

  /**
   * Piece out the list and return the piece between two indices.
   * @param from - start index inclusive
   * @param to - end index exclusive
   * @return a sub-list of elements in the <code>List</code> between `from`(inclusive) and `to`(exclusive).
   */
  List<E> piece(int from, int to);

  /**
   * Splits the list at an index <code>x</code> into two pieces.
   * @param x
   * @return <code>Tuple2<List<E>,List<E>></code> a tuple of two lists
   */
  Tuple2<List<E>, List<E>> splitAt(int x);

  /**
   *Merge two lists into one.
   */
  List<E> merge(List<E> e1, List<E> e2);

  
}
