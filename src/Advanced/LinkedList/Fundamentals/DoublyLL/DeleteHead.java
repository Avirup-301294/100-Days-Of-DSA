package LinkedList.Fundamentals.DoublyLL;


import LinkedList.Fundamentals.DoublyLL.ConvertArrToDoublyLL;
import LinkedList.Fundamentals.DoublyLL.Node;

public class DeleteHead {
    public static void main(String[] args) {
        ConvertArrToDoublyLL convertArrToDoublyLL = new ConvertArrToDoublyLL();
        Node node = convertArrToDoublyLL.convertArrToDoublyLL(new int[]{2,5,6,8});
        System.out.println("Before head deletion");
        print(node);

        System.out.println("\nAfter head deletion");
        Node deleteHead = deleteHead(node);
        print(deleteHead);
    }

    private static void print(Node head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    static Node deleteHead(Node head) {
        if(head == null || head.next == null) return null;

        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;

        return head;

    }

}
