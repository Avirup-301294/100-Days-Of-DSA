package LinkedList.LogicBuilding;

import LinkedList.Fundamentals.SinglyLL.Node;

import static LinkedList.Fundamentals.SinglyLL.ConvertArrToLinkedList.convertArrToLL;

public class SortLL {

    public Node sortLL(Node head) {
        // Initialize counts
        int c0 = 0, c1 = 0, c2 = 0;
        Node temp = head;

        /* Count the number of 0s,
           1s, and 2s in the list */
        while (temp != null) {
            if (temp.data == 0)
                c0++;
            else if (temp.data == 1)
                c1++;
            else if (temp.data == 2)
                c2++;
            temp = temp.next;
        }

        temp = head;

        /* Reassign values to
           the nodes based on
           the counts */
        while (temp != null) {
            if (c0 > 0) {
                temp.data = 0;
                c0--;
            } else if (c1 > 0) {
                temp.data = 1;
                c1--;
            } else if (c2 > 0) {
                temp.data = 2;
                c2--;
            }
            temp = temp.next;
        }

        return head;
    }


    public static void main(String[] args) {
        SortLL sortLL = new SortLL();

        int[] arr = {1, 0, 2, 0 , 1};
        Node head = convertArrToLL(arr);
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }

        System.out.println();
        Node sortLL1 = sortLL.sortLL(head);

        while(sortLL1 != null) {
            System.out.print(sortLL1.data + " ");
            sortLL1 = sortLL1.next;
        }
    }
}
