package LinkedList.Fundamentals.DoublyLL.utils;

public class ListNode {
     // Value of the node
    public int data;        
    // Pointer to the next node
    public ListNode next;      
    // Pointer to the previous node
    public ListNode prev;      

    public ListNode(int data, ListNode prev, ListNode next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public ListNode(int data) {
        this.data = data;
    }
}