package com.aayush.gulia.Sorting.ComparisionBasedSorts.SelectionSort;

import java.util.Arrays;

/**
 * This class implements selection sort.
 *
 * Kth pass gives Kth small element.
 *
 * @author Aayush Gulia <aayushgulia07@outlook.com>
 * @see <a href="https://www.geeksforgeeks.org/selection-sort/">Selection sort</a>
 */

public class SelectionSort {

    /**
     * Performs selection sort on an array.
     * @param a array on which selection sort is performed.
     */
    public static void selectionSort(int[] a){
        int i,j,k;
        int temp;

        for (i=0; i<a.length-1; i++){
            for (j=k=i; j<a.length; j++){
                if (a[j] < a[k]){
                    k=j;
                }
            }
            temp = a[i];
            a[i] = a[k];
            a[k] = temp;
        }

        System.out.println(Arrays.toString(a));
    }
}
