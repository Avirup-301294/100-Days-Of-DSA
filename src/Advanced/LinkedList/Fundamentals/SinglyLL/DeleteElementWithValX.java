package LinkedList.Fundamentals.SinglyLL;

import LinkedList.Fundamentals.SinglyLL.utils.*;

public class DeleteElementWithValX {
    public static void main(String[] args) {
        // Input: linkedList = [3, 4, 5], X = 5
        int[] linkedList1 = {3, 4, 5};
        ListNode head1 = ConvertArrToLinkedList.convertArrToLL(linkedList1);
        head1 = deleteNodeWithValueX(head1, 5);
        System.out.println(Traversal.LLTraversal(head1));

        // Input: linkedList = [3, 4, 5], X = 7
        int[] linkedList2 = {3, 4, 5};
        ListNode head2 = ConvertArrToLinkedList.convertArrToLL(linkedList2);
        head2 = deleteNodeWithValueX(head2,7);
        System.out.println(Traversal.LLTraversal(head2));

        // Input: linkedList = [3, 4, 5], X = 3
        int[] linkedList3 = {3, 4, 5};
        ListNode head3 = ConvertArrToLinkedList.convertArrToLL(linkedList3);
        head3 = deleteNodeWithValueX(head3,3);
        System.out.println(Traversal.LLTraversal(head3));
    }

    public static ListNode deleteNodeWithValueX(ListNode head, int X) {
        
        if(head == null || (head.data == X && head.next == null)) return null;
        if(head.data == X && head.next != null) return head.next;

        ListNode prev = null;
        ListNode temp = head;

        while(temp != null) {
            if(temp.data == X) {
                prev.next = temp.next;
                return head;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }
}
