package com.aayush.gulia.Array.Questions;

import java.util.Arrays;

public class SortArrayOf0and1 {
    public static void sortArray(int[] a){
        int n = a.length;
        int i = 0;
        int j = n-1;

        while(i<j){
            while(a[i] == 0){
                i++;
            }

            while (a[j] == 1){
                j--;
            }

            if (i<j){
                a[i] = a[i] ^ a[j];
                a[j] = a[i] ^ a[j];
                a[i] = a[i] ^ a[j];
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {0,1,0,1,0,0,1,1,0,0,0,1,1,0};
        sortArray(a);
        System.out.println(Arrays.toString(a));
    }
}
