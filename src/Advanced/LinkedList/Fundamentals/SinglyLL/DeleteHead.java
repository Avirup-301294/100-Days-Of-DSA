package LinkedList.Fundamentals.SinglyLL;

import LinkedList.Fundamentals.SinglyLL.utils.*;

/*
Defination of linked list
class ListNode {
    int data;
    ListNode next;

    ListNode() {
        this.data = 0;
        this.next = null;
    }

    ListNode(int x) {
        this.data = x;
        this.next = null;
    }

    ListNode(int x, ListNode next) {
        this.data = x;
        this.next = next;
    }
}
*/

/*
    Problem: Deletion of the head of LL
    Given the head of a singly linked list, delete the head of the linked list and return the head of the modified list. 
    The head is the first node of the linked list.

    Note : Please note that this section might seem a bit difficult without prior knowledge on what linkedList is, 
    we will soon try to add basics concepts for your ease! If you know the concepts already please go ahead to give a shot to the problem. Cheers!


    Example 1
    Input: linkedList = [1, 2, 3]
    Output: [2, 3]
    Explanation: The first node was removed.

    Example 2
    Input: linkedList = [1]
    Output: []
    Explanation: Note that the head of the linked list gets changed.

    Example 3
    Input: linkedList = [7, 8]
    Output: [8]
*/
public class DeleteHead {
    public static void main(String[] args) {
        // Input: linkedList = [1, 2, 3]
        int[] linkedList1 = {1, 2, 3};
        ListNode head1 = ConvertArrToLinkedList.convertArrToLL(linkedList1);
        head1 = deleteHead(head1);
        System.out.println(Traversal.LLTraversal(head1));

        // Input: linkedList = [1]
        int[] linkedList2 = {1};
        ListNode head2 = ConvertArrToLinkedList.convertArrToLL(linkedList2);
        head2 = deleteHead(head2);
        System.out.println(Traversal.LLTraversal(head2));

    }

    public static ListNode deleteHead(ListNode head) {
        // your code goes here
        if(head == null || head.next == null) return null;
        head = head.next;
        return head;
    }
    
    public ListNode deleteHead2(ListNode head) {
        if (head == null)  return null;
        ListNode temp = head;
        head = head.next; 
        temp = null;         
        return head;
    }
}
