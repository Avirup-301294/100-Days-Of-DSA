package LinkedList.Fundamentals.DoublyLL;

import LinkedList.Fundamentals.DoublyLL.utils.*;

/*
    Problem: Reverse a Doubly Linked List

    You are given the head of a doubly linked list.
    Reverse the list in-place and return the new head of the reversed list.

    Example 1:
    Input: head = [10, 20, 30]
    Output: [30, 20, 10]

    Example 2:
    Input: head = [1, 3, 5, 7, 9]
    Output: [9, 7, 5, 3, 1]
*/
public class ReverseDLL {
    public static void main(String[] args) {

        // Input: head = [10, 20, 30]
        int[] arr = {10, 20, 30};
        ListNode head = ConvertArrToDoublyLL.convertArrToDoublyLL(arr);

        System.out.println("Before reverse");
        TraverseDLL.printDLL(head);

        System.out.println("\nAfter reverse");
        ListNode reverseList1 = reverseDLL(head);
        TraverseDLL.printDLL(reverseList1);

        System.out.println("\n***************************");

        // Input: head = [1, 3, 5, 7, 9]

        int[] arr2 = {1, 3, 5, 7, 9};
        ListNode head2 = ConvertArrToDoublyLL.convertArrToDoublyLL(arr2);

        System.out.println("Before reverse");
        TraverseDLL.printDLL(head2);

        System.out.println("\nAfter reverse");
        ListNode reverseList2 = reverseDLL(head2);
        TraverseDLL.printDLL(reverseList2);
    }

    public static ListNode reverseDLL(ListNode head) {
        // Current pointer
        ListNode current = head;
        // Temporary pointer for swapping
        ListNode temp = null;
 
        // Traverse the list
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
 
        // Set new head
        if (temp != null)
            head = temp.prev;
 
        return head;
    }
}