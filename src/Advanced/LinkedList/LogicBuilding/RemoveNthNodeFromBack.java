package LinkedList.LogicBuilding;

import LinkedList.Fundamentals.SinglyLL.utils.*;

public class RemoveNthNodeFromBack {
    public static void main(String[] args) {
        // Input: linkedList = [1, 2, 3, 4, 5]
        int[] linkedList1 = {1, 2, 3, 4, 5};
        ListNode head1 = ConvertArrToLinkedList.convertArrToLL(linkedList1);
        head1 = removeNthFromEnd(head1,2);
        System.out.println(Traversal.LLTraversal(head1));

        // Input: linkedList = [5,4,3,2,1]
        int[] linkedList2 = {5, 4, 3, 2, 1};
        ListNode head2 = ConvertArrToLinkedList.convertArrToLL(linkedList2);
        head2 = removeNthFromEnd(head2,5);
        System.out.println(Traversal.LLTraversal(head2));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        while(n-- != 0) {
            fast = fast.next;
        }

        if(fast == null) {
            return head.next;
        }

        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;;

        return head;
    }
}
