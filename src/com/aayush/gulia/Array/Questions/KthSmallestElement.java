package com.aayush.gulia.Array.Questions;

/**
 * Selection sort gives the Kth smallest element.
 */
public class KthSmallestElement {
    /**
     * Returns the Kth smallest element.
     * @param a array of elements.
     * @param passes gives the smallest element. i.,e Kth pass will give Kth small element.
     * @return Kth smallest element.
     */
    public static int kThSmallestElement(int[] a, int passes){
        int i,j,k;
        int temp;

        if (passes == 0)
            return 0;

        for (i=0; i<passes; i++){
            for (j=k=i; j<a.length; j++){
                if (a[j] < a[k]){
                    k=j;
                }
            }
            temp = a[i];
            a[i] = a[k];
            a[k] = temp;
        }
        return a[passes-1];
    }
}
