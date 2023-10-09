package com.dsa.linkedList.customLL;

public class Main {
    public static void main(String[] args){
        MyLinkedList list = new MyLinkedList();
        list.display();

        // add at head
        list.addAtHead(1);
        list.addAtHead(2); // latest head
        list.display();

        // add at tail
        list.addAtTail(3);
        list.addAtTail(4); // latest tail
        list.display();

        // add at index 2
        list.addAtIndex(5, 2);
        list.display();

        // delete at index 2
        list.deleteAtIndex(0);
        list.display();

        // add at index == size, i.e., 4
        list.addAtIndex(6, 4);
        list.display();

        // add at index == size, i.e., 5
        list.addAtIndex(7, 5);
        list.display();
    }
}
