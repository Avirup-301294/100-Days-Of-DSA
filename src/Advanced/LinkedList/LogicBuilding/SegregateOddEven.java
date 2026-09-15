package LinkedList.LogicBuilding;

import static LinkedList.Fundamentals.SinglyLL.utils.ConvertArrToLinkedList.convertArrToLL;

import LinkedList.Fundamentals.SinglyLL.utils.ListNode;

public class SegregateOddEven {

    public static void main(String[] args) {
        SegregateOddEven segregateOddEven = new SegregateOddEven();

        int[] arr = {1,2,3,4,5};
        ListNode head = convertArrToLL(arr);

        ListNode oddEvenList = segregateOddEven.oddEvenList(head);

        while(oddEvenList != null) {
            System.out.print(oddEvenList.data + " ");
            oddEvenList = oddEvenList.next;
        }
    }

    public ListNode oddEvenList(ListNode head) {
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
