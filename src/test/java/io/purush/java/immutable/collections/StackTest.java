package io.purush.java.immutable.collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;
import java.util.EmptyStackException;

public class StackTest {
  @Test
  public void checkNewEmpty(){
    // is this all we could do?
    assertEquals("An empty stack has to have 0 size.", Empty().size(), 0);
  }

  @Test
  public void checkPopEmpty(){
    
    try{
      Empty().pop();
      fail("Empty pop -> blew out of proportions.");
    } catch(EmptyStackException ese){
    }
  }

  @Test
  public void checkPushEmpty(){
    assertEquals(Empty().push(5).size(), 1);
  }
  
  @Test
  public void checkPeekEmpty(){

    try{
      Empty().peek();
      fail("Empty peek -> blew out of proportions.");
    } catch(EmptyStackException ese1){
      //do nothing
    }
    
  }

  @Test
  public void checkPopNonEmpty(){
    Seque<Integer> stack = Empty().push(1).push(2);
    assertEquals(stack.pop().size(), 1);
    assertEquals(stack.pop().pop().size(),0);
  }

  @Test
  public void checkPeekNonEmpty(){
    Seque<Integer> stack = Empty().push(1);
    assertEquals((int)stack.peek(), 1);
  }
 
  @Test
  public void checkPushNonEmpty(){
    Seque<Integer> stack = Empty().push(1);
    assertEquals((int)stack.push(2).peek(),2);
    assertEquals(stack.push(2).size(),2);
  }
  @Test
  public void checkHashability(){
    java.util.Set<Seque<Integer>> stackSet = new java.util.HashSet<>();
    Seque<Integer> takeOutAble = new Stack<Integer>().push(5);
    stackSet.add(takeOutAble);

    assertTrue("HashSet of Stacks doesn't contain what it should. Bad hashCode or equals method",
	       stackSet.contains(new Stack<Integer>().push(5)));
    
    assertFalse("Collisions happening. Bad hashCode, equals contract",
		stackSet.contains(new Stack<Integer>().push(5).push(5).push(5)));
    
    assertFalse("Equals emptiness check is bad.", stackSet.contains(new Stack<Integer>()));

    stackSet.add(new Stack<Integer>());

    assertTrue("HashSet doesn't contain empty stack that was added. Bad hashcode for empty stacks.",
	       stackSet.contains(new Stack<Integer>()));
    
    assertFalse("Null check on equals method is bad", stackSet.contains(null));
  }

  @Test
  public void checkEquals(){
    Seque<Integer> one = new Stack<Integer>(1)
      .push(2)
      .push(3);

    Seque<Integer> other = new Stack<Integer>().push(1).push(2).push(3);

    assertEquals("Stacks are not equal", one, other);

  }
  // wont test toString
  static Stack<Integer> Empty(){ return new Stack<Integer>();}
}
