package com.dsa.linkedList.customLL;

public class MyLinkedList {
    public Node head, tail;
    public int size;

    public void add(int val){
        Node n = new Node(val);
        if(head == null && tail == null){   // means list is empty
            head = n;
            tail = head;
        }else{
            tail.next = n;
            tail = n;
//            System.out.println(n.next + " " + tail.next);
            tail.next = null;   // tail.next is already null
        }
        size += 1;
    }

    public void addFirst(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insert(int val, int idx){
        if(idx == 0){
            addFirst(val);
            return;
        }
        if(idx == size){
             add(val);
             return;
        }
        Node temp = head;
        for(int i = 1; i < idx; i++){
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;

        size += 1;
    }

    public int removeFirst(){
        int val = head.val;
        head = head.next;
        if(head == null)
            tail = null;
        size -= 1;
        return val;
    }

    public int removeLast(){
        if(size <= 1){
            return removeFirst();
        }
        Node prev = get(size - 2);
        int val = tail.val;
        tail = prev;
        tail.next = null;
        size -= 1;
        return val;
    }

    private Node get(int idx){
        Node temp = head;
        for(int i = 0; i < idx; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("size = "+size);
    }
    private class Node{
        int val;
        Node next;
        Node(){
            val = 0;
            next = null;
        }
        Node(int val){
            this.val = val;
        }
        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}
