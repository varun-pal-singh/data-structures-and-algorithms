package com.practice.striver.SDE_Sheet.linked_list;
/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.

 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]

 * Input: list1 = [], list2 = []
 * Output: []

 * Input: list1 = [], list2 = [0]
 * Output: [0]

 * Constraints:
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both list1 and list2 are sorted in non-decreasing order.
 */
public class LC_21_merge_two_sorted_lists {
    public static void main(String[] args) {
        int[] inArr1 = {2, 4}, inArr2 = {1, 3, 5};
        MyLinkedList list1 = makeList(inArr1), list2 = makeList(inArr2);
        System.out.println("Before");
        list1.print();
        list2.print();
        System.out.println("After");
        list1.print(mergeTwoLinkedLists(list1.head, list2.head));
    }
    public static ListNode mergeTwoLinkedLists(ListNode list1, ListNode list2){
        // [2, 4], [1, 3, 5];
        if(list1 == null)   return list2;
        if(list2 == null)   return list1;
        if(list1.val > list2.val){
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        ListNode result = list1;
        while(list1 != null && list2 != null){
            ListNode temp = null;
            while(list1 != null && list1.val <= list2.val){
                temp = list1;
                list1 = list1.next;
            }
            temp.next = list2;

            // swap
            ListNode swap = list1;
            list1 = list2;
            list2 = swap;
        }
        return result;
    }
    public static MyLinkedList makeList(int[] arr){
        MyLinkedList list = new MyLinkedList();
        for(int el : arr){
            list.addAtTail(el);
        }
        return list;
    }
}
