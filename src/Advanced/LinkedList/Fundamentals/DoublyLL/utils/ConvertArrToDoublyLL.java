package LinkedList.Fundamentals.DoublyLL.utils;

public class ConvertArrToDoublyLL {

    public static void main(String[] args) {
        int[] arr = {2,5,6,8};
        ListNode head = convertArrToDoublyLL(arr);

        System.out.println("The doubly linked list is:");
        printLL(head);
    }

    public static ListNode convertArrToDoublyLL(int[] arr) {
        if(arr == null || arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode prev = head;

        for(int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i], prev, null);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }

    public static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
