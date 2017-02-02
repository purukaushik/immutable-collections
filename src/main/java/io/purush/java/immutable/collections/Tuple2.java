package io.purush.java.immutable.collections;

public class Tuple2<X,Y> {
  
  private final X _1;
  
  private final Y _2;
  
  public Tuple2(X x, Y y){
    _1 = x;
    _2 = y;
  }

  public X _1() {
    return _1;
  }
  
  public Y _2() {
    return _2;
  }
}
