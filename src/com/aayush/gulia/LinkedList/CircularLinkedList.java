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
     *  Head Static global variable for Circular linked list.
     */

    static Node head;

    /**
     * Creates a Circular linked list.
     *
     * @param A an array of type integer which stores the element to be inserted into the Circular linked list.
     * @return an object of type Node pointing to the first element <i>Head</i> of the Circular linked list.
     */

    public static void createCircularLinkedList(int[] A){
        Node last, temp;
        head = new Node(A[0], null);
        last = head;

        int i;
        for (i=1; i<A.length; i++){
            temp = new Node(A[i], null);
            last.next = temp;
            last = temp;
        }

        last.next = head; // point the last node to head.
    }

    public static Node createCircularLinkedListReference(int[] a){
        Node first, temp, last;
        first = new Node(a[0], null);
        last = first;

        int i;
        for (i=1; i<a.length; i++){
            temp = new Node(a[i], null);
            last.next = temp;
            last = temp;
        }

        last.next = first;
        return first;
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
        }while (p != head && p != null);

        System.out.print("null");
        System.out.println();
    }

    /**
     * static variable flag for recursiveDisplayCircularLinkedList
     */

    static int flag = 0;

    /**
     * Displays all the elements of circular linked list (recursively).
     * @param first Circular linked list to be displayed.
     */

    public static void recursiveDisplayCircularLinkedList(Node first){

        if (first != head || flag == 0){
            flag = 1;
            System.out.print(head.data + "-> ");
            recursiveDisplayCircularLinkedList(head.next);
        }
        flag = 0;
    }

    public static void insertElementInCircularLinkedList(Node first, int element, int position){
        Node temp;
        Node p = first;

        if (position == 0){
            temp = new Node(element, null);
            temp.next = p;
            first = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        Node f = createCircularLinkedListReference(a);
        displayCircularLinkedList(f);
        insertElementInCircularLinkedList(f, 56, 0);
        displayCircularLinkedList(f);
    }
}