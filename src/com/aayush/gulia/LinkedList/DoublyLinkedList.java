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

    /**
     * Display doubly linked list.
     */

    public static void display(){
        Node p = head;

        while (p != null){
            System.out.print(p.data + "-> ");
            p = p.next;
        }
        System.out.println();
    }

    /**
     * Display doubly linked list.
     *
     * @param first takes head pointer of doubly linked list.
     */

    public static void display(Node first){

    }

    /**
     * Inserts element at a given position in doubly linked list.
     *
     * @param element integer data to be inserted inside the doubly linked list.
     * @param position index at which the new node will be inserted.
     */

    public static void insert(int element, int position){
        Node p = head;
        Node temp;

        // handles insertion at head
        if (position == 0){
            temp = new Node(element, null, null);
            temp.next = head;
            head.prev = temp;
            head = temp;
        }

        // handles insertion in between and end
        else
        {
            for (int i=1; i<position; i++){
                p = p.next;
            }
            temp = new Node(element, null, null);

            if (p.next != null){
                temp.next = p.next;
                temp.prev = p;
                p.next.prev = temp;
                p.next = temp;
            }
            else{
                p.next = temp;
                temp.prev = p;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        createDoublyLinkedList(a);
        display();
        insert(69, 5);
        insert(69, 6);
        insert(69, 7);
        display();
    }
}
