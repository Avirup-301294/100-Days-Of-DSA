package LinkedList.Fundamentals.DoublyLL;


public class DeleteTail {
    public static void main(String[] args) {
        ConvertArrToDoublyLL convertArrToDoublyLL = new ConvertArrToDoublyLL();
        Node node = convertArrToDoublyLL.convertArrToDoublyLL(new int[]{2,5,6,8});
        System.out.println("Before head deletion");
        print(node);

        System.out.println("\nAfter tail deletion");
        Node deleteTail = deleteTail(node);
        print(deleteTail);
    }

    private static void print(Node head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    static Node deleteTail(Node head) {
        if(head == null || head.next == null) return null;
        Node tail = head;
        while(tail.next != null) {
            tail = tail.next;
        }

        Node prev = tail.back;
        prev.next = null;
        tail.back = null;

        return head;
    }

}
