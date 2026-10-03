package LinkedList.LogicBuilding;

import LinkedList.Fundamentals.SinglyLL.utils.*;
/*
    Problem: Segregate odd and even nodes in Linked List
    Given the head of a singly linked list. 
    Group all the nodes with odd indices followed by all the nodes with even indices and return the reordered list.
    Consider the 1st node to have index 1 and so on. 
    The relative order of the elements inside the odd and even group must remain the same as the given input.

    Example 1:
    Input: linkedList = [1, 2, 3, 4, 5]
    Output: [1, 3, 5, 2, 4]
    Explanation: The nodes with odd indices are 1, 3, 5 and the ones with even indices are 2, 4.

    Example 2:
    Input: linkedList = [4, 3, 2, 1]
    Output: [4, 2, 3, 1]
    Explanation: The nodes with odd indices are 4, 2 and the ones with even indices are 3, 1.

*/
public class SegregateOddEven {

    public static void main(String[] args) {
        // Input: linkedList = [1, 2, 3, 4, 5]
        int[] linkedList1 = {1, 2, 3, 4, 5};
        ListNode head1 = ConvertArrToLinkedList.convertArrToLL(linkedList1);
        head1 = oddEvenList(head1);
        System.out.println(Traversal.LLTraversal(head1));

        // Input: linkedList = [4, 3, 2, 1]
        int[] linkedList2 = {4, 3, 2, 1};
        ListNode head2 = ConvertArrToLinkedList.convertArrToLL(linkedList2);
        head2 = oddEvenList(head2);
        System.out.println(Traversal.LLTraversal(head2));
    
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode ptrOdd = head;
        ListNode ptrEven = head.next;
        ListNode evenHead = head.next;

        while(ptrEven != null && ptrEven.next != null) {
            ptrOdd.next = ptrOdd.next.next;
            ptrEven.next = ptrEven.next.next;
            ptrOdd = ptrOdd.next;
            ptrEven = ptrEven.next;
        }

        ptrOdd.next = evenHead;

        return head;
    }
}
