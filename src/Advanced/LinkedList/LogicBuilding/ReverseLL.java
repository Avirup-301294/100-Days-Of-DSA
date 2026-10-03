package LinkedList.LogicBuilding;

import LinkedList.Fundamentals.SinglyLL.utils.*;

/*
    Problem: Reverse a LL
    Given the head of a singly linked list. Reverse the given linked list and return the head of the modified list.

    Example 1:
    Input: head -> 1 -> 2 -> 3 -> 4 -> 5
    Output: head -> 5 -> 4 -> 3 -> 2 -> 1
    Explanation: All the links are reversed and the head now points to the last node of the original list.

    Example 2:
    Input: head -> 6 -> 8
    Output: head -> 8 -> 6
    Explanation: All the links are reversed and the head now points to the last node of the original list.
    This can be seen like: 6 <- 8 <- head.
*/
public class ReverseLL {
    public static void main(String[] args) {
        // Input: linkedList = [1,2,3,4,5]
        int[] linkedList1 = {1,2,3,4,5};
        ListNode head1 = ConvertArrToLinkedList.convertArrToLL(linkedList1);
        head1 = reverseList(head1);
        System.out.println(Traversal.LLTraversal(head1));

        // Input: linkedList = [6,8]
        int[] linkedList2 = {6,8};
        ListNode head2 = ConvertArrToLinkedList.convertArrToLL(linkedList2);
        head2 = reverseList(head2);
        System.out.println(Traversal.LLTraversal(head2));
    }

    public static ListNode reverseList(ListNode head) {

        ListNode temp = head;
        ListNode prev = null;

        while(temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }
}
