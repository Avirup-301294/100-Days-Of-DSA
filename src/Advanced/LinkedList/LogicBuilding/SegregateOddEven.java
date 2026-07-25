package LinkedList.LogicBuilding;

import LinkedList.Fundamentals.SinglyLL.Node;

import static LinkedList.Fundamentals.SinglyLL.ConvertArrToLinkedList.convertArrToLL;

public class SegregateOddEven {

    public static void main(String[] args) {
        SegregateOddEven segregateOddEven = new SegregateOddEven();

        int[] arr = {1,2,3,4,5};
        Node head = convertArrToLL(arr);

        Node oddEvenList = segregateOddEven.oddEvenList(head);

        while(oddEvenList != null) {
            System.out.print(oddEvenList.data + " ");
            oddEvenList = oddEvenList.next;
        }
    }

    public Node oddEvenList(Node head) {
        if (head == null || head.next == null)
            return head;
        Node ptrOdd = head;
        Node ptrEven = head.next;
        Node evenHead = head.next;
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
