package LinkedList.LogicBuilding;

import LinkedList.Fundamentals.SinglyLL.utils.*;
/*
   Problem:  Add two numbers in Linked List

    Given two non-empty linked lists linkedList1 and linkedList2 which represent two non-negative integers.
    The digits are stored in reverse order with each node storing one digit.
    Add two numbers and return the sum as a linked list.
    The sum Linked List will be in reverse order as well.
    The Two given Linked Lists represent numbers without any leading zeros, except when the number is zero itself.

    Example 1:
    Input: linkedList1 = [5, 4], linkedList2 = [4]
    Output: [9, 4]
    Explanation: linkedList1 = 45, linkedList2 = 4.
    linkedList1 + linkedList2 = 45 + 4 = 49.
    The sum is 49 and when prepare the linked list we reverse the number [9, 4]

    Example 2:
    Input: linkedList1 = [4, 5, 6], linkedList2 = [1, 2, 3]
    Output: [5, 7, 9]
    Explanation: linkedList1 = 654, linkedList2 = 321.
    linkedList1 + linkedList2 = 654 + 321 = 975.
    The sum is 975 and when prepare the linked list we reverse the number [5, 7, 9]The sum
*/
public class AddTwoNumbers {
    public static void main(String[] args) {
        // Input: linkedList = [5,4], linkedList = [4]
        int[] linkedList1 = {5,4}, linkedList2 = {4};
        ListNode head1 = ConvertArrToLinkedList.convertArrToLL(linkedList1);
        ListNode head2 = ConvertArrToLinkedList.convertArrToLL(linkedList2);
        ListNode sumList1 = addTwoNumbers(head1, head2);
        System.out.println(Traversal.LLTraversal(sumList1));

        // Input: linkedList = [4,5,6], linkedList = [1,2,3]
        int[] linkedList3 = {4,5,6}, linkedList4 = {1,2,3};
        ListNode head3 = ConvertArrToLinkedList.convertArrToLL(linkedList3);
        ListNode head4 = ConvertArrToLinkedList.convertArrToLL(linkedList4);
        ListNode sumList2 = addTwoNumbers(head3, head4);
        System.out.println(Traversal.LLTraversal(sumList2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //YOUR CODE GOES HERE
        ListNode sumList = new ListNode();
        ListNode temp = sumList;

        int carry = 0;
        while((l1 != null || l2 != null) || carry != 0) {
            int sum = 0;
            if(l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            temp.next = node;
            temp = temp.next;
            
        }

        return sumList.next;
    }
}
