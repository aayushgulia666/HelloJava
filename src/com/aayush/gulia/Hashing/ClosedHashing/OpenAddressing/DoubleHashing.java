package com.aayush.gulia.Hashing.ClosedHashing.OpenAddressing;

public class DoubleHashing {
    static int[] hashtable;
    static int SIZE = 10;
    static int PRIME = 7;
    static int entries;

    public static void initializeHashTable(){
        hashtable = new int[SIZE];
    }

    public static int hashFunction(int element){
        return element % SIZE;
    }

    public static int primeHash(int key){
        return PRIME - (key % PRIME);
    }

    public static int doubleHash(int element){
        int index = hashFunction(element);

        int i = 0;
        while (hashtable[(index + i * primeHash(index)) % SIZE] != 0 ){
           i++;
        }

        return (index + i * primeHash(index)) % SIZE;
    }

    public static void insertElement(int element){
        int index = hashFunction(element);

        if (hashtable[index] != 0){
            index = doubleHash(element);
        }

        hashtable[index] = element;
    }

    public static float loadFactor(){
        float lf = 0;
        if (entries != 0){
            lf = (float) entries/SIZE;
        }
        return lf;
    }

    public static void main(String[] args) {
        initializeHashTable();
        insertElement(34);
        insertElement(34);
        insertElement(34);
        insertElement(34);
        insertElement(34);
    }
}
