package LinkedList.Fundamentals.DoublyLL;

import LinkedList.Fundamentals.DoublyLL.utils.*;

public class InsertBeforeKthNode {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        ListNode head = ConvertArrToDoublyLL.convertArrToDoublyLL(arr);

        System.out.println("Before head deletion");
        TraverseDLL.printDLL(head);

        System.out.println("\nAfter head deletion");
        ListNode insertBeforeKthPosition = insertBeforeKthPosition(head, 7, 2);
        TraverseDLL.printDLL(insertBeforeKthPosition);
    }

    public static ListNode insertBeforeKthPosition(ListNode head, int X, int K) {
        // Your code goes here
        return null;
    }
}
