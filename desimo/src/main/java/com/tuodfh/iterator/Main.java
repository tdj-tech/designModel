package com.tuodfh.iterator;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author tdj
 * 2022/4/23 0023
 * @desc
 */
public class Main {

    public static void main(String[] args) {
        Collection_<String> arrayList_ = new ArrayList_<>();
        for (int i = 0; i < 15; i++) {
            arrayList_.add("s" + i);
        }
        System.out.println(arrayList_.size());
        for (int i = 0; i < arrayList_.size(); i++) {
            System.out.println(arrayList_.get(i));
        }
        System.out.println("=======================");
        Collection_<String> linkList_ = new LinkList_<>();
        for (int i = 0; i < 15; i++) {
            linkList_.add("l" + i);
        }
        System.out.println(linkList_.size());
        for (int i = 0; i < linkList_.size(); i++) {
            System.out.println(linkList_.get(i));
        }
        System.out.println("========================");
        Iterator_<String> arrayItr = arrayList_.getIterator();
        while (arrayItr.hasNext()) {
            System.out.println(arrayItr.next());
        }
        System.out.println("========================");
        Iterator_<String> linkListItr = linkList_.getIterator();
        while (linkListItr.hasNext()) {
            System.out.println(linkListItr.next());
        }
        LinkedList<String> linkedList = new LinkedList<>();
        Iterator<String> iterator = linkedList.iterator();
        iterator.hasNext();
    }

}
