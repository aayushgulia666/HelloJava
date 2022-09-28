package com.aayush.gulia.Hashing.OpenHashing;

/**
 * This class implements Chaining.
 *
 * Chaining is a Hashing technique.
 *
 * @author Aayush Gulia <aayushgulia07@outlook.com>
 * @since 26/09/2022
 * @see <a href="https://www.educative.io/answers/what-is-chaining-in-hash-tables">Chaining in hashing</a>
 */
public class Chaining {

    /**
     * This class describes the structure of node used in hash table.
     */

    static class Node{
        int data;
        Node next;

        /**
         * Constructor creates a new node whenever called.
         *
         * @param data element stored
         * @param next reference to next node.
         */

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    /**
     * Global reference to hash table.
     */

    static Node[] hashTable = new Node[10];

    /**
     * Initializes hash table.
     *
     * creates node and assign memory to each node.
     *
     * This method must be called inorder to use hash table.
     */

    static void initializeHashTable(){
        for (int i=0; i<hashTable.length; i++){
            hashTable[i] = new Node(-1, null);
        }
    }

    /**
     * Insert element inside the hash table.
     * @param element data inserted.
     */

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

    /**
     * Inserts element in hash table in sorted order.
     * @param element data inserted in hash table.
     */

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

    /**
     * This function is responsible for assigning index to every element i.,e (hash).
     *
     * Hashing function maps the data to hash table.
     * @param element data to be inserted
     * @return hash value or digest (i.,e index where the element will be inserted.)
     */

    static int hashFunction(int element){
        return element%10;
    }

    /**
     * Inserts single element in sorted order.
     * @param element data to be inserted.
     */

    public static void insert(int element){
        insertElementInSortedOrder(element);
    }

    /**
     * Inserts an array of elements at once.
     * @param elements array of element of type integer.
     */

    public static void insertData(int[] elements){
        for (int element : elements) {
            insert(element);
        }
    }

    /**
     * search an element inside the hash table.
     *
     * @param element data to be searched.
     * @return returns a boolean value.
     */

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

    public static void main(String[] args) {
        initializeHashTable();
        insertData(new int[] {1,2,3,4,5,6,66,666,6666,66666666,7});
        System.out.println(search(7));
    }
}
