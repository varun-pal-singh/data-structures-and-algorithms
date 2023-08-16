package A_Theory.LinkedList;
import java.util.*;

// LinkedList = stores Nodes in 2 parts (data + address)
// Nodes are in non-consecutive memory locations
// Elements are linked using pointers

// Singly Linked List
// Node             Node            Node

public class LinkedList_Execution {
    public static void main(String[] args) {
        System.out.println();

        LinkedList<String> list = new LinkedList<String>();

        String[] arr = {"A", "B", "C", "D", "F"};

        for(int i=0; i<arr.length; i++){
            // list.push(arr[i]);
            list.offer(arr[i]);
        }
        System.out.println(list);

        // list.pop();
        // list.poll(); use poll where ever possible in place of pop;

        list.add((list.lastIndexOf("F")), "E");

        System.out.println(list.remove("b"));
        System.out.println(list.remove("B"));

        System.out.println(list.size());
        System.out.println(list.indexOf("D"));

        System.out.println("Simple Peek : " + list.peek());
        System.out.println("Peek First : " + list.peekFirst());
        System.out.println("Peek last : "+list.peekLast());

        list.addFirst("Z");
        list.addLast("G");

        System.out.println("index of first element : " + list.indexOf("Z"));

        System.out.println(list);

        list.removeFirst();
        list.removeLast();

        System.out.println(list);
    }
}
