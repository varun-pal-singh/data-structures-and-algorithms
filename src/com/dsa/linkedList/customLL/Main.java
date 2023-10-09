package com.dsa.linkedList.customLL;

public class Main {
    public static void main(String[] args){
        MyLinkedList list = new MyLinkedList();
        System.out.println(list);
        System.out.println(list.head);
        System.out.println(list.tail);
        System.out.println(list.size);

        // adding
        list.add(1);
        list.add(2);
        list.addFirst(3);
        list.addFirst(4);   // this is the latest head
        list.add(5);    // this is the latest tail
        list.insert(10, 2);


        // display
        list.display();

        // remove first
        System.out.println(list.removeFirst());;
        list.display();

        // remove last
        System.out.println(list.removeLast());;
        list.display();
    }
}
