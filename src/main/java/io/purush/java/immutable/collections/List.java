package io.purush.java.immutable.collections;

public interaface List<E> {

  List<E> add(E e);

  List<E> update(int index, E e);

  List<E> remove(E e);

  E get();

  E get(int index);

  List<E> piece(int from, int to);

  Tuple2<List<E>, List<E>> splitAt(int x);

  List<E> merge(List<E> e1, List<E> e2);

  
}
