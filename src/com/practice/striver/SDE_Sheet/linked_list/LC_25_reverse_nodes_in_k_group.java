package com.practice.striver.SDE_Sheet.linked_list;
/**
 * Given the head of a linked list, reverse the nodes of the
 * list k at a time, and return the modified list.

 * k is a positive integer and is less than or equal to the
 * length of the linked list. If the number of nodes is not a
 * multiple of k then left-out nodes, in the end, should remain
 * as it is.

 * You may not alter the values in the list's nodes, only nodes
 * themselves may be changed.

 * Input: head = [1,2,3,4,5], k = 2
 * Output: [2,1,4,3,5]

 * Input: head = [1,2,3,4,5], k = 3
 * Output: [3,2,1,4,5]

 * Constraints:
 * The number of nodes in the list is n.
 * 1 <= k <= n <= 5000
 * 0 <= Node.val <= 1000

 * Follow-up: Can you solve the problem in O(1) extra memory space?
 */
public class LC_25_reverse_nodes_in_k_group {
    public static void main(String[] args) {
        int[] inArr1 = {1,2,3,4,5}, inArr2 = {1,2,3,4,5};
        int k1 = 2, k2 = 3;
        MyLinkedList list1 = makeList(inArr1);
        MyLinkedList list2 = makeList(inArr2);
        list1.print();
        list1.print(reverseKGroup(list1.head, k1));
        list2.print();
        list2.print(reverseKGroup(list2.head, k2));
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k == 1) return head;
        int n = findLength(head);
        ListNode dummy = new ListNode(-1, head);
        ListNode prev = dummy, next, curr;
        while(n >= k){
            curr = prev.next;
            next = curr.next;
            for(int i = 1; i < k; i++){
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = curr.next;
            }
            prev = curr;
            n -= k;
        }
        return dummy.next;
    }
    public static MyLinkedList makeList(int[] arr){
        MyLinkedList list = new MyLinkedList();
        for(int el : arr){
            list.addAtTail(el);
        }
        return list;
    }
    public static int findLength(ListNode node){
        int n = 0;
        while(node != null){
            n += 1;
            node = node.next;
        }
        return n;
    }
}
