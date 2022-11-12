package com.aayush.gulia.LinkedList.Questions;

public class RemoveNthNodeFromLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    static Node createLinkedList(int[] a) {
        Node first, temp, last;
        first = new Node(a[0], null);
        last = first;

        for (int i = 1; i < a.length; i++) {
            temp = new Node(a[i], null);
            last.next = temp;
            last = temp;
        }

        return first;
    }

    static void display(Node first){
        while (first != null){
            System.out.print(first.data + " ");
            first = first.next;
        }
        System.out.println();
    }

    static Node deleteFormLast(int n, Node first){

        if (n==0) return first;

        Node temp = first;
        Node follow = first;
        // count the length of linked list
        int count = 0;
        while (temp != null){
            count++;
            temp=temp.next;
        }

        /*
        While deleting we need to take care of three cases.
        1) deletion at head 2) deletion in middle 3) deletion at last
         */

        int deleteCount = count - n;
        temp=first;

        // deletion at head
        if (deleteCount == 0){
            first = first.next;
            return first;
        }

        // traverse to the node
        for (int i=0; i<deleteCount; i++){
            follow=temp;
            temp=temp.next;
        }

        // deletion at last
        if (temp != null){
            if (temp.next == null){
                follow.next = null;
                return first;
            }
        }

        // deletion in middle
        follow.next = follow.next.next;
        return first;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        Node f = createLinkedList(a);
        f = deleteFormLast(3, f);
        display(f);
    }
}
