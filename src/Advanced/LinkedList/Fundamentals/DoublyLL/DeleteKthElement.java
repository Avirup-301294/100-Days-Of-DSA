package LinkedList.Fundamentals.DoublyLL;

import LinkedList.Fundamentals.DoublyLL.ConvertArrToDoublyLL;
import LinkedList.Fundamentals.DoublyLL.Node;

public class DeleteKthElement {
    public static void main(String[] args) {
        ConvertArrToDoublyLL convertArrToDoublyLL = new ConvertArrToDoublyLL();
        Node node = convertArrToDoublyLL.convertArrToDoublyLL(new int[]{2, 5, 6, 8, 9, 13});
        System.out.println("Before kth element deletion");
        print(node);

        System.out.println("\nAfter kth element deletion");
        Node deleteKthElement = deleteKthElement(node, 7); // delete 4th element
        print(deleteKthElement);
    }

    private static void print(Node head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    static Node deleteKthElement(Node head, int k) {
        if(head == null) return null;

        int size = sizeOfLinkedList(head);
        if (k > size || k <= 0) return head; // invalid k

        // Case 1: delete head
        if (k == 1) {
            Node newHead = head.next;
            if (newHead != null) {
                newHead.back = null;
            }
            return newHead;
        }

        Node temp = head;
        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }

        // Case 2: delete middle or last
        Node prev = temp.back;
        Node next = temp.next;

        if (prev != null) {
            prev.next = next;
        }
        if (next != null) {
            next.back = prev;
        }

        // Clear temp
        temp.next = null;
        temp.back = null;

        return head;
    }

    private static int sizeOfLinkedList(Node head) {
        int count = 0;
        while(head != null) {
            head = head.next;
            count++;
        }

        return count;
    }
}
