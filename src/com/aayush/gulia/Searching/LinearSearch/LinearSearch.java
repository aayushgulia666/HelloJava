package com.aayush.gulia.Searching.LinearSearch;

/**
 * This class implements linear search.
 *
 * @since 01/10/2022
 */

public class LinearSearch {

    /**
     * Search the element in the array and return the index if element is found, else return -1.
     * @param a an array of elements.
     * @param key element to search in the array.
     * @return index of element if found else -1.
     */
    public static int linearSearch(int[] a, int key){
        for (int i=0; i<a.length; i++){
            if (a[i] == key){
                return i;
            }
        }
        return -1;
    }
}
