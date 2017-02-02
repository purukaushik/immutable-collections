package io.purush.java.immutable.collections;

/**
 * A doubly-ended queue. Abstracts <code>LinkedList</code>s.
 * @author Purush Swaminathan
 * @since 1.0
 */

public interface Deque<E> {
  
  /** Create a new <code>Deque</code> with `e` as head element.
   * @param e element to be pushed to the head of the queue.
   * @return new queue that has the pushed element
   */
  Deque<E> pushHead(E e);

  /** Create a new <code>Deque</code> with `e` as the end element.
   * @param e element to be pushed to the end of the queue.
   * @return new queue that has the pushed element
   */
  Deque<E> pushEnd(E e);

  /** Create a new <code>Deque</code> without the end of the exisiting <code>Deque</code>.
   * @return deque
   */
  Deque<E> popEnd();
  
  /** Create a new <code>Deque</code> without the head of the existing <code>Deque</code>.
   */
  Deque<E> popHead();

  /** Show the head of this <code>Deque</code>.
   */
  E peekHead();

  /** Show the end of this <code>Deque</code>.
   */
  E peekEnd();
  
}
