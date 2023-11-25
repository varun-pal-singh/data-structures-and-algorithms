package com.practice.striver.SDE_Sheet.linked_list;
import com.practice.striver.SDE_Sheet.linked_list.MyLinkedList.ListNode;
/**
 * Given the head of a singly linked list, reverse the list, and
 * return the reversed list.

 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]

 * Input: head = [1,2]
 * Output: [2,1]

 * Input: head = []
 * Output: []

 * Constraints:
 * The number of nodes in the list is the range [0, 5000].
 * -5000 <= Node.val <= 5000

 * Follow up: A linked list can be reversed either iteratively
 * or recursively. Could you implement both?
 */
public class LC_206_reverse_a_singly_linked_list {
    public static void main(String[] args) {
        MyLinkedList list1 = new MyLinkedList();
        MyLinkedList list2 = new MyLinkedList();
        int[] inputArr1 = {1,2,3,4,5}, inputArr2 = {1,2};
        for (int el : inputArr1) {
            list1.addAtTail(el);
        }
        for(int el : inputArr2){
            list2.addAtTail(el);
        }
        System.out.println(reverseList(list1.head));
    }
    public static ListNode reverseList(ListNode head) {
        ListNode curr = head;
        return null;
    }
}
