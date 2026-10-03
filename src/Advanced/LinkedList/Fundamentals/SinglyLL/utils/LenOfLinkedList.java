package LinkedList.Fundamentals.SinglyLL.utils;

/*
    Problem: Find the length of the Linked List
    You are given the head of a singly linked list. Your task is to return the number of nodes in the linked list.

    Example 1:
    Input: head = [1, 2, 3, 4, 5]
    Output: 5

    Example 2:
    Input: head = [8, 6]
    Output: 2
*/
public class LenOfLinkedList {
    public static void main(String[] args) {
        // Input: head = [1, 2, 3, 4, 5]
        int[] linkedList1 = {1, 2, 3, 4, 5};
        ListNode head1 = ConvertArrToLinkedList.convertArrToLL(linkedList1);
        int len1 = getLength(head1);
        System.out.println("Length: " + len1);

        // Input: head = [8, 6]
        int[] linkedList2 = {8, 6};
        ListNode head2 = ConvertArrToLinkedList.convertArrToLL(linkedList2);
        int len2 = getLength(head2);
        System.out.println("Length: " + len2);
    }

    public static int getLength(ListNode head) {
        // Your code goes here
        ListNode temp = head;
        int len = 0;
        while(temp != null) {
            len++;
            temp = temp.next;
        }

        return len;
    }
}
