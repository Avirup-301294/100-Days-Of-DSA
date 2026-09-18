package LinkedList.Fundamentals.DoublyLL;

import LinkedList.Fundamentals.DoublyLL.utils.*;

public class InsertBeforeGivenNode {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6};
        ListNode head = ConvertArrToDoublyLL.convertArrToDoublyLL(arr);

        System.out.println("Before head deletion");
        TraverseDLL.printDLL(head);

        System.out.println("\nAfter head deletion");
        insertBeforeGivenNode(head, 6, 7);
        TraverseDLL.printDLL(head);

        System.out.println("\n**************************");

        int[] arr2 = {1, 2, 6};
        ListNode head2 = ConvertArrToDoublyLL.convertArrToDoublyLL(arr2);

        System.out.println("Before head deletion");
        TraverseDLL.printDLL(head);

        System.out.println("\nAfter head deletion");
        insertBeforeGivenNode(head2, 6, 7);
        TraverseDLL.printDLL(head2);
    }
    
    public static void insertBeforeGivenNode(ListNode head, int node, int X) {
        // Your code goes here
        return;
    }
}
