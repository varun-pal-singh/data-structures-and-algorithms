package com.dsa.linkedList.customLL;

public class MainDoubly {
    public static void main(String[] args) {
        MyDoublyLinkedList list = new MyDoublyLinkedList();
//        list.display();

        // adding
        list.addAtTail(2);
        list.addAtTail(3);
        list.addAtTail(4);
        list.addAtHead(1);
        list.addAtIndex(0, 0);  // head
        list.addAtIndex(5, list.size);  // tail
//        list.display();

        // deleting
        list.deleteIndex(0);
        list.deleteIndex(3);
        list.deleteIndex(list.size - 1);
        System.out.println("After deletion");
        list.display();

        // addAfter some value
        list.addAfter(1, 6);
        list.addAfter(3, 7);
        list.addAfter(5, 8);

        // displaying from front and last
        System.out.println("display from the front");
        list.display();
        System.out.println("display from the last");
        list.displayFromLast();
    }
}
