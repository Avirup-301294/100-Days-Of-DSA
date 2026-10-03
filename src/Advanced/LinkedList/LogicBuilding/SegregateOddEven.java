package LinkedList.LogicBuilding;

import static LinkedList.Fundamentals.SinglyLL.utils.ConvertArrToLinkedList.convertArrToLL;

import LinkedList.Fundamentals.SinglyLL.utils.ListNode;

public class SegregateOddEven {

    public static void main(String[] args) {
        
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
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
