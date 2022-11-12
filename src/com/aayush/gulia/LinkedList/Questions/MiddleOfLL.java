package com.aayush.gulia.LinkedList.Questions;

public class MiddleOfLL {
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

    private static void middleOfLinkedList(){
        Node slow = head;
        Node fast = head;

        while ( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.data);

    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        createLinkedList(a);
        middleOfLinkedList();
    }
}
