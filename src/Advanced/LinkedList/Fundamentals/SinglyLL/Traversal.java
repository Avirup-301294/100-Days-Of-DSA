package LinkedList.Fundamentals.SinglyLL;

import java.util.ArrayList;
import java.util.List;
import LinkedList.Fundamentals.SinglyLL.utils.*;

/*
    Problem: Traversal in Linked List
    Given the head of a singly Linked List. Traverse the entire Linked List and return its elements in an array in the order of their appearance.


    Example 1
    Input: linkedList = [5, 4, 3, 1, 0]
    Output: [5, 4, 3, 1, 0]
    Explanation: The nodes in the Linked List are 5 -> 4 -> 3 -> 1 -> 0, with the head pointing to node with value 5.

    Example 2
    Input: linkedList = [1]
    Output: [1]
    Explanation: Only one node (head) present in the list.

    Example 3
    Input: linkedList = [0, 2, 5]
    Output: [0, 2, 5]
*/

public class Traversal {
    public static void main(String[] args) {
        // Input: linkedList = [5, 4, 3, 1, 0]
        int[] linkedList1 = {5, 4, 3, 1, 0};
        ListNode head1 = ConvertArrToLinkedList.convertArrToLL(linkedList1);
        System.out.println(LLTraversal(head1));

        // Input: linkedList = [1]
        int[] linkedList2 = {1};
        ListNode head2 = ConvertArrToLinkedList.convertArrToLL(linkedList2);
        System.out.println(LLTraversal(head2));

    }
    public static List<Integer> LLTraversal(ListNode head) {
        // your code goes here
        List<Integer> list = new ArrayList<>();
        
        while(head != null) {
            list.add(head.data);
            head = head.next;
        }
        
        return list;
    }
}
