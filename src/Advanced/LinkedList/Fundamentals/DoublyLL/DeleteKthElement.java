package LinkedList.Fundamentals.DoublyLL;

import LinkedList.Fundamentals.DoublyLL.utils.*;

/*
    Problem:Delete Kth Element of Doubly Linked List
    Given the head of a doubly linked list and an integer k, remove the node at the kth position of the linked list and return the head of the modified list.
    Example 1
    Input: head = [2, 5, 7, 9], k = 2
    Output: head = [2, 7, 9]
    Explanation: The node with value 5 was removed.

    Example 2
    Input: head = [2, 5, 7], k = 1
    Output: head = [5, 7]
    Explanation: The node with value 2 was removed, note that the head was modified.
*/
public class DeleteKthElement {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9};
        ListNode head = ConvertArrToDoublyLL.convertArrToDoublyLL(arr);

        System.out.println("Before head deletion");
        TraverseDLL.printDLL(head);

        System.out.println("\nAfter head deletion");
        ListNode deleteKthElement = deleteKthElement(head,2);
        TraverseDLL.printDLL(deleteKthElement);

        System.out.println("\n*************************");

        int[] arr2 = new int[]{2, 5, 7};
        ListNode head2 = ConvertArrToDoublyLL.convertArrToDoublyLL(arr2);

        System.out.println("Before head deletion");
        TraverseDLL.printDLL(head2);

        System.out.println("\nAfter head deletion");
        ListNode deleteKthElement2 = deleteKthElement(head2,1);
        TraverseDLL.printDLL(deleteKthElement2);
    }

    // public static ListNode deleteKthElement(ListNode head, int k) {
    //     if(head == null) return null;

    //     if(k == 1) {
    //         head = head.next;
    //         head.prev = null;
    //         return head;
    //     }

    //     ListNode temp = head;
    //     ListNode prev = head;

    //     for(int i = 1; i <= k; i++) {
    //         temp = temp.next;
    //     }


    //     while(prev.next.next != temp) {
    //         prev = prev.next;
    //     }

    //     prev.next = temp;
    //     temp.prev = prev;

    //     return head;

    // }

    public static ListNode deleteKthElement(ListNode head, int k) {
        // If the list is empty, return null
        if (head == null) 
            return null;
    
        int count = 0;
        ListNode kNode = head;

        // Traverse the list
        while (kNode != null) {
            count++;
            if (count == k) break;
            kNode = kNode.next;
        }

        // If k is larger than the list size
        if (kNode == null) return head; 
        
        // Update the pointers
        ListNode prev = kNode.prev;
        ListNode front = kNode.next;

        // If node to be deleted is the only node in the list
        if (prev == null && front == null) {
            return null;
        }
        
        // If node to be deleted is head of the list
        else if (prev == null) {
            head = front;
            front.prev = null;
        }
        
        // If node to be deleted is tail of the list
        else if (front == null) {
            prev.next = null;
        }
        
        // If node to be deleted is in the middle of the list
        else {
            prev.next = front;
            front.prev = prev;
        }

        // Return modified list head
        return head;
    }
}
