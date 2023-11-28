package com.practice.striver.SDE_Sheet.linked_list;
/**
 * Given the head of a linked list, return the node where the
 * cycle begins. If there is no cycle, return null.

 * There is a cycle in a linked list if there is some node in
 * the list that can be reached again by continuously following
 * the next pointer. Internally, pos is used to denote the index
 * of the node that tail's next pointer is connected to
 * (0-indexed). It is -1 if there is no cycle. Note that pos is
 * not passed as a parameter.

 * Do not modify the linked list.

 * Input: head = [3,2,0,-4], pos = 1
 * Output: tail connects to node index 1
 * Explanation: There is a cycle in the linked list, where tail
 * connects to the second node.

 * Input: head = [1,2], pos = 0
 * Output: tail connects to node index 0
 * Explanation: There is a cycle in the linked list, where tail
 * connects to the first node.

 * Input: head = [1], pos = -1
 * Output: no cycle
 * Explanation: There is no cycle in the linked list.

 * Constraints:

 * The number of the nodes in the list is in the range [0, 10^4].
 * -10^5 <= Node.val <= 10^5
 * pos is -1 or a valid index in the linked-list.

 * Follow up: Can you solve it using O(1) (i.e. constant) memory?
 */
public class LC_142_linked_list_cycle_II {
    public static void main(String[] args) {
        int[] inArr1 = {3,2,0,-4}, inArr2 = {1,2}, inArr3 = {1};
        int pos1 = 1, pos2 = 0, pos3 = -1;
        MyLinkedList list1 = makeList(inArr1, pos1);
        MyLinkedList list2 = makeList(inArr2, pos2);

        System.out.println("Cycle for list1 detect at : ");
        list1.print(detectCycle(list1.head));
        System.out.print("Cycle for list2 detect at : ");
        list2.print(detectCycle(list2.head));

    }
    public static ListNode detectCycle(ListNode head) {
        if(head == null || head.next != null)   return head;
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)   break;
        }
        ListNode start = head;
        while(start != slow){
            start = start.next;
            slow = slow.next;
        }
        return start;
    }
    public static MyLinkedList makeList(int[] arr, int pos){
        if(arr.length == 0 || pos < 0)  return null;
        pos = pos % arr.length;
        MyLinkedList list = new MyLinkedList();
        for(int el : arr){
            list.addAtTail(el);
        }
        ListNode temp = list.head, target = list.head;
//       arr = [3, 2, 0, -4], pos = 1;
        while(temp.next != null){
            temp = temp.next;
        }
        while(pos > 0){
            target = target.next;
            pos -= 1;
        }
        temp.next = target;
//        list.print();
        return list;
    }
}
