package LinkedList.Fundamentals.SinglyLL;

import LinkedList.Fundamentals.SinglyLL.utils.*;

/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

/*
    Problem: Insertion at the tail of Linked List
    Given the head of a singly linked list and an integer X, 
    insert a node with value X at the tail of the linked list and return the head of the modified list.

    Example 1
    Input: linkedList = [1, 2, 3], X = 7
    Output: [1, 2, 3, 7]
    Explanation: 7 was added as the last node.

    Example 2
    Input: linkedList = [], X = 0
    Output: [0]
    Explanation: 0 was added as the last/only node.

    Example 3
    Input: linkedList = [5, 6], X = 8
    Output: [5, 6, 8]

*/

public class InsertTail {
    public static void main(String[] args) {
        // Input: linkedList = [1, 2, 3]
        int[] linkedList1 = {1, 2, 3};
        ListNode head1 = ConvertArrToLinkedList.convertArrToLL(linkedList1);
        head1 = insertAtTail(head1, 7);
        System.out.println(Traversal.LLTraversal(head1));

        // Input: linkedList = []
        int[] linkedList2 = {};
        ListNode head2 = ConvertArrToLinkedList.convertArrToLL(linkedList2);
        head2 = insertAtTail(head2, 0);
        System.out.println(Traversal.LLTraversal(head2));

        // Input: linkedList = [5, 6]
        int[] linkedList3 = {5, 6};
        ListNode head3 = ConvertArrToLinkedList.convertArrToLL(linkedList3);
        head3 = insertAtTail(head3, 8);
        System.out.println(Traversal.LLTraversal(head3));
    }

    public static ListNode insertAtTail(ListNode head, int X) {
        ListNode node = new ListNode(X);

        // Contain null
        if(head == null) {
            return node;
        }
        
        ListNode temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;

        return head;
    }
}
