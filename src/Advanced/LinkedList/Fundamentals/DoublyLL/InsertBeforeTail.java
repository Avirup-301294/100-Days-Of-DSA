package LinkedList.Fundamentals.DoublyLL;

import LinkedList.Fundamentals.DoublyLL.utils.*;

public class InsertBeforeTail {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4};
        ListNode head = ConvertArrToDoublyLL.convertArrToDoublyLL(arr);

        System.out.println("Before head deletion");
        TraverseDLL.printDLL(head);

        System.out.println("\nAfter head deletion");
        ListNode insertBeforeTail = insertBeforeTail(head, 3);
        TraverseDLL.printDLL(insertBeforeTail);

        System.out.println("\n***************************");

        int[] arr2 = {4};
        ListNode head2 = ConvertArrToDoublyLL.convertArrToDoublyLL(arr2);

        System.out.println("Before head deletion");
        TraverseDLL.printDLL(head2);

        System.out.println("\nAfter head deletion");
        ListNode insertBeforeTail2 = insertBeforeTail(head2, 6);
        TraverseDLL.printDLL(insertBeforeTail2);
    }

    public static ListNode insertBeforeTail(ListNode head, int X) {
        // Your code goes here
        // Empty List check
        if(head == null) return new ListNode(X);

        // For single node
        if(head.next == null) {
            ListNode node = new ListNode(X);
            node.next = head;
            head.prev = node;
            head = node;
            return head;
        }

        // Else
        ListNode temp = head;
        ListNode prev = null;
        while(temp.next != null) {
            prev = temp;
            temp = temp.next;
        }

        // Now temp is at the tail and prev is pointing tail
        ListNode node = new ListNode(X);
        prev.next = node;
        node.prev = prev;
        node.next = temp;
        temp.prev = node;

        return head;
    }
}
