package LinkedList.Fundamentals.SinglyLL.utils;


public class ConvertArrToLinkedList {
    public static ListNode convertArrToLL(int[] arr) {
        ListNode head = null;
        // ListNode head = new ListNode(arr[0]);
        if(arr.length > 0) {
            head = new ListNode(arr[0]);
        } else {
            return null;
        }
        ListNode ptr = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);
            ptr.next =  temp;
            ptr = temp;
        }

        return head;
    }

    public static void main(String[] args) {
        int[] arr = {};
        // int[] arr = {12,5,6,8};
        ListNode temp = convertArrToLL(arr);
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}