package com.aayush.gulia.Array.Questions;

public class KthLargestElement {
    /**
     * Returns Kth largest element.
     * @param a an array of integers.
     * @param k Kth largest element.
     * @return Kth largest element.
     */
    public static int kThLargestElement(int[] a, int k){
        int temp;

        if (k == 0){
            return 0;
        }

        for (int i = 0; i <= k; i++){
            for (int j = 0; j < a.length-i-1; j++){
                if (a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a[a.length-k];
    }

    public static void main(String[] args) {
        int[] a = {0,2,4,5,4555,67,45,0};

        System.out.println(kThLargestElement(a, 5));
    }
}
