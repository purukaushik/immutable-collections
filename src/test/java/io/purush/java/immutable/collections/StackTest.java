package io.purush.java.immutable.collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;


public class StackTest {
  @Test
  public void checkNewEmpty(){
    fail();
  }

  @Test
  public void checkPopEmpty(){
    fail();    
  }

  @Test
  public void checkPushEmpty(){
    fail();
  }
  
  @Test
  public void checkPeekEmpty(){
    fail();
  }

  @Test
  public void checkPopNonEmpty(){
    fail();
  }
 
  @Test
  public void checkPushNonEmpty(){
    fail();
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
}
