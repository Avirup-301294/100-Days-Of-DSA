package LinkedList.Fundamentals.DoublyLL;
import LinkedList.Fundamentals.DoublyLL.utils.*;

/*
    Problem: Delete head of Doubly Linked List
    Given the head of a doubly linked list, remove the node at the head of the linked list and return the head of the modified list.
    The head is the first node of the linked list.

    Example 1
    Input: doublyLinkedList = [1, 2, 3]
    Output: [2, 3]
    Explanation: The node with value 1 was removed.

    Example 2
    Input: doublyLinkedList = [7]
    Output: [ ]
    Explanation: Note that the head has null value after the removal.
*/
public class DeleteHead {
    public static void main(String[] args) {
        int[] arr = {2,5,6,8};
        ListNode head = ConvertArrToDoublyLL.convertArrToDoublyLL(arr);

        System.out.println("Before head deletion");
        TraverseDLL.printDLL(head);

        System.out.println("\nAfter head deletion");
        ListNode deleteHead = deleteHead(head);
        TraverseDLL.printDLL(deleteHead);
    }

    static ListNode deleteHead(ListNode head) {
        if(head == null || head.next == null) return null;

        ListNode temp = head;
        head = head.next; // pointing head to next node
        head.prev = null; // now head.next is the new head, so head.prev should be null
        temp.next = null; // As temp is pointing to head.next, so temp.next should be null
        return head;
    }
}
