package LinkedList.Fundamentals.DoublyLL;

import LinkedList.Fundamentals.DoublyLL.utils.*;

public class InsertBeforeHead {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ListNode head = ConvertArrToDoublyLL.convertArrToDoublyLL(arr);

        System.out.println("Before head deletion");
        TraverseDLL.printDLL(head);

        System.out.println("\nAfter head deletion");
        ListNode insertBeforeHead = insertBeforeHead(head, 3);
        TraverseDLL.printDLL(insertBeforeHead);

        System.out.println("\n***************************");

        int[] arr2 = {5};
        ListNode head2 = ConvertArrToDoublyLL.convertArrToDoublyLL(arr2);

        System.out.println("Before head deletion");
        TraverseDLL.printDLL(head2);

        System.out.println("\nAfter head deletion");
        ListNode insertBeforeHead2 = insertBeforeHead(head2, 7);
        TraverseDLL.printDLL(insertBeforeHead2);
    }

    public static ListNode insertBeforeHead(ListNode head, int data) {
        // Your code goes here

        ListNode node = new ListNode(data);
        
        if(head == null) return node;

        node.next = head;
        head.prev = node;
        head = node;

        return head;
        
    }
}
