package com.practice.striver.SDE_Sheet.linked_list;
/**
 * Given the head of a linked list, rotate the list to the right by k places.

 * Input: head = [1,2,3,4,5], k = 2
 * Output: [4,5,1,2,3]

 * Input: head = [0,1,2], k = 4
 * Output: [2,0,1]

 * Constraints:
 * The number of nodes in the list is in the range [0, 500].
 * -100 <= Node.val <= 100
 * 0 <= k <= 2 * 109
 */
public class LC_61_rotate_list {
    public static void main(String[] args) {
        int[] inArr1 = {1,2,3,4,5}, inArr2 = {0, 1, 2};
        int k1 = 2, k2 = 4;
        MyLinkedList list1 = makeList(inArr1);
        MyLinkedList list2 = makeList(inArr2);
        System.out.println("Before rotation :");
        list1.print(); list2.print();
        System.out.println("After rotation :");
        list1.print(rotateRight(list1.head, k1));
        list2.print(rotateRight(list2.head, k2));
    }
    public static ListNode rotateRight(ListNode head, int k) {

        return null;
    }
    public static MyLinkedList makeList(int[] arr){
        MyLinkedList list = new MyLinkedList();
        for(int el : arr){
            list.addAtTail(el);
        }
        return list;
    }
}
