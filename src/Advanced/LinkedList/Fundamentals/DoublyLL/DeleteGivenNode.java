package LinkedList.Fundamentals.DoublyLL;

public class DeleteGivenNode {
    public static void main(String[] args) {
        ConvertArrToDoublyLL convertArrToDoublyLL = new ConvertArrToDoublyLL();
        Node node = convertArrToDoublyLL.convertArrToDoublyLL(new int[]{2, 5, 6, 8, 9, 13});
        System.out.println("Before Delete given node");
        print(node);

        System.out.println("\nAfter delete given node");
        deleteGivenNode(node.next); // delete 4th element
        print(node);
    }

    private static void print(Node head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    static void deleteGivenNode(Node node) {
        // Delete Last Node
        Node prev = node.back;
        Node front = node.next;
        if(front == null) {
            prev.next = null;
            node.back = null;
            return;
        }

        // Delete any middle node
        prev.next = front;
        front.back = prev;
        node.next = null;
        node.back = null;

    }
}
