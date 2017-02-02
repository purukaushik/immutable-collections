package io.purush.java.immutable.collections;

@FunctionalInterface
public interface Shufflable<E>{
  Shufflable<E> shuffle();
}
