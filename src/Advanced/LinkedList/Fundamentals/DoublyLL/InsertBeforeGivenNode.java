package LinkedList.Fundamentals.DoublyLL;

import LinkedList.Fundamentals.DoublyLL.utils.*;

/*
    Problem: Insert before given node in Doubly Linked List
    Given a node's reference within a doubly linked list and an integer X, 
    insert a node with value X before the given node in the linked list while preserving the list's integrity.

    You will only be given the node's reference, not the head of the list. 
    It is guaranteed that the given node will not be the head of the list.

    Example 1:
    Input: head = [1, 2, 6], node = 6, X = 7
    Output: head = [1, 2, 7, 6]
    Explanation: Note that the head was not given to the function.

    Example 2:
    Input: head = [7, 5, 15], node = 5, X = 10
    Output: head = [7, 10, 5, 15]
    Explanation: The node with value 5 was referenced, thus the new node was added before the given node.
*/
public class InsertBeforeGivenNode {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6};
        ListNode head = ConvertArrToDoublyLL.convertArrToDoublyLL(arr);

        System.out.println("Before insertion");
        TraverseDLL.printDLL(head);

        ListNode node1 = head.next.next;
        System.out.println("\nAfter insertion before node { " + node1.data + " }");
        insertBeforeGivenNode(head, node1, 7);
        TraverseDLL.printDLL(head);

        System.out.println("\n**************************");

        int[] arr2 = {7,5,15};
        ListNode head2 = ConvertArrToDoublyLL.convertArrToDoublyLL(arr2);

        System.out.println("Before insertion");
        TraverseDLL.printDLL(head);

        ListNode node2 = head2.next;
        System.out.println("\nAfter insertion before node { " + node2.data + " }");
        insertBeforeGivenNode(head2, node2, 7);
        TraverseDLL.printDLL(head2);
    }
    
    public static void insertBeforeGivenNode(ListNode head, ListNode node, int X) {
        // Get node before the given node
        ListNode prev = node.prev;
 
        // Create new node
        ListNode newNode = new ListNode(X, prev, node);
 
        // Connect newNode
        prev.next = newNode;
        node.prev = newNode;
 
        return;
    }
}
