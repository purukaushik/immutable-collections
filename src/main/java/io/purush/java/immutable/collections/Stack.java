package io.purush.java.immutable.collections;

import java.util.EmptyStackException;

/** A Stack implementation of a Seque. Internally it is a linkedlist of sorts.<br>
 * Op complexity: <br>
 * <ol><li> Insertion - O(1) </li>
 * <li>Deletion - O(1) </li></ol>
 * This implementation is immutable and thereby threadsafe.
 * @author Purush Swaminathan
 * @since 1.0
 */
public class Stack<E> implements Seque<E> {

  private final Stack<E> bottom;

  private final E top;

  private final int size;

  /**Returns an Empty <code>Stack</code>.
   */
  public Stack(){
    // the empty stack
    top=null;
    bottom=null;
    size =0;
  }

  /**Returns a new <code>Stack</code> with one element inserted.
   */
  public Stack(E top){
    // stack with exactly one element
    this.top = top;
    bottom = new Stack<>();
    size = 1;
  }

  /**Returns a new <code>Stack</code> with the top and bottom supplied to it.
   */
  public Stack(E top, Stack<E> bottom){
    this.top= top;
    this.bottom= bottom;
    this.size = bottom.size()+1;
  }
  
  public Seque<E> push(E e){
    if(size == 0){
      return new Stack<>(e);
    } else{
      return new Stack<>(e, this);
    }
  }

  public Seque<E> pop(){
    if(size==0) throw new EmptyStackException();
    else {
      if(bottom.size()==0){
	return new Stack<E>();
      } else {
	return new Stack<E>(bottom.top, bottom.bottom);
      }
    }
  }

  public E peek(){
    if(size==0) throw new EmptyStackException();
    return top;
  }

  public int size(){
    return size;
  }
  
  // TODO:
  // Override Object stuff -> hashCode, equals, toString
  @Override
  public String toString(){
    return size==0 ? "NULL" : top.toString() + "->" + bottom.toString();
  }

  @Override
  public boolean equals(Object object){
    if(object==null) return false;
    
    if(!(object instanceof Stack)) return false;

    Stack<E> that =(Stack<E>) object;
    if(this.size != that.size) return false;
    if(this.size==1 && this.top == that.top){
      return true;
    }else{
      return this.top.equals(that.top) &&
	this.bottom.equals(that.bottom);
    }
  }

  @Override
  public int hashCode(){
    int topHash = top.hashCode();
    if(size==1) return topHash;
    else{
      int bottomHash = bottom.hashCode();
      return 31*topHash + bottomHash;
    }
  }
}
