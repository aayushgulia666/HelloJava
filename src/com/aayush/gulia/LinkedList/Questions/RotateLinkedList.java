package com.aayush.gulia.LinkedList.Questions;

public class RotateLinkedList {
    static class Node{
        int val;
        Node next;

        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

    static Node createLinkedList(int[] a){
        Node head, temp, last;

        head = new Node(a[0], null);
        last = head;

        for (int i=1; i<a.length; i++){
            temp = new Node(a[i], null);
            last.next = temp;
            last = temp;
        }

        return head;
    }

    static void display(Node head){
        while (head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    static Node rotateList(Node head, int k){
        // count the length of list.
        if (head == null || k == 0) return head;

        Node p = head;
        int count = 0;
        int i;

        while (p!=null){
            count++;
            p=p.next;
        }

        p=head;
        int timeRotate = k % count;

        // connect end of list to its head.
        while (p.next != null) p=p.next;
        p.next=head;

        p = head; Node q = head;

        for (i=0; i<(count-timeRotate-1); i++){
            q=q.next;
        }

        p=q.next;
        head = p;
        q.next=null;

        return head;

    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        Node f = createLinkedList(a);
        display(f);
        Node r = rotateList(f, 5);
        display(r);
    }
}
