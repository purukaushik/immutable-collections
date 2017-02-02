package io.purush.java.immutable.collections;

/**
 * A singly-ended queue. Abstracts <code>Stack</code>s and <code>Queue</code>s.
 * @author Purush Swaminathan
 * @since 1.0
 */
public interface Seque<E> extends Collection<E>{

  /**
   * Creates a fresh instance of the Seque with the element at the open end of the <code>Seque</code>.<br>
   * Ehis ensures immutability.
   * @param e element to be added to the end of the <code>Seque</code>
   * @return a fresh <code>Seque</code> with element added to the open end.
   */
  Seque<E> push(E e);
  
  /**
   * Creates a fresh instance of Seque without the end element. <br>
   * Since <code>Seque</code>s are immutable, <code>pop()</code> is unlike traditional Stacks and Queues. It doesn't remove and give you the end element from the current <code>Seque</code>.<br>
   * Use <code>peek()</code> to gather the end element.
   * @return a fresh <code>Seque</code> without the end element.
   */
  Seque<E> pop();

  /**
   * 
   * @return the end element of this <code>Seque</code>
   */
  E peek();
}
