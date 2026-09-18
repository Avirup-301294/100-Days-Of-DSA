package LinkedList.Fundamentals.DoublyLL;

import LinkedList.Fundamentals.DoublyLL.utils.*;

/*
    Problem: Removing given node in Doubly Linked List
    Given a node's reference within a doubly linked list, remove that node from the linked list while preserving the list's integrity.
    You will only be given the node's reference, not the head of the list. It is guaranteed that the given node will not be the head of the list.

    Example 1
    Input: head = [1, 3, 5], node = 3
    Output: [1, 5]
    Explanation: The referenced node with value 3 was removed.

    Example 2
    Input: head = [1, 3, 7], node = 7
    Output: head = [1, 3]
    Explanation: The referenced node with value 7 was removed.

*/

public class DeleteGivenNode {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9};
        ListNode head = ConvertArrToDoublyLL.convertArrToDoublyLL(arr);

        System.out.println("Before head deletion");
        TraverseDLL.printDLL(head);

        System.out.println("\nAfter head deletion");
        deleteGivenNode(head, 5);
        TraverseDLL.printDLL(head);

        System.out.println("\n*************************");

        int[] arr2 = new int[]{2, 5, 7};
        ListNode head2 = ConvertArrToDoublyLL.convertArrToDoublyLL(arr2);

        System.out.println("Before head deletion");
        TraverseDLL.printDLL(head2);

        System.out.println("\nAfter head deletion");    
        deleteGivenNode(head2, 7);
        TraverseDLL.printDLL(head2);
    }


    public static void deleteGivenNode(ListNode head, int node) {
        
        if(head == null) return;

        ListNode temp = head;
        ListNode prev = null;
        while(temp.data != node) {
            prev = temp;
            temp = temp.next;
        }

        if(temp.next != null) {
            temp = temp.next;
            prev.next = temp;
            temp.prev = prev;
        } else {
            prev.next = null;
        }
    }

    // public void deleteGivenNode(ListNode node) {
    //     // Your code goes here
    //     ListNode prev = node.prev;
    //     ListNode front = node.next;

    //     if(front == null) {
    //         prev.next = null;
    //         node.prev = null;
    //         return;
    //     }

    //     prev.next = front;
    //     front.prev = prev;

    //     // Set node's pointers to null
    //     node.next = null;
    //     node.prev = null;
    // }

}
