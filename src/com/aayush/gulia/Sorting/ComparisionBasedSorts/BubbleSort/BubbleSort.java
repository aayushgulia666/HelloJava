package com.aayush.gulia.Sorting.ComparisionBasedSorts.BubbleSort;

/**
 * This class implements Bubble sort.
 * @since 01/20/2022
 * @author Aayush Gulia <aayushgulia07@outlook.com>
 * @see <a href="https://www.geeksforgeeks.org/bubble-sort/">Bubble Sort</a>
 */

public class BubbleSort {
    /**
     * Performs bubble sort on an array.
     * @param a array to perform bubble sort.
     */
    public static void bubbleSort(int[] a){
        int swapping = 0;
        int passes = 0;
        int comparison = 0;
        int flag = 0;
        int temp;

        for (int i=0; i<a.length-1; i++){
            for (int j=0; j<a.length-i-1; j++){
                comparison++;
                if (a[j] > a[j+1]){
                    swapping++;
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = 1;
                }
            }
            passes++;
            if (flag == 0){
                break;
            }
        }

        System.out.println("Passes: " + passes);
        System.out.println("Comparison: " + comparison);
        System.out.println("Swapping: " + swapping);
    }
}
