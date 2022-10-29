package com.aayush.gulia.Recursion;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * This class prints subsequences having sum k.
 * @author Aayush Gulia
 * @since 29/10/2022
 */

public class PrintSubsequencesHavingSumK {
    static LinkedList<Integer> ls = new LinkedList<>();

    /**
     * Prints all subsequences having sum k
     * @param index starting index
     * @param sum sum of elements in aux data structure
     * @param k sum we are finding
     * @param arr array containing elements
     */

    static void fun(int index, int sum, int k, int[] arr){

        if (index == arr.length){
            if (sum == k){
                System.out.println(ls);
                return;
            }
            return;
        }

        ls.add(arr[index]);
        sum += arr[index];
        fun(index+1, sum, k, arr);

        ls.removeFirstOccurrence(arr[index]);
        sum -= arr[index];
        fun(index+1, sum, k, arr);
    }

    /**
     * Prints only first occurrence of subsequence having sum k
     * @param index starting index
     * @param sum sum of elements in aux data structure
     * @param k sum we are finding
     * @param arr array containing elements
     */

    static boolean fun2(int index, int sum, int k, int[] arr){
        if (index == arr.length){
            if (sum == k){
                System.out.println(ls);
                return true;
            }
            return false;
        }

        ls.add(arr[index]);
        sum += arr[index];

        if (fun2(index + 1, sum, k, arr)){
            return true;
        }

        ls.removeFirstOccurrence(arr[index]);
        sum -= arr[index];

        if (fun2(index+1, sum, k, arr)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter len: ");
        int n = scanner.nextInt();
        System.out.println("Having sum: ");
        int k = scanner.nextInt();

        System.out.println("Enter elements: ");
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Sequences having sum " + k + " are:");
        fun2(0, 0, k, arr);
    }
}
