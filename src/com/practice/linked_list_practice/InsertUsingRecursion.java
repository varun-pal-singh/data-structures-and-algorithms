package com.practice.linked_list_practice;

public class InsertUsingRecursion {
    public static void main(String[] args){
        InsertUsingRecursion list = new InsertUsingRecursion();

    }
    private static class Node{
        int val; Node next;
        private Node(int val){this.val = val;}
        private Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
    private Node head;
    public InsertUsingRecursion(){
        this.head = null;
    }
//    3 -> 5 -> 9 -> 1 -> null
    public void insertUsingRec(Node head, int index, int val){
//        if(index <)
    }
}
