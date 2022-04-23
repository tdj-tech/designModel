package com.tuodfh.iterator;

/**
 * @author tdj
 * 2022/4/23 0023
 * 自定义数组容器
 */
public class ArrayList_<E> implements Collection_<E> {

    E[] objects = (E[])new Object[10];
    private int index = 0;

    @Override
    public void add(E e) {
        if (index == objects.length) {
            E[] newObjects = (E[])new Object[objects.length << 1];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[index] = e;
        index++;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public E get(int index) {
        return objects[index];
    }

    @Override
    public Iterator_<E> getIterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator_<E> {

        private int num = 0;

        @Override
        public boolean hasNext() {
            return num < index;
        }

        @Override
        public E next() {
            return objects[num++];
        }
    }

}
