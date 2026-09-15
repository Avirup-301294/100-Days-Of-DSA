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
    Problem: Insertion at the head of Linked List
    Given the head of a singly linked list and an integer X, 
    insert a node with value X at the head of the linked list and return the head of the modified list.


    Example 1
    Input: linkedList = [1, 2, 3], X = 7
    Output: [7, 1, 2, 3]
    Explanation: 7 was added as the 1st node.

    Example 2
    Input: linkedList = [], X = 7
    Output: [7]
    Explanation: 7 was added as the 1st node.

    Example 3
    Input: [1, 3], X = 4
    Output: [4,1, 3]
*/
public class InsertHead {
    public static void main(String[] args) {
        // Input: linkedList = [1, 2, 3]
        int[] linkedList1 = {1, 2, 3};
        ListNode head1 = ConvertArrToLinkedList.convertArrToLL(linkedList1);
        head1 = insertAtHead(head1, 7);
        System.out.println(Traversal.LLTraversal(head1));

        // Input: linkedList = []
        int[] linkedList2 = {};
        ListNode head2 = ConvertArrToLinkedList.convertArrToLL(linkedList2);
        head2 = insertAtHead(head2, 7);
        System.out.println(Traversal.LLTraversal(head2));
    }

    public static ListNode insertAtHead(ListNode head, int X) {
        ListNode node = new ListNode(X);
        node.next = head;
        head = node;
        return head;
    }
}
