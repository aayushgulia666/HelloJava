package com.aayush.gulia.LinkedList;

public class ImplementSinglyLinkedList {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void createLinkedList(int[] A) {

        int i;
        Node last, temp;

        head = new Node(A[0], null);
        last = head;

        for (i = 1; i < A.length; i++) {
            temp = new Node(A[i], null);
            last.next = temp;
            last = temp;
        }
    }

    public static Node createLinkedList2(int[] A) {
        Node first, last, temp;

        first = new Node(A[0], null);
        last = first;

        for (int i = 1; i < A.length; i++) {
            temp = new Node(A[i], null);
            last.next = temp;
            last = temp;
        }
        return first;
    }

    public static void display(Node first) {

        Node p = first;
        while (p != null) {
            System.out.print(p.data + "-> ");
            p = p.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void recursiveDisplay(Node first) {
        if (first != null) {
            System.out.println(first.data);
            recursiveDisplay(first.next);
        }
    }

    public static int getCount(Node first) {
        int count = 0;

        while (first != null) {
            count++;
            first = first.next;
        }

        return count;
    }

    public static int sumOfAllElements(Node first) {
        int sum = 0;

        while (first != null) {
            sum = sum + first.data;
            first = first.next;
        }

        return sum;
    }

    public static boolean isSorted(Node first) {
        boolean sorted = true;
        Node p = first.next;
        Node foll0wPointer = first;

        while (p != null) {
            if (p.data < foll0wPointer.data) {
                sorted = false;
            }

            p = p.next;
            foll0wPointer = foll0wPointer.next;
        }

        return sorted;
    }

    public static int maxElement(Node first) {
        int max = Integer.MIN_VALUE;

        while (first != null) {
            if (first.data > max) {
                max = first.data;
            }
            first = first.next;
        }
        return max;
    }

    public static int searchElement(Node first, int key) {
        // we can only perform linear search in a linked list.

        int nodeCount = 0;

        while (first != null) {

            nodeCount++;
            if (key == first.data) {
                return nodeCount;
            }

            first = first.next;
        }

        return -1;
    }

    public static int improvedSearchElement(Node first, int key) {
        int nodeCount = 0;

        Node followPointer = first;
        Node p = first;

        if (first.data == key) {
            return 1;
        }

        while (p != null) {

            nodeCount++;

            if (p.data == key) {
                followPointer.next = p.next;
                p.next = head;
                head = p;
                return nodeCount;
            }


            followPointer = p;
            p = p.next;

        }

        return -1;
    }

    public static void insertElement(Node first, int element, int position) {

        Node followPointer = first;

        Node temp;

        if (position == 1) {
            // handle insertion on head

            temp = new Node(element, null);
            temp.next = followPointer;
            head = temp;

            System.out.println("Element inserted at index " + (position + 1));
        } else {
            // handle insertion in between or at last of linked list.

            for (int i = 1; i < position; i++) {
                followPointer = followPointer.next;
            }

            temp = new Node(element, null);
            temp.next = followPointer.next;
            followPointer.next = temp;

            System.out.println("Element inserted at index " + (position + 1));
        }
    }

    public static void insertElementInSortedOrder(Node first, int element) {

        Node p = first;
        Node followPointer = p;
        Node temp;

        int nodeCount = 0;

        if (p.data != element) {
            while (p != null && p.data < element) {
                nodeCount++;
                followPointer = p;
                p = p.next;
            }
        }


        temp = new Node(element, null);

        if (nodeCount == 0) {
            temp.next = first;
            head = temp;
        } else {
            temp.next = followPointer.next;
            followPointer.next = temp;
        }
    }

    public static int deleteElement(Node first, int element) {
        // return the element and deletes the value.

        int x;
        Node p = first;
        Node followPointer = p;

        if (p.data == element) {
            x = p.data;
            head = first.next;
            return x;
        }

        while (p != null) {
            if (p.data == element) {
                break;
            }
            followPointer = p;
            p = p.next;
        }

        assert p != null;
        x = p.data;
        followPointer.next = p.next;
        return x;
    }

    public static void removeDuplicate(Node first) {

        // this method only removes duplicate from a sorted linked list.

        Node q = first.next;
        Node p = first;

        while (q != null) {
            if (q.data != p.data) {
                q = q.next;
                p = p.next;
            } else {
                p.next = q.next;
                q = p.next;
            }
        }
    }

        /*
                we can reverse the linked list by two ways:

                1) Reverse copy the elements of the liked list.
                2) Reversing links.
        */

    public static void reverseLinkedList(Node first) {
        // sliding pointers;
        /*
                 we prefer movement of links rather than movement of data as data can be of larger size,
                 the link consumes constant memory. (size of pointer depends on the compiler).
         */

        Node p = first;
        Node q = null;
        Node r = q;


        while (p != null) {
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }

        head = q;
    }

    public static void reverseLinkedList2(Node q, Node p) {
        /*
         *  p - pointer
         *  q - follow pointer
         *
         */

        System.out.println("Yet to be implemented!");
    }

    public static void concatLinkedList(Node first, Node second) {
        // append first linked list with second linked list.

        Node p = first;

        while (p.next != null) {
            p = p.next;
        }
        p.next = second;
    }

    static Node mergeLinkedList(Node first, Node second) {
    /*
      1) Merging using third linked list
    */

        Node third, last, temp;

        Node p = first;
        Node q = second;

        if (p.data < q.data) {
            third = new Node(p.data, null);
            p = p.next;
        } else {
            third = new Node(q.data, null);
            q = q.next;
        }
        last = third;

        while (p != null && q != null) {
            if (p.data < q.data) {
                temp = new Node(p.data, null);
                last.next = temp;
                last = temp;

                p = p.next;
            } else {
                temp = new Node(q.data, null);
                last.next = temp;
                last = temp;

                q = q.next;
            }
        }

        // if nodes are left join it to third linked list as they are already sorted.

        if (p != null) {
            last.next = p;
        }

        if (q != null) {
            last.next = q;
        }

        return third;
    }

    public static Node mergeLinkedList2(Node first, Node second) {
        Node third, last;

        if (first.data < second.data) {
            third = last = first;
            first = first.next;
        } else {
            third = last = second;
            second = second.next;
        }

        last.next = null;

        while (first != null && second != null) {
            if (first.data < second.data) {
                last.next = first;
                last = first;
                first = first.next;
                last.next = null;
            } else {
                last.next = second;
                last = second;
                second = second.next;
                last.next = null;
            }
        }

        if (first != null) {
            last.next = first;
        }

        if (second != null) {
            last.next = second;
        }

        return third;
    }

    public static void main(String[] args) {

        int[] A = {2, 4, 6, 8, 10};
        int[] B = {3, 6, 9, 12, 15};

        Node first = createLinkedList2(A);
        Node second = createLinkedList2(B);

        Node third = mergeLinkedList2(first, second);
        display(third);
    }


}
