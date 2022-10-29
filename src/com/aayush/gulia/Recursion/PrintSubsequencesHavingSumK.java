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
        fun(0, 0, k, arr);
    }
}
