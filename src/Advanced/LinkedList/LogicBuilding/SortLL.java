package LinkedList.LogicBuilding;

import LinkedList.Fundamentals.SinglyLL.utils.*;
/*
    Problem: Sort a Linked List of 0's 1's and 2's

    Given the head of a singly linked list consisting of only 0, 1 or 2.
    Sort the given linked list and return the head of the modified list.
    Do it in-place by changing the links between the nodes without creating new nodes.

    Example 1:
    Input: linkedList = [1, 0, 2, 0 , 1]
    Output: [0, 0, 1, 1, 2]
    Explanation: The values after sorting are [0, 0, 1, 1, 2].

    Example 2:
    Input: linkedList = [1, 1, 1, 0]
    Output: [0, 1, 1, 1]
    Explanation: The values after sorting are [0, 1, 1, 1].
*/
public class SortLL {
    public static void main(String[] args) {
        // Input: linkedList = [1, 0, 2, 0 , 1]
        int[] linkedList1 = {1, 0, 2, 0 , 1};
        ListNode head1 = ConvertArrToLinkedList.convertArrToLL(linkedList1);
        head1 = sortLL(head1);
        System.out.println(Traversal.LLTraversal(head1));

        // Input: linkedList = [1, 1, 1, 0]
        int[] linkedList2 = {1, 1, 1, 0};
        ListNode head2 = ConvertArrToLinkedList.convertArrToLL(linkedList2);
        head2 = sortLL(head2);
        System.out.println(Traversal.LLTraversal(head2));
    }

    public static ListNode sortLL(ListNode head) {
        // Initialize counts
        int c0 = 0, c1 = 0, c2 = 0;
        ListNode temp = head;

        /* Count the number of 0s,
           1s, and 2s in the list */
        while (temp != null) {
            if (temp.data == 0)
                c0++;
            else if (temp.data == 1)
                c1++;
            else if (temp.data == 2)
                c2++;
            temp = temp.next;
        }

        temp = head;

        /* Reassign values to
           the ListNodes based on
           the counts */
        while (temp != null) {
            if (c0 > 0) {
                temp.data = 0;
                c0--;
            } else if (c1 > 0) {
                temp.data = 1;
                c1--;
            } else if (c2 > 0) {
                temp.data = 2;
                c2--;
            }
            temp = temp.next;
        }

        return head;
    }

}
