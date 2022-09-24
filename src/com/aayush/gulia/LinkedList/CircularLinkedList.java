package com.aayush.gulia.LinkedList;

/**
 * This class shows implementation of Circular Linked List.
 *
 * Linked list in which the last node points on the first node is known as <i>Circular Linked List</i>.
 * The nodes are circularly connected. It is same as singly linked list but the last node points to the head node.
 *
 * @author Aayush Gulia <aayushgulia07@outlook.com>
 * @see <a href="https://www.geeksforgeeks.org/circular-linked-list/">Circular Linked List</a>
 * @since 25-09-2022
 */

public class CircularLinkedList {

    /**
     * Circular linked list node structure is defined in Node class.
     */
    static class Node{
        int data;
        Node next;

        /**
         * Constructor which creates a new node whenever Node class is called.
         * @param data an integer stores the element of the circular linked list.
         * @param next stores the reference to the next node, an object type Node.
         */

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    /**
     * Creates a Circular linked list.
     *
     * @param A an array of type integer which stores the element to be inserted into the Circular linked list.
     * @return an object of type Node pointing to the first element <i>Head</i> of the Circular linked list.
     */

    public static Node createCircularLinkedList(int[] A){
        Node head, last, temp;
        head = new Node(A[0], null);
        last = head;

        int i;
        for (i=1; i<A.length; i++){
            temp = new Node(A[i], null);
            last.next = temp;
            last = temp;
        }

        last.next = head; // point the last node to head.

        return head;
    }

    /**
     * Displays all the elements inside Circular linked list.
     * @param head takes head of Circular linked list.
     */

    public static void displayCircularLinkedList(Node head){
        Node p = head;

        do {
            if (p != null){
                System.out.print(p.data + "-> ");
                p = p.next;
            }
        }while (p != head);

        System.out.print("null");
    }
}
