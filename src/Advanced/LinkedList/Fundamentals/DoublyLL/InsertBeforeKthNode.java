package LinkedList.Fundamentals.DoublyLL;

import LinkedList.Fundamentals.DoublyLL.utils.*;
/*
    // Definition for a Node.
    class ListNode {
        public int data;
        public ListNode prev;
        public ListNode next;
        public ListNode();
        public ListNode(int data);
        public ListNode(int data, ListNode prev, ListNode next);
    };
*/

public class InsertBeforeKthNode {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        ListNode head = ConvertArrToDoublyLL.convertArrToDoublyLL(arr);

        System.out.println("Before insertion");
        TraverseDLL.printDLL(head);

        System.out.println("\nAfter insertion");
        ListNode insertBeforeKthPosition = insertBeforeKthPosition(head, 7, 2);
        TraverseDLL.printDLL(insertBeforeKthPosition);

        System.out.println("\n\n*********************\n\n");

        int[] arr2 = {5};
        ListNode head2 = ConvertArrToDoublyLL.convertArrToDoublyLL(arr2);

        System.out.println("Before insertion");
        TraverseDLL.printDLL(head2);

        System.out.println("\nAfter insertion");
        ListNode insertBeforeKthPosition2 = insertBeforeKthPosition(head2, 7, 1);
        TraverseDLL.printDLL(insertBeforeKthPosition2);
    }

    public static ListNode insertBeforeKthPosition(ListNode head, int X, int k) {
        if(k == 1) {
            // if head is null
            if(head == null) return new ListNode(X);
            else {
                ListNode node = new ListNode(X);
                node.next = head;
                head.prev = node;
                head = node;
                return head;
            }
        }

        ListNode temp = head; int cnt = 0;

        while(temp != null) {
            cnt++;
            if(cnt == k) break;
            temp = temp.next;
        }

        ListNode back = temp.prev;
        ListNode node = new ListNode(X);
        node.next = temp;
        node.prev = back;
        back.next = node;
        temp.prev = node;
        
        return head;
    }
}
