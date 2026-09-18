package LinkedList.Fundamentals.DoublyLL;

import LinkedList.Fundamentals.DoublyLL.utils.ConvertArrToDoublyLL;
import LinkedList.Fundamentals.DoublyLL.utils.ListNode;

public class TraverseDLL {

    public static void main(String[] args) {
        // Print doubly linked list
        int[] arr = {1, 2, 3, 4};

        ListNode head = ConvertArrToDoublyLL.convertArrToDoublyLL(arr);
        printDLL(head);
    }

    public static void printDLL(ListNode head) {

        System.out.print("Forward Pass: ");
        // Forward
        ListNode temp = head;
        while(temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.print(temp.data + " ");

        System.out.print("\nBackward Pass: ");
        // Backward
        
        while(temp.prev != null) {
            System.out.print(temp.data + " <- ");
            temp = temp.prev;
        }

        System.out.print(temp.data + " ");
    }
}
