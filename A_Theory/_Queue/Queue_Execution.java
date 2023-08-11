package A_Theory._Queue;
import java.util.LinkedList;
import java.util.Queue;

// Queue = FIFO data structure. First-In First-Out
// A collection designed for holding elements prior to processing Linear data structure.

// .add() == offer(), enqueue; // use right side methods whenever possible
// .remove() == poll(), dequeue;
// .element() == peek()   // peek will not exeption
// .isEmpty();
// .size();
// .contains("obj");

// Where are queues useful?
// 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed),
// 2. Printer Queue (Print jobs should be completed in order),
// 3. Used in LinkedLists, PriorityQueues, Breath-first search.

public class Queue_Execution {
    public static void main(String[] args) {
        System.out.println();

        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty());
        // addition
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue);

        // to see who's at the head
        System.out.println(queue.peek());

        // to remove a element
        // queue.poll();
        // queue.poll();

        System.out.println(queue.element());

        // methods Queue inherits from Collections class
        System.out.println(queue.isEmpty());
        System.out.println(queue);

        System.out.println(queue.size());

        System.out.println(queue.contains("Harold"));
    }
}
