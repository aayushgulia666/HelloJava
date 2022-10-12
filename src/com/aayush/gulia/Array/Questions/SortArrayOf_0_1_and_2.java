package com.aayush.gulia.Array.Questions;

import java.util.Arrays;

/**
 * @author Aayush Gulia <aayushgulia07@outlook.com>
 * @since 12/10/2022
 * @see <a href="https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/">Sort array of 0, 1 and 2</a>
 */

public class SortArrayOf_0_1_and_2 {
    /**
     * Naive approach will be sort the array.
     * T:O(n log n)
     * S:O(1)
     * @param a array of elements.
     */
    private static void sortArray(int[] a){
        // assume merge sort.
        Arrays.sort(a);
    }

    /**
     * Count the no's of element and fill the elements.
     * T:O(N^2)
     * S:O(1)
     * @param a array of elements.
     */

    private static void countSort(int[] a){
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;
        int k;

        // count occurrence of 0,1 and 2.
        for (int j : a) {
            if (j == 0) {
                count_0++;
            }
            if (j == 1) {
                count_1++;
            }
            if (j == 2) {
                count_2++;
            }
        }

        // fill elements.
        for (int i=0; i<a.length; i++){
            if (count_0 != 0){
                a[i] = 0;
                count_0--;
                continue;
            }

            if (count_1 != 0){
                a[i] = 1;
                count_1--;
                continue;
            }

            if (count_2 != 0){
                a[i] = 2;
                count_2--;
            }
        }

    }

    /**
     * Use three pointer to sort 0,1 and to in single pass.
     * T:O(N)
     * S:O(1)
     * @param a array of elements.
     */
    private static void dutchNationFlagAlgorithm(int[] a){
        int low = 0;
        int mid = 0;
        int high = a.length-1;

        while (mid<high){
            switch (a[mid]) {

                case 0 -> {
                    a[low] = a[low] ^ a[high];
                    a[mid] = a[low] ^ a[high];
                    a[low] = a[low] ^ a[high];
                    low++;
                    mid++;
                }

                case 1 -> mid++;

                case 2 -> {
                    a[mid] = a[mid] ^ a[high];
                    a[high] = a[mid] ^ a[high];
                    a[mid] = a[mid] ^ a[high];
                    high--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {0,1,2,0,1,2,1,1,1,2,2,2,0,0,0};
        dutchNationFlagAlgorithm(a);
        System.out.println(Arrays.toString(a));
    }
}