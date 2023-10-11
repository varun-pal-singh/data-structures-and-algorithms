package com.dsa.linkedList.customLL;

public class MyDoublyLinkedList {
   private class Node{
       int value; Node next, prev;
       private Node(int value){
           this.value = value;
       }
       public Node(int value, Node next, Node prev) {
           this.value = value;
           this.next = next;
           this.prev = prev;
       }
   }
   Node head, tail; int size;
   public MyDoublyLinkedList(){
       this.head = null;
       this.tail = null;
       this.size = 0;
   }

//   null <- 1 <=> 2 <=> 3 <=> 4 -> null
   public int get(int index){
       if(index < 0 || index > this.size || this.size == 0) return -1;
       Node current = head;
       for(int i = 0; i < index; i++){
           current = current.next;
       }
       return current.value;
   }

   public void addAtHead(int value){
       Node node = new Node(value);
       node.next = this.head;
       node.prev = null;
       if(this.head != null){
           this.head.prev = node;
       }
       this.head = node;
       this.size += 1;
       if(this.size == 1)
           this.tail = this.head;
   }

   public void addAtTail(int value){
       if(this.size == 0){
           addAtHead(value);
           return;
       }
       Node node = new Node(value);
       Node current = this.head;
       while(current.next != null){
           current = current.next;
       }
       current.next = node;
       node.prev = current;
       this.tail = node;
       this.size += 1;
   }

   public void addAtIndex(int value, int index){
       if(index < 0 || index > this.size)    return;
       if(index == 0){
           addAtHead(value);
           return;
       }
       if(index == this.size){
           addAtTail(value);
           return;
       }
       Node node = new Node(value);
       Node previous = head;
       for(int i = 0; i < index - 1; i++){
           previous = previous.next;
       }
       node.next = previous.next;
       previous.next.prev = node;
       node.prev = previous;
       previous.next = node;
       size += 1;
   }
//   null <- 1 <=> 2 <=> 3 <=> 4 -> null
    private Node find(int value){
       Node current = head;
       while(current != null){
           if(current.value == value)
               return current;
           current = current.next;
       }
       return null;
    }
    public void addAfter(int after, int value){
       Node previous = find(after);
       if(previous == null) return;
       Node node = new Node(value);
       node.next = previous.next;
       if(previous.next != null)
           previous.next.prev = node;
       previous.next = node;
       node.prev = previous;
    }
   public void deleteIndex(int index){
       if(index < 0 || index >= this.size || this.size == 0)   return;
       if(index == 0){
           this.head.next.prev = null;
           this.head = this.head.next;
           this.size -= 1;
           return;
       }
       Node previous = this.head;
       for(int i = 0; i < index - 1; i++){
           previous = previous.next;
       }
       if(index == this.size - 1){
           previous.next = null;
//           previous = previous.prev;
           this.size -= 1;
           return;
       }
       previous.next.next.prev = previous;
       previous.next = previous.next.next;
       this.size -= 1;
   }
   public void display(){
       Node current = this.head;
       System.out.print("null <==> ");
       while(current != null){
           System.out.print(current.value + " <==> ");
           current = current.next;
       }
       System.out.println("null");
       System.out.println("Size : " + this.size);
   }
   public void displayFromLast(){
       Node current = this.head;
       while(current.next != null){
           current = current.next;
       }
       System.out.print("null <==> ");
       while(current != null){
           System.out.print(current.value + " <==> ");
           current = current.prev;
       }
       System.out.println("null");
       System.out.println("Size : " + this.size);
   }
}
