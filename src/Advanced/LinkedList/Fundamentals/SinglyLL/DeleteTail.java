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
    Problem: Deletion of the tail of Linked List
    Given the head of a singly linked list, delete the tail of the linked list and return the head of the modified list.

    The tail is the last node of the linked list.

    Example 1
    Input: linkedList = [1, 2, 3]
    Output: [1, 2]
    Explanation: The last node was removed.

    Example 2
    Input: linkedList = [1]
    Output: []
    Explanation: Note that the value of head is null here.

    Example 3
    Input: linkedList = [7, 8]
    Output: [7]
*/
public class DeleteTail {
    public static void main(String[] args) {
        // Input: linkedList = [1, 2, 3]
        int[] linkedList1 = {1, 2, 3};
        ListNode head1 = ConvertArrToLinkedList.convertArrToLL(linkedList1);
        head1 = deleteTail(head1);
        System.out.println(Traversal.LLTraversal(head1));

        // Input: linkedList = [1]
        int[] linkedList2 = {1};
        ListNode head2 = ConvertArrToLinkedList.convertArrToLL(linkedList2);
        head2 = deleteTail(head2);
        System.out.println(Traversal.LLTraversal(head2));

    }

    public static ListNode deleteTail(ListNode head) {
        // your code goes here
        if(head == null || head.next == null) return null; 
        
        // traverse to the 2nd last element of the list
        ListNode temp = head;
        while(head.next.next != null) {
            head = head.next;
        }

        head.next = null;
        head = temp;
        return head;
    }
}
