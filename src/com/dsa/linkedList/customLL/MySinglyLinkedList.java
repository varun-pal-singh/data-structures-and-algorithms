package com.dsa.linkedList.customLL;

public class MySinglyLinkedList {
    Node head;
    int size;

    private static class Node{
        int value;
        Node next;
        private Node(int value){this.value = value;}
        private Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public MySinglyLinkedList(){
        this.head = null;
        this.size = 0;
    }

    public int get(int index){
        if(size == 0 || index < 0 || index > size)   return -1;
        Node current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.value;
    }

    public void addAtHead(int value){
        Node current = new Node(value);
        current.next = this.head;
        this.head = current;
        size += 1;
    }

    public void addAtTail(int value){
        if(this.size == 0){
            addAtHead(value);
            return;
        }
        Node current = head;
        Node node = new Node(value);
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
        node.next = null;
        size += 1;
    }

    public void addAtIndex(int value, int index){
        if(index < 0 || index > this.size) return;
        if(index == 0){
            addAtHead(value);
            return;
        }
        if(index == this.size){
            addAtTail(value);
            return;
        }
        Node prev = head;
        Node node = new Node(value);
        for(int i = 0; i < index - 1; i++){
            prev = prev.next;
        }
        node.next = prev.next;
        prev.next = node;
        size += 1;
    }

    public void deleteAtIndex(int index){
        if(index < 0 || index > this.size)  return;
        if(index == 0){
            this.head = this.head.next;
            size -= 1;
            return;
        }
        Node prev = head;
        for(int i = 0; i < index - 1; i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
        size -= 1;
    }
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
        System.out.println("size = " + this.size);
    }
}