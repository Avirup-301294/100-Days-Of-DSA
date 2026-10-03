package LinkedList.Fundamentals.SinglyLL.utils;

/* Defination of ListNoode
class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
*/

/*
    Problem:Search in Linked List
    You are given the head of a singly linked list and an integer key.
    Return true if the key exists in the linked list, otherwise return false.

    Example 1:
    Input: head = [1, 2, 3, 4], key = 3
    Output: true
    Explanation: The linked list is 1 → 2 → 3 → 4. The key 3 is present in the list.

    Example 2:
    Input: head = [7, 8, 9, 10, 11], key = 5
    Output: false
    Explanation: The key 5 is not present in the list.
*/
public class SearchInLinkedList {
    public static void main(String[] args) {
        // Input: head = [1, 2, 3, 4], key = 3
        int[] linkedList1 = {1, 2, 3, 4};
        ListNode head1 = ConvertArrToLinkedList.convertArrToLL(linkedList1);
        boolean findKey1 = searchKey(head1, 3);
        System.out.println("Length: " + findKey1);

        // Input: head = [7, 8, 9, 10, 11], key = 5
        int[] linkedList2 = {7, 8, 9, 10, 11};
        ListNode head2 = ConvertArrToLinkedList.convertArrToLL(linkedList2);
        boolean findKey2 = searchKey(head2, 5);
        System.out.println("Length: " + findKey2);
    }
    public static boolean searchKey(ListNode head, int key) {
        // Your code goes here
        ListNode temp = head;

        while(temp != null) {
            if(temp.data == key) return true;
            temp = temp.next;
        }

        return false;
    }
}
