package com.aayush.gulia.Sorting.IndexBasedSorts.CountSort;

/**
 * This class implements Count sort.
 *
 * @author Aayush Gulia <aayushgulia07@outlook.com>
 * @since 03/10/2022
 */

public class CountSort {

    /**
     * Performs count sort on an array
     * @param a array of elements.
     */

    public static void countSort(int[] a){
        int i;
        int max = maxElement(a);
        int[] count = new int[max+1];

        for (i=0; i<a.length; i++){
            count[a[i]]++;
        }
        int j=0;

        for (i=0; i< count.length; i++){
            if (count[i] != 0){
                while (count[i] != 0){
                    a[j++] = i;
                    count[i]--;
                }
            }
        }
    }

    /**
     * Finds the maximum element in the array
     * @param a array of elements.
     * @return maximum element in the array.
     */

    public static int maxElement(int[] a){
        int max = Integer.MIN_VALUE;

        for (int j : a) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
