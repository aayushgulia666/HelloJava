package com.aayush.gulia.Searching.BinarySearch;

/**
 * This class implements binary search.
 *
 * @since 01/10/2022
 *
 * @see <a href="https://ai.googleblog.com/2006/06/extra-extra-read-all-about-it-nearly.html">Bug in binary search</a>
 *
 */

public class BinarySearch {

    /**
     * Searches and returns the index of searched element, if not found return -1.
     * @param a array to perform binary search.
     * @param key element to search in an array.
     * @return index of element in an array.
     */
    public static int binarySearch(int[] a, int key){
        int low = 0;
        int high = a.length-1;

        while(low <= high){

            /*
             * if we use "int mid = (low + high)/2;"
             *
             * For large low and high sum overflows to negative value.
             */

            int mid = low + ((high - low) / 2);

            if (key == a[mid]){
                return mid;
            }

            else if(key > a[mid]){
                low = mid + 1;
            }

            else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};

        System.out.println(binarySearch(a, 5));
    }
}
