package com.aayush.gulia.Recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Leet code 46
 */

public class Permutations {

    public static void permutationSwap(int index, int[] arr, List<List<Integer>> answer){
        if (index == arr.length){
            List<Integer> ls = new ArrayList<>();
            for (int j : arr) {
                ls.add(j);
            }
            answer.add(new ArrayList<>(ls));
            return;
        }

        for (int i=index; i<arr.length; i++){
            swap(index, i, arr);
            permutationSwap(index + 1, arr, answer);
            swap(index, i, arr);
        }
    }

    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void permutations(int[] arr, List<Integer> ls, List<List<Integer>> answer, boolean[] take){
        // base case
        if(ls.size() == arr.length){
            answer.add(new ArrayList<>(ls));
            return;
        }

        for (int i=0; i<arr.length; i++){
            if (!take[i]){
                ls.add(arr[i]);
                take[i] = true;
                permutations(arr, ls, answer, take);
                ls.remove(ls.size() - 1);
                take[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<Integer> ls = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();
//        boolean[] take = new boolean[arr.length];

        permutationSwap(0, arr, answer);
        System.out.println(answer);
    }
}
