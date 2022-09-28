package com.aayush.gulia.Hashing.ClosedHashing.OpenAddressing;

/**
 * This class implement Linear probing.
 *
 */

public class LinearProbing {

    static int[] hashtable;
    static int SIZE = 10;
    static int entries;

    public static void initializeHashTable(){
        hashtable = new int[SIZE];
    }

    public static int hashFunction(int element){
        return element%SIZE;
    }

    public static int probing(int element){
        int index = hashFunction(element);

        int i=1;
        while (hashtable[(index + i)%SIZE] != 0 && i <= SIZE){
            i++;
        }
        return (index + i)%SIZE;
    }

    public static void insert(int element){
        int index = hashFunction(element);
        float lf = loadFactor();

        if (hashtable[index] != 0 && lf < 0.5){
            index = probing(element);
        }

        if (lf < 0.5){
            hashtable[index] = element;
            entries++;
        }

        else{
            System.out.println("No more insertions permitted");
        }
    }

    public static boolean search(int element){
        int index = hashFunction(element);

        if (hashtable[index] == element){
            return true;
        }
        else
        {
            int i = 0;

            do {
                i++;
            }while (hashtable[(index + i)%SIZE] != element && hashtable[(index + i)%SIZE] != 0 && (index + i)%SIZE != index);

            return hashtable[(index + i) % SIZE] == element;
        }
    }

    /**
     * Displays the load factor of hash table.
     *
     * Load factor = m/n ,
     * where m = number of entries in hash table && n = total size of hash table.
     */

    public static float loadFactor(){
        float lf = 0;
        if (entries != 0){
            lf = (float) entries/SIZE;
        }
        return lf;
    }

    public static void main(String[] args) {
        initializeHashTable();
    }
}
