package io.purush.java.immutable.collections;

/**
 * A simple enough implementation of a two Tuple. Again immutable.
 * @author Purush Swaminathan
 * @since 1.0
 */
public class Tuple2<X,Y> {
  /** First part of the <code>Tuple2</code>.
   */
  private final X _1;

  /** Second part of the <code>Tuple2</code>.
   */
  private final Y _2;

  /** Construct a simple enough two tuple.
   * @param x first part
   * @param y second part
   */
  public Tuple2(X x, Y y){
    _1 = x;
    _2 = y;
  }

  /**
   * @return first part of the tuple.
   */
  public X _1() {
    return _1;
  }
  /**
   * @return second part of the tuple
   */
  public Y _2() {
    return _2;
  }
}
