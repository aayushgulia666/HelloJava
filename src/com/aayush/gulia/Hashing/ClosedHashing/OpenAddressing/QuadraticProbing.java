package com.aayush.gulia.Hashing.ClosedHashing.OpenAddressing;

/**
 * This class implements Quadratic probing.
 *
 * Same as linear probing but elements are stored at a distance if collision occurs.
 *
 * h(x) = (h(x) + f(i))%SIZE where x --> element , f(i) = i^2 , i = 0,1,2, and so on,
 *
 * Same as linear probing but instead of i we use i^2.
 *
 * @author Aayush Gulia  <aayushgulia88@gmail.com>
 * @since 28/09/2022
 */

public class QuadraticProbing {
    static int[] hashtable;
    static int SIZE = 10;
    static int entries;

    public static void initializeHashTable(){
        hashtable = new int[SIZE];
    }

    public static int hashFunction(int element){
        return element%SIZE;
    }

    public static int quadraticProbing(int element){
        int index = hashFunction(element);

        int i=1;
        while (hashtable[(index + i*i)%SIZE] != 0 && i <= SIZE){
            i++;
        }
        return (index + i*i)%SIZE;
    }

    public static void insert(int element){
        int index = hashFunction(element);
        float lf = loadFactor();

        if (hashtable[index] != 0 && lf < 0.5){
            index = quadraticProbing(element);
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
            }while (hashtable[(index + i*i)%SIZE] != element && hashtable[(index + i*i)%SIZE] != 0 && (index + i*i)%SIZE != index);

            return hashtable[(index + i*i) % SIZE] == element;
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
        insert(34);
        insert(34);
        insert(34);
        System.out.println(search(34));
    }
}
