package com.aayush.gulia.Sorting.ComparisionBasedSorts.InsertionSort;

import java.util.Arrays;

/**
 * This class implements Insertion sort.
 *
 * @author Aayush Gulia <aayushgulia07@outlook.com>
 * @see <a href="https://www.geeksforgeeks.org/insertion-sort/">Insertion Sort</a>
 */
public class InsertionSort {
    /**
     *Performs insertion sort on an array.
     *
     * @param a array on which insertion sort is performed.
     */
    public static void insertionSort(int[] a){
        int i,j,temp;
        int passes = 0;
        int comparison = 0;

        for (i = 1; i<a.length; i++){
            temp = i;
            j = i - 1;
            comparison++;

            while (j > -1 && a[j] > temp){
                a[j+1] = a[j];
                j--;
            }
            passes++;
            a[j+1]=temp;
        }

        System.out.println("passes: " + passes);
        System.out.println("comparison: " + comparison);
        System.out.println(Arrays.toString(a));
    }
}
