package com.aayush.gulia.Recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
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

    static void subsequencesHavingSumK(int index, int[] arr, int sum, int k, ArrayList<Integer> ls, List<ArrayList<Integer>> ds){

        if (index >= arr.length){
            if (sum == k){
                ds.add(new ArrayList<>(ls));
                return;
            }
            return;
        }

        //take
        sum += arr[index];
        ls.add(arr[index]);
        subsequencesHavingSumK(index+1, arr, sum, k, ls, ds);
        sum -= arr[index];
        ls.remove(ls.size() - 1);

        //not take
        subsequencesHavingSumK(index+1, arr, sum, k, ls, ds);
    }

    /**
     * Prints only first occurrence of subsequence having sum k
     * @param index starting index
     * @param sum sum of elements in aux data structure
     * @param k sum we are finding
     * @param arr array containing elements
     */

    static boolean subsequenceHavingSumK(int index, int sum, int k, int[] arr){
        if (index == arr.length){
            if (sum == k){
                System.out.println(ls);
                return true;
            }
            return false;
        }

        ls.add(arr[index]);
        sum += arr[index];

        if (subsequenceHavingSumK(index + 1, sum, k, arr)){
            return true;
        }

        ls.removeFirstOccurrence(arr[index]);
        sum -= arr[index];

        if (subsequenceHavingSumK(index+1, sum, k, arr)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        List<ArrayList<Integer>> subsequence = new ArrayList<>();
        subsequencesHavingSumK(0, arr, 0, 6, new ArrayList<>(), subsequence);
        System.out.println(subsequence);
    }
}
