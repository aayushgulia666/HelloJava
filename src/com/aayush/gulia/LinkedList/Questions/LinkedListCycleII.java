package com.aayush.gulia.LinkedList.Questions;

import java.util.HashMap;

public class LinkedListCycleII {
    static class Node{
        int val;
        Node next;

        Node(){}
        Node(int val){
            this.val = val;
        }
        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

    static Node createLinkedList(int[] a){
        Node head, last, temp;
        int i;

        head = new Node(a[0], null);
        last=head;

        for (i=1; i<a.length; i++){
            temp = new Node(a[i], null);
            last.next = temp;
            last=temp;
        }
        return head;
    }

    static void display(Node head){
        int limit=0;
        while (head != null){
            if (limit == 20) break;
            System.out.print(head.val + " ");
            head=head.next;
            limit++;
        }
        System.out.println();
    }

    /**
     * We can detect the starting node of Linked list by two ways:
     * 1) Using hashing T:O(n), S:O(n)
     * 2) Using slow and fast pointer T:O(n), S:O(1)
     *
     * @param head start of linked list
     */

    static Node detectCycleUsingHashing(Node head){

        if (head == null) return null;

        HashMap<Node, Integer> map = new HashMap<>();

        Node p = head;

        while (p!=null){
            if (map.containsKey(p)){
                return p;
            }
            map.put(p, 1);
            p=p.next;
        }

        return null;
    }

    static Node detectCycleUsingPointers(Node head){
        if (head == null) return null;

        Node slow = head, fast = head, start = head;

        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if (slow == fast){
                while (start != slow){
                    start=start.next;
                    slow=slow.next;
                }
                return start;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        Node f = createLinkedList(a);
        Node t = f;

        //add cycle in linked list.
        while (t.next!=null){
            t=t.next;
        }
        Node p = f;
        for (int i=0; i<2; i++){
            p=p.next;
        }
        t.next = p;

        //code starts form here.

//        Node cycleNode = detectCycleUsingHashing(f);
        Node cycleNode = detectCycleUsingPointers(f);

        if (cycleNode!=null){
            System.out.println(cycleNode + " val is: " + cycleNode.val);
        }

    }
}
