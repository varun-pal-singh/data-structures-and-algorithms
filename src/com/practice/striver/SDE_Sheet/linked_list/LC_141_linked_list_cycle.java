package com.practice.striver.SDE_Sheet.linked_list;
/**
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.

 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

 * Return true if there is a cycle in the linked list. Otherwise, return false.

 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list, where the
 * tail connects to the 1st node (0-indexed).

 * Input: head = [1,2], pos = 0
 * Output: true
 * Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

 * Input: head = [1], pos = -1
 * Output: false
 * Explanation: There is no cycle in the linked list.

 * Constraints:
 * The number of the nodes in the list is in the range [0, 10^4].
 * -10^5 <= Node.val <= 10^5
 * pos is -1 or a valid index in the linked-list.

 * Follow up: Can you solve it using O(1) (i.e. constant) memory?
 */
public class LC_141_linked_list_cycle {
    public static void main(String[] args) {
        int[] inArr1 = {3,2,0,-4}, inArr2 = {1, 2}, inArr3 = {1};
        int pos1 = 1, pos2 = 0, pos3 = 0;
        MyLinkedList list1 = getInputList(inArr1, pos1);
        MyLinkedList list2 = getInputList(inArr2, pos2);
        MyLinkedList list3 = getInputList(inArr3, pos3);

//        assert list1 != null;
//        assert list2 != null;
        System.out.println("list1 has cycle ? : "+ hasCycle(list1.head));
        System.out.println("list2 has cycle ? : "+ hasCycle(list2.head));
        System.out.println("list3 has cycle ? : "+ hasCycle(list3.head));

    }
    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)   return false;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)    return true;
        }
        return false;
    }
    public static MyLinkedList getInputList(int[] inArr, int pos){
        if(pos < 0 || pos >= inArr.length)  return null;
        MyLinkedList list = new MyLinkedList();
        for (int el : inArr) {
            list.addAtTail(el);
        }
        ListNode target = null;
        ListNode cnt = list.head;
        while(pos >= 0){
            if(pos == 0){
                target = cnt;
                break;
            }
            cnt = cnt.next;
            pos -= 1;
        }
        assert target != null;
        System.out.println("target node : "+target.val);
        ListNode temp = list.head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = target;
        return list;
    }
}
