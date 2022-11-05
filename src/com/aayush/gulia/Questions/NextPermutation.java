package com.aayush.gulia.Questions;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(Arrays.toString(nextPermutation(arr)));

    }

    private static int[] nextPermutation(int[] arr){
        if (arr.length == 0 || arr.length == 1){
            return arr;
        }

        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i+1]) i--;

        if (i >= 0){
            int j = arr.length - 1;
            while (arr[j] <= arr[i]) j--;
            swap(arr, i , j);
        }

        reverse(arr, i+1, arr.length - 1);
        return arr;
    }

    private static void reverse(int[] arr, int i, int j){
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    private static void swap (int[] a, int i, int j){
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

//    private static void reverse(int[] arr, int i, int j){
//        while (i < j){
//            swap(i, j ,arr);
//            i++;
//            j--;
//        }
//    }
//
//    private static void swap(int i, int j, int[] arr){
//        int temp;
//        temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

}
