package com.aayush.gulia.Recursion;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aayush Gulia
 * @since 28/10/2022
 *
 * Reverse array using recursion.
 */

public class reverseArray {

    /**
     * Reverse array using two pointers i and j.
     * @param i first pointer.
     * @param j second pointer.
     * @param arr array to be reversed.
     */

    static void rArray(int i, int j, int[] arr){
        if(i >= arr.length/2){
            return;
        }
        // swap
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];

        rArray(i+1, j-1, arr);
    }


    /**
     * Reverse array using single pointer.
     * @param i first pointer.
     * @param arr array to be reversed.
     */
    static void rArray(int i, int[] arr){
        if(i >= arr.length/2){
            return;
        }

        //swap i and length-i-1.
        arr[i] = arr[i] ^ arr[arr.length-i-1];
        arr[arr.length-i-1] = arr[i] ^ arr[arr.length-i-1];
        arr[i] = arr[i] ^ arr[arr.length-i-1];

        rArray(i+1, arr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        rArray(0, arr);
        System.out.println(Arrays.toString(arr));
    }

}
