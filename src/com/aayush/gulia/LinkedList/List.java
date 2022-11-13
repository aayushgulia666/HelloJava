package com.aayush.gulia.LinkedList;

/**
 * Class to create Singly Linked List.
 */

public class List {
    static class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

        Node(){}

    }
    public static Node createSinglyLinkedList(int[] a){
        Node first, last, temp;

        first = new Node(a[0], null);
        last=first;
        for (int i=1; i<a.length; i++){
            temp = new Node(a[i], null);
            last.next = temp;
            last = temp;
        }

        return first;
    }

    public static void display(Node first){
        Node p = first;
        while (p!=null){
            System.out.print(p.data + " ");
            p=p.next;
        }
        System.out.println();
    }
}
