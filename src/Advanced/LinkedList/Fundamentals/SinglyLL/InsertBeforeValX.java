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
Insertion before the value X in Linked List
    Given the head of a singly linked list and two integers X and val.

    Insert a node with value val before the node with value X in the linked list and return the head of the modified list.

    Example 1
    Input: linkedList = [1, 2, 3], X = 2, val = 5
    Output: [1, 5, 2, 3]
    Explanation: The node with value 5 was added before the node with value 2

    Example 2
    Input: linkedList = [1, 2, 3], X = 7, val = 5
    Output: [1, 2, 3]
    Explanation: No node was added as X was not found in the list.

    Example 3
    Input: linkedList = [1], X = 1, val = 10
    Output: [10, 1]
*/
public class InsertBeforeValX {
    public static void main(String[] args) {
        // Input: linkedList = [1, 2, 3], X = 2, val = 5
        int[] linkedList1 = {1, 2, 3};
        ListNode head1 = ConvertArrToLinkedList.convertArrToLL(linkedList1);
        head1 = insertBeforeX(head1, 2, 5);
        System.out.println(Traversal.LLTraversal(head1));

        // Input: linkedList = [1, 2, 3], X = 7, val = 5
        int[] linkedList2 = {1,2,3};
        ListNode head2 = ConvertArrToLinkedList.convertArrToLL(linkedList2);
        head2 = insertBeforeX(head2, 7, 5);
        System.out.println(Traversal.LLTraversal(head2));

        // Input: linkedList = [1], X = 1, val = 10
        int[] linkedList3 = {1};
        ListNode head3 = ConvertArrToLinkedList.convertArrToLL(linkedList3);
        head3 = insertBeforeX(head3, 1, 10);
        System.out.println(Traversal.LLTraversal(head3));
    }

    public static ListNode insertBeforeX(ListNode head, int X, int val) {
        if (head == null) {
            return null;
        }
        if (head.data == X)
            return new ListNode(val, head);

        ListNode temp = head;
        while (temp.next != null) {
            if (temp.next.data == X) {
                ListNode newNode = new ListNode(val, temp.next);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    
}
