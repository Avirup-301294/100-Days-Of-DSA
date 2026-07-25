package LinkedList.Fundamentals.DoublyLL;

public class Intro {

    public static void main(String[] args) {
        // Print doubly linked list
        Node node = new Node(1);
        node.back = null;
        Node prev = node;

        node.next = new Node(2);
        node.next.back = prev;
        prev = node.next;

        node.next.next = new Node(3);
        node.next.next.back = prev;
        prev = node.next.next;

        node.next.next.next = new Node(4);
        node.next.next.next.back = prev;
        prev = node.next.next.next;

        System.out.println("Forward-");
        // Forward
        Node head = node;

        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println("\nBackward-");
        // Backward
        head = node.next.next.next;

        while(head != null) {
            System.out.print(head.data + " ");
            head = head.back;
        }
    }
}
