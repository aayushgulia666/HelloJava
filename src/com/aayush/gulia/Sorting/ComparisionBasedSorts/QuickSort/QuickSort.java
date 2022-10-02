package com.aayush.gulia.Sorting.ComparisionBasedSorts.QuickSort;

import java.util.Arrays;

/**
 * This class implements quick sort.
 *
 * @author Aayush Gulia <aayushgulia07@outlook.com>
 * @see <a href="https://www.geeksforgeeks.org/quick-sort/">Quick Sort</a>
 * @since 02/10/2022
 */

public class QuickSort {
    /**
     * Returns the partitioning position.
     * @param a array of elements on which quick sort is performed.
     * @param low index
     * @param high index
     * @return partitioning index.
     */
    public static int partition(int[] a, int low, int high){
        int pivot = a[low];
        int i=low, j=high;
        int temp;

        do{
            do {i++;}while (a[i]<=pivot);

            do {j--;}while (a[j]>pivot);

            if (i<j){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }while (i<j);

        temp = a[low];
        a[low] = a[j];
        a[j] = temp;

        return j;

    }

    /**
     * Performs quick sort recursively.
     * @param a array to be sorted.
     * @param low starting index of an array
     * @param high end index of an array.
     */

    public static void quickSort(int[] a, int low, int high){

        int j;

        if (low < high){
            j = partition(a, low, high);
            quickSort(a, low, j);
            quickSort(a, j+1, high);
        }
    }

    public static void main(String[] args) {
        int[] a =  {50,70,60,90,40,80,10,20,30,Integer.MAX_VALUE};

        // MAX_VALUE behaves as infinity.

        quickSort(a, 0, a.length-1);

        System.out.println(Arrays.toString(a));
    }
}
