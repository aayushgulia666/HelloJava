package com.aayush.gulia.LinkedList;

/**
 * This class shows the implementation of circular doubly linked list.
 *
 * Circular linked list have properties of both <i>Doubly linked list</i> and <i>Circular linked list</i>
 *
 * @author Aayush Gulia <aayushgulia07@outlook.com>
 * @see <a href="https://www.geeksforgeeks.org/doubly-circular-linked-list-set-1-introduction-and-insertion/">Circular linked list</a>
 *
 */

public class CircularDoublyLinkedList {

    /**
     * This class defines the structure of node.
     */

    static class Node{
        Node prev;
        int data;
        Node next;

        /**
         * Creates a new node.
         *
         * @param prev link to the previous node.
         * @param data stores the data in the node.
         * @param next link to the next node.
         */

        public Node(Node prev, int data, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }

    /**
     * Global reference of circular linked list.
     */

    static Node head;

    /**
     * Creates a circular linked list.
     * @param a an array of elements which will be inserted into circular linked list.
     */

    public static void createList(int[] a){
        Node temp, last;

        head = new Node(null, a[0], null);
        last = head;

        int i;
        for (i=1; i<a.length; i++){
            temp = new Node(null, a[i], null);
            last.next = temp;
            temp.prev = last;
            last = temp;
        }

        head.prev = last;
        last.next = head;
    }

    /**
     * Displays circular linked list.
     */

    public static void display(){
        Node p = head;

        do {
            if (p != null){
                System.out.print(p.data + "-> ");
                p=p.next;
            }
        }while (p != null && p != head);

        System.out.println("");
    }
}
