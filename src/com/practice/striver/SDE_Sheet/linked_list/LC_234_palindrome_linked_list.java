package com.practice.striver.SDE_Sheet.linked_list;
/**
 * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

 * Input: head = [1,2,2,1]
 * Output: true

 * Input: head = [1,2]
 * Output: false

 * Constraints:
 * The number of nodes in the list is in the range [1, 10^5].
 * 0 <= Node.val <= 9
 * Follow up: Could you do it in O(n) time and O(1) space?
 */
public class LC_234_palindrome_linked_list {
    public static void main(String[] args) {
        int[] inArr1 = {1, 2, 2, 1}, inArr2 = {1, 2};
        MyLinkedList list1 = makeList(inArr1);
        MyLinkedList list2 = makeList(inArr2);
        list1.print();
        list2.print();
        System.out.println("Is list1 palindrome : "+isPalindrome(list1.head));
        System.out.println("Is list2 palindrome : "+isPalindrome(list2.head));
    }
    public static boolean isPalindrome(ListNode head) {
        ListNode mid = findMiddle(head);
        ListNode prev = mid;
        mid = mid.next;
        prev.next = null;
        mid = reverse(mid, prev);
        while(mid != null){    // comparing
            if(head.val != mid.val)    return false;
            head = head.next;
            mid = mid.next;
        }
        return true;
    }
    public static ListNode findMiddle(ListNode head){
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static ListNode reverse(ListNode node, ListNode prev){
        ListNode dummy = prev;
        ListNode nextNode;
        while(node != null){
            nextNode = node.next;
            node.next = dummy;
            dummy = node;
            node = nextNode;
        }
        return dummy;
    }
    public static MyLinkedList makeList(int[] arr){
        MyLinkedList list = new MyLinkedList();
        for(int el : arr){
            list.addAtTail(el);
        }
        return list;
    }
}
