package LinkedList.Fundamentals.DoublyLL;

public class ConvertArrToDoublyLL {

    public static void main(String[] args) {

        int[] arr = {2,5,6,8};
        ConvertArrToDoublyLL convertArrToDoublyLL = new ConvertArrToDoublyLL();

        Node head = convertArrToDoublyLL.convertArrToDoublyLL(arr);

    }

    public Node convertArrToDoublyLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }
}
