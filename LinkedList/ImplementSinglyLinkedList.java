package com.aayush.gulia.LinkedList;

public class ImplementSinglyLinkedList {

    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    static void createLinkedList(int[] A){
        // this method will create linked list.

        int i;
        Node last, temp;

        head = new Node(A[0], null);
        last = head;

        for (i=1; i<A.length; i++){
            temp = new Node(A[i], null);
            last.next = temp;
            last=temp;
        }
    }

    static void display(Node first){
        // this method will display linked list.

        Node p = first;
        while (p != null){
            System.out.println(p.data);
            p = p.next;
        }
    }

    static void recursiveDisplay(Node first){
        if (first != null){
            System.out.println(first.data);
            recursiveDisplay(first.next);
        }
    }


    public static void main(String[] args) {

        int [] A = {1,2,3,4,5,6,7,8,9,0};

        createLinkedList(A);
        recursiveDisplay(head);
    }
}
