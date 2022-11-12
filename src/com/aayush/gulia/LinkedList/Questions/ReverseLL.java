package com.aayush.gulia.LinkedList.Questions;

/**
 * Leet code 206
 */

public class ReverseLL {
    static class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    private static Node head;

    private static void createLinkedList(int[] a){
        if (a.length == 0){
            return;
        }

        Node last, temp;
        int i;
        head = new Node(a[0], null);

        last=head;

        for (i=1; i<a.length; i++){
            temp = new Node(a[i], null);
            last.next = temp;
            last = temp;
        }
    }

    private static void display(){
        Node p = head;

        while (p != null){
            System.out.print(p.data + " ");
            p = p.next;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        createLinkedList(a);
        reverse();
        display();
    }

    private static void reverse() {
        Node next, current, previous;

        current = head;
        next = null;
        previous = null;

        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }
}
