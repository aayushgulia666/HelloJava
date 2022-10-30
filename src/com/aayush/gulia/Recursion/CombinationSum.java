package com.aayush.gulia.Recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Leet code 39
 */

public class CombinationSum {

    static List<List<Integer>> answer = new LinkedList<>();
    static List<Integer> ds = new LinkedList<>();

    static void findCombination(int index, int target, List<List<Integer>> answer, List<Integer> ds, int[] arr){

        if (index == arr.length){
            if (target == 0){
                answer.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[index] <= target){
            ds.add(arr[index]);
            findCombination(index, target - arr[index], answer, ds, arr);
            ds.remove(ds.size() -1);
        }

        findCombination(index + 1, target, answer, ds, arr);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int target = 7;
        findCombination(0, target, answer, ds, arr);
        System.out.println(answer);
    }
}
