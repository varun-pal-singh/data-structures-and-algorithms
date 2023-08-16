package A_Theory.Queue._Priority_Queue;
import java.util.*;

// Priority Queue = A FIFO data structure that serves elements
//                  with the highest priority first before
//                  elements with lower priority

public class PriorityQueue_Execution {
    public static void main(String[] args) {
        System.out.println();

        Queue<String> queue = new LinkedList<String>();
        Queue<String> pQueue = new PriorityQueue<String>();
        Queue<String> pQueueR = new PriorityQueue<String>(Collections.reverseOrder());

        // double[] arr = {3.0, 2.5, 6.5, 4.5, 1.5, 2.0};
        String[] arr = {"E", "A", "C", "D", "B", "a"};

        for(int i=0; i<arr.length; i++){
            queue.offer(arr[i]);
            pQueue.offer(arr[i]);
            pQueueR.offer(arr[i]);
        }

        System.out.println("Queue : "+ queue); // this will print the queue in order that its gets elements, [E, A, C, D, B, a];

        System.out.println("Priority Queue : "+ pQueue); // this will print PriorityQueue in some wage sorted order, [A, B, C, E, D, a];

        System.out.println("Reversed Priority Queue : "+ pQueueR); // this will print the PriorityQueue in reverse order, [a, D, E, A, B, C];

        System.out.println();

        while(!queue.isEmpty()){
            System.out.println(queue.poll()); // this will print Queue Elements in order they added.
        }
        System.out.println();

        while(!pQueue.isEmpty()){
            System.out.println(pQueue.poll()); // this will print PriorityQueue Elements in sorted form first A then B to a
        }
        System.out.println();

        while(!pQueueR.isEmpty()){
            System.out.println(pQueueR.poll()); // this will print PriorityQueue Elements in reversed sorted form first a then E to A 
        }
        System.out.println();
    }
}

