package com.aayush.gulia.LinkedList.Questions;

/**
 * Leet code 21
 */

public class MergeLL {
    static class Node{
        int data;
        Node next;
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
        Node(Integer o, Object next){

        }
    }


    static Node head;

    static Node createLinkedList(int[] a){
        if (a.length == 0){
            return new Node(null, null);
        }

       Node first = new Node(a[0], null);
       Node temp, last;
       last=first;

        for (int i=1; i<a.length; i++){
            temp = new Node(a[i], null);
            last.next = temp;
            last=temp;
        }

        return first;
    }

    static void display(Node first){
        Node p = first;
        while (p!=null){
            System.out.print(p.data + " ");
            p=p.next;
        }
        System.out.println();
    }

    static Node merge(Node list1, Node list2){
        Node third, last;

        if(list1.data < list2.data){
            third = last = list1;
            list1 = list1.next;
        }

        else{
            third = last = list2;
            list2 = list2.next;
        }

        last.next=null;

        while (list1 != null && list2 != null){
            if (list1.data < list2.data){
                last.next = list1;
                last = list1;
                list1 = list1.next;
//                last.next = null;
            }

            else{
                last.next = list2;
                last = list2;
                list2 = list2.next;
//                last.next = null;
            }
        }

        while(list1 != null){
            last.next = list1;
            last = list1;
            list1 = list1.next;
//            last.next = null;
        }

        while(list2 != null){
            last.next = list2;
            last = list2;
            list2 = list2.next;
//            last.next = null;
        }

        return third;
    }

    public static void main(String[] args) {
        int[] a = {1,2,4,5,6};
        int[] b = {2,4,6,8,10};
        Node first = createLinkedList(a);
        Node second = createLinkedList(b);
        Node third = merge(first, second);

        display(third);
    }
}
