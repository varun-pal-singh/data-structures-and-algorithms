package com.dsa.recursion.problems;

import java.util.LinkedList;
import com.dsa.linkedList.customLL.MySinglyLinkedList;

public class LC206_reverse_linked_list {
//    public static class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }
  public static void main(String[] args){
      MySinglyLinkedList list = new MySinglyLinkedList();
      for(int i = 1; i <= 5; i++){
          list.addAtTail(i);
      }
      list.display();
//      System.out.println("After reversing : "+reverse(list.get(0)));
  }
//  public static Node reverse(Node head){
//
//  }
}
