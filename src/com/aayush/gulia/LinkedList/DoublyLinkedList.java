package com.aayush.gulia.LinkedList;

/**
 * This class shows the implementation of Doubly Linked List.
 *
 * A Doubly Linked List (DLL) contains an extra pointer,
 * typically called the previous pointer, together with the next pointer and data which are there in the singly linked list.
 *
 * We can perform all the operations done on the singly linked list, but the difference is that we can move in both directions. (forward and backward)
 *
 * @author Aayush Gulia <aayushgulia07@outlook.com>
 * @see <a href="https://www.geeksforgeeks.org/doubly-linked-list/">Doubly Linked List</a>
 *
 */

public class DoublyLinkedList {

    /**
     * Global reference to our doubly linked list.
     */
    static Node head;

    static class Node{
        Node prev;
        int data;
        Node next;

        /**
         * Creates a new node whenever called.
         * @param data stores the data.
         * @param prev stores the previous pointer, pointing to the previous node.
         * @param next stores the next pointer, pointing to the next node.
         */

        Node(int data, Node prev, Node next){
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    /**
     * Creates a doubly linked list.
     *
     * @param a array of elements to be inserted into doubly linked list.
     */

    public static void createDoublyLinkedList(int[] a){
        Node last, temp;

        head = new Node(a[0], null, null);
        last = head;

        int i;
        for (i=1; i<a.length; i++){
            temp = new Node(a[i], null, null);
            temp.prev = last;
            last.next = temp;
            last = temp;
        }
    }

    public static void display(){
        Node p = head;

        while (p != null){
            System.out.print(p.data + "-> ");
            p = p.next;
        }
        System.out.println();
    }

    public static void display(Node first){

    }
}
