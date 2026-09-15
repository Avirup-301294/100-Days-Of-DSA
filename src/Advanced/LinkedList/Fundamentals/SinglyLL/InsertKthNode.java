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
    Problem: Insertion at the Kth position of Linked List
    Given the head of a singly linked list and two integers X and K, 
    insert a node with value X as the kth node of the linked list and return the head of the modified list.

    Example 1
    Input: linkedList = [1, 2, 3], X = 5, K = 2
    Output: [1, 5, 2, 3]

    Example 2
    Input: linkedList = [], X = 7, K = 1
    Output: [7]
    Explanation: Note that the value of the head was changed.

    Example 3
    Input: linkedList = [1, 2], X = 15, K = 3
    Output: [1, 2, 15]
*/
public class InsertKthNode {
    public static void main(String[] args) {
        // Input: linkedList = [1, 2, 3], X = 5, K = 2
        int[] linkedList1 = {1, 2, 3};
        ListNode head1 = ConvertArrToLinkedList.convertArrToLL(linkedList1);
        head1 = insertAtKthPosition(head1, 5, 2);
        System.out.println(Traversal.LLTraversal(head1));

        // Input: linkedList = [], X = 7, K = 1
        int[] linkedList2 = {};
        ListNode head2 = ConvertArrToLinkedList.convertArrToLL(linkedList2);
        head2 = insertAtKthPosition(head2, 7, 1);
        System.out.println(Traversal.LLTraversal(head2));

        // Input: linkedList = [1, 2], X = 15, K = 3
        int[] linkedList3 = {1, 2};
        ListNode head3 = ConvertArrToLinkedList.convertArrToLL(linkedList3);
        head3 = insertAtKthPosition(head3, 15, 3);
        System.out.println(Traversal.LLTraversal(head3));
    }

    public static ListNode insertAtKthPosition(ListNode head, int X, int K) {
        if (head == null) {
            if (K == 1)
                return new ListNode(X);
            else
                return head;
        }
        if(K == 1) {
            return new ListNode(X, head);
        }

        ListNode temp = head;
        int cnt = 0;

        while (temp != null) {
            cnt++;
            if (cnt == K - 1) {
                ListNode newNode = new ListNode(X, temp.next);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
}
