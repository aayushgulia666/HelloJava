package com.aayush.gulia.LinkedList;

public class ImplementSinglyLinkedList {

    static Node<Integer> head;

    static class Node<T>{
        T data;
        Node<Integer> next;

        Node(T data, Node<Integer> next){
            this.data = data;
            this.next = next;
        }
    }

    static void createLinkedList(int[] A){

        int i;
        Node<Integer> last, temp;

        head = new Node<>(A[0], null);
        last = head;

        for (i=1; i<A.length; i++){
            temp = new Node<>(A[i], null);
            last.next = temp;
            last=temp;
        }
    }

    static Node<Integer> createLinkedList2(int[] A){
        Node<Integer> first, temp, last;

        first = new Node<>(A[0], null);
        last=first;

        for (int i=1; i<A.length; i++){
            temp = new Node<>(A[i], null);
            last.next = temp;
            last=temp;
        }

        return first;
    }

    static void display(Node<Integer> first){

        Node<Integer> p = first;
        while (p != null){
            System.out.print(p.data + "-> ");
            p = p.next;
        }
        System.out.print("null");
        System.out.println();
    }

    static void recursiveDisplay(Node<Integer> first){
        if (first != null){
            System.out.println(first.data);
            recursiveDisplay(first.next);
        }
    }

    static int getCount(Node<Integer> first){
        int count = 0;

        while (first != null){
            count++;
            first = first.next;
        }

        return count;
    }

    static int sumOfAllElements(Node<Integer> first){
        int sum = 0;

        while (first != null){
            sum = sum + first.data;
            first = first.next;
        }

        return sum;
    }

    static boolean isSorted(Node<Integer> first){
        boolean sorted = true;
        Node<Integer> p = first.next;
        Node<Integer> foll0wPointer = first;

        while (p != null){
            if (p.data < foll0wPointer.data){
                sorted = false;
            }

            p = p.next;
            foll0wPointer = foll0wPointer.next;
        }

        return sorted;
    }

    static int maxElement(Node<Integer> first){
        int max = Integer.MIN_VALUE;

        while (first != null){
            if (first.data > max){
                max = first.data;
            }
            first = first.next;
        }
        return max;
    }

    static int searchElement(Node<Integer> first, int key){
        // we can only perform linear search in a linked list.

        int nodeCount = 0;

        while (first != null){

            nodeCount++;
            if (key == first.data){
                return nodeCount;
            }

            first =first.next;
        }

        return -1;
    }

    static int improvedSearchElement(Node<Integer> first, int key){
        int nodeCount = 0;

        Node<Integer> followPointer = first;
        Node<Integer> p = first;

        if (first.data == key){
            return 1;
        }

        while(p != null){

            nodeCount++;

            if (p.data == key){
                followPointer.next = p.next;
                p.next = head;
                head = p;
                return  nodeCount;
            }


            followPointer = p;
            p = p.next;

        }

        return -1;
    }

    static void insertElement(Node<Integer> first, int element, int position){

        Node<Integer> followPointer = first;

        Node<Integer> temp;

        if (position == 1){
            // handle insertion on head

            temp = new Node<>(element, null);
            temp.next = followPointer;
            head = temp;

            System.out.println("Element inserted at index " + (position+1));
        }

        else{
            // handle insertion in between or at last of linked list.

            for (int i=1; i<position; i++){
                followPointer = followPointer.next;
            }

            temp = new Node<>(element, null);
            temp.next = followPointer.next;
            followPointer.next = temp;

            System.out.println("Element inserted at index " + (position+1));
        }
    }

    static void insertElementInSortedOrder(Node<Integer> first, int element){

        Node<Integer> p = first;
        Node<Integer> followPointer = p;
        Node<Integer> temp;

        int nodeCount = 0;

        if (p.data != element){
            while (p!= null && p.data < element){
                nodeCount++;
                followPointer = p;
                p=p.next;
            }
        }


        temp = new Node<>(element, null);

        if (nodeCount == 0){
            temp.next = first;
            head = temp;
        }

        else{
            temp.next = followPointer.next;
            followPointer.next = temp;
        }
    }

    static int deleteElement(Node<Integer> first, int element){
        // return the element and deletes the value.

        int x;
        Node<Integer> p = first;
        Node<Integer> followPointer = p;

        if (p.data == element){
            x = p.data;
            head = first.next;
            return x;
        }

        while (p!= null){
            if (p.data == element){
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

    static void removeDuplicate(Node<Integer> first){

        // this method only removes duplicate from a sorted linked list.

        Node<Integer> q = first.next;
        Node<Integer> p = first;

        while (q!=null){
            if (q.data != p.data){
                q = q.next;
                p = p.next;
            }

            else{
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

    static void reverseLinkedList(Node<Integer> first){
        // sliding pointers;
        /*
                 we prefer movement of links rather than movement of data as data can be of larger size,
                 the link consumes constant memory. (size of pointer depends on the compiler).
         */

        Node<Integer> p = first;
        Node<Integer> q = null;
        Node<Integer> r = q;


        while (p != null){
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }

        head = q;
    }

    private static void reverseLinkedList2(Node<Integer> q, Node<Integer> p) {
        /*
        *  p - pointer
        *  q - follow pointer
        *
        */

        System.out.println("Yet to be implemented!");
    }

    private static void concatLinkedList(Node<Integer> first, Node<Integer> second){
        // append first linked list with second linked list.

        Node<Integer> p = first;

        while (p.next != null){
            p = p.next;
        }
        p.next = second;
    }

    static Node<Integer> mergeLinkedList(Node<Integer> first, Node<Integer> second){
    /*
      1) Merging using third linked list
    */

        Node<Integer> third, last, temp;

        Node<Integer> p = first;
        Node<Integer> q = second;

        if (p.data < q.data){
            third = new Node<>(p.data, null);
            p = p.next;
        }
        else{
            third = new Node<>(q.data, null);
            q= q.next;
        }
        last=third;

        while (p != null && q != null){
            if (p.data < q.data){
                temp = new Node<>(p.data, null);
                last.next = temp;
                last=temp;

                p=p.next;
            }
            else{
                temp = new Node<>(q.data, null);
                last.next = temp;
                last=temp;

                q=q.next;
            }
        }

        // if nodes are left join it to third linked list as they are already sorted.

        if (p != null){
            last.next = p;
        }

        if (q != null){
            last.next = q;
        }

        return third;
    }

    public static void main(String[] args) {

        int [] A = {2,4,6,8,10};
        int [] B = {3,6,9,12,15};

        Node<Integer> first = createLinkedList2(A);
        display(first);
        Node<Integer> second = createLinkedList2(B);
        display(second);

        Node<Integer> third = mergeLinkedList(first, second);
        display(third);

    }


}