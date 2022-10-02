package com.aayush.gulia.Sorting.ComparisionBasedSorts.MergeSort;

/**
 * This class implements Merge sort.
 *
 * @author Aayush Gulia <aayushgulia07@outlook.com>
 * @since 03/10/2022
 * @see <a href="https://www.geeksforgeeks.org/merge-sort/">Merge Sort</a>
 *
 */

public class MergeSort {
    public static int[] b = new int[100];
    /**
     * Merge two sorted list present in a single array.
     *
     * Merging is the process of combining two sorted list into a single list.
     * @param a array of elements.
     * @param l low pointer.
     * @param mid mid pointer.
     * @param h high pointer.
     */
    public static void merge(int[] a, int l, int mid, int h){

        int i = l;
        int j = mid+1;
        int k = l;

        while (i<=mid && j<=h){
            if (a[i] < a[j]){
                b[k++] = a[i++];
            }

            else{
                b[k++] = a[j++];
            }
        }

        for (;i<=mid;i++){
            b[k++] = a[i];
        }

        for (;j<=h;j++){
            b[k++] = a[j];
        }

        for (i=0; i<k; i++){
            a[i] = b[i];
        }
    }

    /**
     * Iterative merge sort
     * @param a array of elements.
     */

    public static void iterativeMergeSort(int[] a){
        int p, i, l, h, mid;

        for(p=2; p<=a.length;p=p*2){
            for (i=0; i+p-1<a.length; i=i+p){
                l = i;
                h = i+p-1;
                mid = (l+h)/2;

                merge(a, l, mid, h);
            }
        }

        if (p/2<a.length){
            merge(a, 0, p/2-1, a.length-1);
        }
    }
}
