package com.tuodfh.iterator;

/**
 * @author tdj
 * 2022/4/23 0023
 * @desc
 */
public interface Collection_<E> {

    void add(E e);

    int size();

    E get(int index);

    Iterator_<E> getIterator();

}
