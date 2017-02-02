package io.purush.java.immutable.collections;

/**
 * A simplistic abstraction of immutable <code>List</code>s. <br>
 * Ability to add, remove, update elements to/from the <code>List</code>.<br>
 * Additional ability to merge, split, piece-out lists from a <code>List</code>.
 * @author Purush Swaminathan
 * @since 1.0
 */
public interface List<E> {

  List<E> add(E e);

  List<E> update(int index, E e);

  List<E> remove(E e);

  E get();

  E get(int index);

  List<E> piece(int from, int to);

  Tuple2<List<E>, List<E>> splitAt(int x);

  List<E> merge(List<E> e1, List<E> e2);

  
}
