package io.purush.java.immutable.collections;

/** Grandparent of all collections. Abstracts the most basic collection methods - size, etc.
 * @author Purush Swaminathan
 * @since 1.0
 */
public interface Collection<E> {
  /** Bookkeeping: Size of the collection. 
   * @return the size 
   */
  int size();
}
