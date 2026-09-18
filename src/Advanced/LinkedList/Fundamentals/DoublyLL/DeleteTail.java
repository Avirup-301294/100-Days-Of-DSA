package LinkedList.Fundamentals.DoublyLL;

import LinkedList.Fundamentals.DoublyLL.utils.*;

/*
    Problem: Delete Tail of Doubly Linked List
    Given the head of a doubly linked list, remove the node at the tail of the linked list and return the head of the modified list.
    The tail is the last node of the linked list.

    Example 1
    Input: head = [1, 2, 3]
    Output: head = [1, 2]
    Explanation: The node with value 3 was removed.
    Example 2
    Input: head = [7]
    Output: head = [ ]
    Explanation: Note that the head has null value after the removal.
*/
public class DeleteTail {
    public static void main(String[] args) {
        int[] arr = {2,5,6,8};
        ListNode head = ConvertArrToDoublyLL.convertArrToDoublyLL(arr);

        System.out.println("Before Tail deletion");
        TraverseDLL.printDLL(head);

        System.out.println("\nAfter Tail deletion");
        ListNode deleteTail = deleteTail(head);
        TraverseDLL.printDLL(deleteTail);
    }

    static ListNode deleteTail(ListNode head) {
        if(head == null || head.next == null) return null;

        ListNode tail = head;
        while(tail.next != null) {
            tail = tail.next;
        }

        // At this point tail is pointing to the last node
        ListNode newTail = tail.prev;
        newTail.next = null;
        tail.prev = null;
        return head;
    }

}
