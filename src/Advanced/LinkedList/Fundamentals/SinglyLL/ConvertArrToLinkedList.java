package LinkedList.Fundamentals.SinglyLL;

import LinkedList.Fundamentals.SinglyLL.Node;

public class ConvertArrToLinkedList {
    public static Node convertArrToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node ptr = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            ptr.next =  temp;
            ptr = temp;
        }

        return head;
    }

    public static void main(String[] args) {
        int[] arr = {12,5,6,8};
        Node temp = convertArrToLL(arr);
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}