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
    Problem: Deletion of the Kth element of Linked List
    Given the head of a singly linked list and an integer k, delete the kth node of the linked list and return the head of the modified list.

    Example 1
    Input: linkedList = [3, 4, 5], k = 2
    Output: linkedList = [3, 5]
    Explanation: The 2nd node with value 4 was removed.

    Example 2
    Input: linkedList = [1, 2, 3], k = 1
    Output: [2, 3]
    Explanation: The 1st Node was removed, note that the value of the head has changed.

    Example 3
    Input: linkedList = [7, 7, 7], k = 3
    Output: [7, 7]
*/
public class DeleteKthNode {
    public static void main(String[] args) {
        // Input: linkedList = [1, 2, 3]
        int[] linkedList1 = {1, 2, 3};
        ListNode head1 = ConvertArrToLinkedList.convertArrToLL(linkedList1);
        head1 = deleteKthNode(head1, 1);
        System.out.println(Traversal.LLTraversal(head1));

        // Input: linkedList = [1]
        int[] linkedList2 = {3,4,5};
        ListNode head2 = ConvertArrToLinkedList.convertArrToLL(linkedList2);
        head2 = deleteKthNode(head2,2);
        System.out.println(Traversal.LLTraversal(head2));

        // Input: linkedList = [7,7,7]
        int[] linkedList3 = {7,7,7};
        ListNode head3 = ConvertArrToLinkedList.convertArrToLL(linkedList3);
        head3 = deleteKthNode(head3,3);
        System.out.println(Traversal.LLTraversal(head3));
    }

    public static ListNode deleteKthNode(ListNode head, int k) {
        // your code goes here
        if(head == null) return null;
        
        if(k == 1) { // delete head
            head = head.next;
            return head;
        }
        ListNode temp = head;
        for(int i = 1; temp != null && i < k-1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) return head;
        ListNode next = temp.next.next;
        temp.next = next;
        return head;
    }

}
