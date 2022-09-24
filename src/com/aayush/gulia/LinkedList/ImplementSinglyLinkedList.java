package com.aayush.gulia.LinkedList;

/**
 * This class shows implementation of Singly Linked List.
 *
 * @see <a href="https://www.hackerearth.com/practice/data-structures/linked-list/singly-linked-list/tutorial/">Singly linked list</a>
 * @since 23-09-2022
 */

public class ImplementSinglyLinkedList {

    /**
     * Global reference for linked list.
     */

    static Node head;

    /**
     * Singly Linked List node structure is defined in Node class.
     */

    static class Node {
        int data;
        Node next;

        /**
         * This constructor is called whenever a node is created.
         *
         *
         * @param data stores the data that user wants to store inside the node of linked list.
         * @param next stores the reference to next node of the linked list.
         */

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    /**
     * This method creates a linked list.
     *
     * @param A An array which stores the elements to be inserted into the linked list.
     */

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

    /**
     * This method creates a singly linked list and returns an object of type Node pointing to the head of the linked list.
     *
     * @param A An array which stores the elements to be inserted into the linked list.
     * @return returns a Node pointing to the linked list.
     */

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

    /**
     * Display all the elements inside the linked list.
     * @param first Linked List to display.
     */

    public static void display(Node first) {

        Node p = first;
        while (p != null) {
            System.out.print(p.data + "-> ");
            p = p.next;
        }
        System.out.print("null");
        System.out.println();
    }

    /**
     * Display all the elements inside the linked list recursively.
     * @param first Linked List to display.
     */

    public static void recursiveDisplay(Node first) {
        if (first != null) {
            System.out.println(first.data);
            recursiveDisplay(first.next);
        }
    }

    /**
     * Returns the number of nodes in the linked list.
     * @param first Linked List to get the count.
     * @return an integer equal to number of nodes in the linked list.
     */

    public static int getCount(Node first) {
        int count = 0;

        while (first != null) {
            count++;
            first = first.next;
        }

        return count;
    }

    /**
     * Returns the sum of all elements of the linked list.
     * @param first Linked List to get the sum of all the nodes (elements).
     * @return an integer having sum of all the elements of the linked list.
     */

    public static int sumOfAllElements(Node first) {
        int sum = 0;

        while (first != null) {
            sum = sum + first.data;
            first = first.next;
        }

        return sum;
    }

    /**
     * Check if the linked list is sorted or not.
     * @param first Head of the linked list.
     * @return a boolean value telling list is sorted or not.
     */

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

    /**
     * Returns the maximum element in the linked list.
     * @param first Linked list to get the maximum element.
     * @return an integer having the maximum element.
     */

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

    /**
     * Searches for a key inside the linked list.
     * @param first Linked list to perform searching.
     * @param key The element which is searched.
     * @return an integer 1 if key is found else returns -1.
     */

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

    /**
     * Improved version of method searchElement().
     *
     * Once the key is found, the node containing
     * the key is shifted to the head of the linked list.
     * If the key is searched again it is found in only one iteration
     * @param first Head of the linked list.
     * @param key Element to search inside the linked list.
     * @return an integer 1 if key is found else -1.
     */

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

    /**
     * Inserts an element at a given position in the linked list.
     *
     * @param first Linked list in which element will be inserted.
     * @param element Value of element to be inserted.
     * @param position Position at which the element will be inserted into linked list.
     */

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

    /**
     * Inserts element in the sorted linked list in sorted order.
     *
     * @param first Linked list in which the element will be inserted.
     * @param element value of the element.
     */

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

    /**
     *Return the element and delete it from the linked list.
     *
     * deleteElement() method searches the element
     * in the linked list and if found returns the value
     * and deletes it from the linked list.
     *
     * If the element is not found then -1 is returned.
     *
     * @param first head of the linked list.
     * @param element value of element to be deleted from the linked list.
     * @return deleted element is returned.
     */

    public static int deleteElement(Node first, int element) {
        // return the element and deletes the value.

        int x = -1;
        Node p = first;
        Node followPointer = p;

        // if element is found at head.
        if (p.data == element) {
            x = p.data;
            head = first.next;
            return x;
        }

        // search in the linked list.
        while (p != null) {
            if (p.data == element) {
                break;
            }
            followPointer = p;
            p = p.next;
        }

        if (p != null){
            x = p.data;
            followPointer.next = p.next;
            return x;
        }

        return x;
    }

    /**
     * Removes all the duplicate elements form the linked list, the linked list should be sorted otherwise this
     * method will not work.
     *
     * @param first Linked List
     */

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

    /**
     * Reverses the linked list.
     *
     * @param first Linked List
     */

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

    /**
     * This method is yet to be implemented.
     * @param q Node
     * @param p Node
     */

    public static void reverseLinkedList2(Node q, Node p) {
        /*
         *  p - pointer
         *  q - follow pointer
         *
         */

        System.out.println("Yet to be implemented!");
    }

    /**
     * Appends first linked list with second.
     *
     * @param first First linked list.
     * @param second Second Linked list.
     */

    public static void concatLinkedList(Node first, Node second) {
        // append first linked list with second linked list.

        Node p = first;

        while (p.next != null) {
            p = p.next;
        }
        p.next = second;
    }

    /**
     * Merges both the linked list and returns a new linked list.
     *
     * After merging the resulting linked list is in sorted order.
     *
     * @param first Linked list <i>first</i>.
     * @param second Linked list <i>second</i>.
     * @return Node pointing to the third linked list containing the merged linked list.
     */

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

        // if nodes are left, join it to third linked list as they are already sorted.

        if (p != null) {
            last.next = p;
        }

        if (q != null) {
            last.next = q;
        }

        return third;
    }

    /**
     * Merge both the linked list without using a new linked list.
     *
     * @param first Linked list <i>first</i>.
     * @param second Linked list <i>second</i>.
     * @return Merged linked list.
     */

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

    /**
     * Tells if loop is present in a linked list.
     *
     * @param first First element of linked list.
     * @return a true if loop is present else returns false.
     */

    public static boolean isLoop(Node first){
        Node p, q;
        p = q = first;

        do {
            p = p.next;
            q = q.next;

            if (p != null){
                p = p.next;
            }

        }while (p != null && q != null && p!=q);

        return p == q;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        Node first = createLinkedList2(a);

        // creates a loop in the linked list.
        Node n1 = first.next;
        Node n2 = first.next.next.next;
        n2.next = n1;

        System.out.println(isLoop(first));

    }
}
