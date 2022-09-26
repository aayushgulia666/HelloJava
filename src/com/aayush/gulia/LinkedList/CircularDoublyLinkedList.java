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

    /**
     * Insert element (data) at a given position in a circular linked list.
     *
     * @param element data inserted in a new node.
     * @param position index at which new node will be inserted.
     */

    public static void insertElement(int element, int position){
        Node p = head;
        Node temp;

        // handles insertion at head.
        if (position == 0){
            temp = new Node(null, element, null);

            temp.next = head;
            head.prev.next = temp;
            temp.prev = head.prev;
            head.prev = temp;
            head = temp;
        }

        int i;
        for (i=1; i<position; i++){
            p = p.next;
        }

        temp = new Node(null, element, null);

        // handles insertion at rear.
        if (p.next == head){
            temp.next = p.next;
            p.next.prev = temp;
            p.next = temp;
            temp.prev = p;
        }

        else
        {
            // handles insertion in between.
            temp = new Node(null, element, null);
            p.next.prev = temp;
            temp.next = p.next;
            temp.prev = p;
            p.next = temp;
        }
    }

    /**
     * Delete a node from circular linked list.
     *
     * @param element data to delete from the linked list.
     */

    public static void deleteElement(int element){
        Node p = head;

        // handles deletion at head.
        if (p.data == element){
            p.prev.next = p.next;
            head.next.prev = p.prev;
            head = head.next;
        }

        // search element in list.

        do {
            if (p.data == element){
                break;
            }

            p = p.next;
        }while (p != null &&p != head);

        if (p.next != head){
            p.next.prev = p.prev;
            p.prev.next = p.next;
        }
        else
        {
            p.next.prev = p.prev;
            p.prev.next = p.next;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        createList(a);
        display();
        deleteElement(3);
        deleteElement(1);
        deleteElement(5);
        display();
    }
}

