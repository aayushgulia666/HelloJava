package com.aayush.gulia.Hashing.OpenHashing;

/**
 * This class implements Chaining.
 *
 * Chaining is a Hashing technique.
 *
 * @author Aayush Gulia <aayushgulia07@outlook.com>
 * @since 26/09/2022
 */
public class Chaining {

    static class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    static Node[] hashTable = new Node[10];

    static void initializeHashTable(){
        for (int i=0; i<hashTable.length; i++){
            hashTable[i] = new Node(-1, null);
        }
    }

    static void insertElement(int element){
        Node p, temp;
        temp = new Node(element, null);

        int index = hashFunction(element);

        p = hashTable[index];

        while (p.next != null){
            p = p.next;
        }
        p.next = temp;
    }

    static void insertElementInSortedOrder(int element){
        Node temp = new Node(element, null);
        Node p, f;

        int index = hashFunction(element);
        f = p = hashTable[index];

        while (p != null && p.data < element){
            f=p;
            p = p.next;
        }

        temp.next = p;
        f.next = temp;
    }

    static int hashFunction(int element){
        return element%10;
    }

    public static void insert(int element){
        insertElementInSortedOrder(element);
    }

    public static void insertData(int[] elements){
        for (int element : elements) {
            insert(element);
        }
    }

    public static boolean search(int element){
        Node p = hashTable[hashFunction(element)];

        if (p.data == element){
            return true;
        }

        while (p != null) {
            if (p.data == element) {
                return true;
            }

            p = p.next;
        }
        return false;
    }
}
