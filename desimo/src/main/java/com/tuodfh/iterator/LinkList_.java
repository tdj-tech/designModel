package com.tuodfh.iterator;

/**
 * @author tdj
 * 2022/4/23 0023
 * 自定义链表结构
 */
public class LinkList_<E> implements Collection_<E> {

    Node head = null;
    Node tail = null;
    private int size = 0;

    @Override
    public void add(E e) {
        Node<E> node = new Node<>(e);
        node.next = null;
        if (head == null) {
            head = node;
            tail = node;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        int num = 0;
        Node<E> curr = head;
        while (curr.next != null) {
            if (num++ == index) {
                break;
            }
            curr = curr.next;
        }
        return curr.object;
    }

    @Override
    public Iterator_<E> getIterator() {
        return new LinkListIterator();
    }

    private class Node<E> {
        private E object;
        Node next;

        public Node(E object) {
            this.object = object;
        }
    }

    private class LinkListIterator implements Iterator_<E> {

        private Node<E> currNode = null;

        @Override
        public boolean hasNext() {
            return currNode != tail;
        }

        @Override
        public E next() {
            if (currNode == null) {
                currNode = head;
            } else {
                currNode = currNode.next;
            }
            return currNode.object;
        }
    }

}
