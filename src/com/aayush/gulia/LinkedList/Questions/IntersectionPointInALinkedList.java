package com.aayush.gulia.LinkedList.Questions;

import java.util.HashMap;

public class IntersectionPointInALinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
        Node(){
        }
    }
    static Node createLinkedList(int[] a){
        if (a.length == 0) return new Node();

        Node head, temp, last;
        head = new Node(a[0], null);
        last=head;

        for (int i=1; i<a.length; i++){
            temp = new Node(a[i], null);
            last.next = temp;
            last=temp;
        }
        return head;
    }
    static void display(Node head){
        Node p = head;
        while (p!=null){
            System.out.print(p.data + " ");
            p=p.next;
        }
        System.out.println();
    }
    static void display(Node first, Node second){
        Node f = first;
        Node s = second;

        System.out.println("First LL: ");
        while (f != null){
            System.out.print(f.data + " ");
            f=f.next;
        }

        System.out.println();
        System.out.println("Second LL: ");
        while (s != null){
            System.out.print(s.data + " ");
            s=s.next;
        }
        System.out.println();
    }

    /**
     * Brute force approach
     * @param first Linked list
     * @param second Linked list
     */
    static void intersectionNode(Node first, Node second){
        Node f = first;
        Node s = second;

        while (f != null){
            while (s != null){
                if (f == s){
                    System.out.println("Intersection at " + f.data);
                    return;
                }
                else{
                    s=s.next;
                }
            }
            f=f.next;
            s=second;
        }
        System.out.println("No intersection found");
    }

    /**
     * Optimal approach using hashing
     * @param first Linked list
     * @param second Linked list
     */
    static void intersectionNodeUsingHashing(Node first, Node second){
        HashMap<Node, Integer> map = new HashMap<>();

        while (first != null){
            map.put(first, 1);
            first = first.next;
        }

        while (second != null){
            if (map.containsKey(second)) {
                System.out.println("Intersection at : " + second.data);
                return;
            }
            second = second.next;
        }
    }

    static void intersectionNodeUsingTempVariable(Node first, Node second){
        Node f = first;
        Node s = second;

        // node will be equal only at intersection or when null
        while (f != s){
            f = f == null ? second : f.next;
            s = s == null ? first : s.next;
        }

        System.out.println("Intersection at : " + f.data);
    }

    public static void main(String[] args) {
        HashMap<Node, Integer> map = new HashMap<>();
        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10};
        Node first = createLinkedList(a);
        Node second = createLinkedList(b);
        display(first, second);
        Node t1 = first;
        //add intersection
        for (int i=0; i < (a.length/2); i++){
            t1=t1.next;
        }

        Node t2 = second;

        for (int i=0; i< (b.length/2); i++){
            t2=t2.next;
        }

        t1.next = t2;
//        display(first, second);

        intersectionNodeUsingTempVariable(first, second);
    }
}
