package com.aayush.gulia.LinkedList.Questions;

/**
 * Leet code 25
 */

public class ReverseNodesInKGroup {
    static class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    private static Node createLinkedList(int[] a){
        Node head = new Node(a[0], null);
        Node last, temp;
        last = head;

        for (int i=1; i<a.length; i++){
            temp = new Node(a[i], null);
            last.next = temp;
            last=temp;
        }

        return head;
    }

    private static void display(Node head){
        Node p = head;

        while (p != null){
            System.out.print(p.data + " ");
            p=p.next;
        }
        System.out.println();
    }

    private static Node reverseLinksInGroupK(Node head, int k){

        if (head == null || k == 1) return head;

        Node dummy = new Node(0, head);

        int count = 0;
        Node p = dummy;

        while (p.next!=null){
            count++;
            p=p.next;
        }
        Node prev = dummy, cur = dummy, nxt = dummy;

        while (count >= k){
            cur = prev.next;
            nxt = cur.next;

            for (int i=1; i<k; i++){
                cur.next = nxt.next;
                nxt.next = prev.next;
                prev.next = nxt;
                nxt = cur.next;
            }
            prev = cur;
            count -= k;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        Node f = createLinkedList(a);
        display(f);
        Node f2 = reverseLinksInGroupK(f, 2);
        display(f2);
    }
}
