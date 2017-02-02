package io.purush.java.immutable.collections;

/**
 * A doubly-ended queue. Abstracts <code>LinkedList</code>s.
 * @author Purush Swaminathan
 * @since 1.0
 */

public interface Deque<E> {
  
  Deque<E> pushHead(E e);

  Deque<E> pushEnd(E e);

  Deque<E> popEnd();

  Deque<E> popHead();

  E peekHead();

  E peekEnd();
  
}
