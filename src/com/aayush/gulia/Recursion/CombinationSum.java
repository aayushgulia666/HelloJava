package com.aayush.gulia.Recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Find combination of elements which sum up to target, one element can repeat itself as many times.
 */

public class CombinationSum {

    static void function(int index, int[] arr, int target, ArrayList<Integer> ls, List<ArrayList<Integer>> ds){

        if (index >= arr.length){
            if (target == 0){
                ds.add(new ArrayList<>(ls));
            }
            return;
        }

        //take
        if (arr[index] <= target){
            ls.add(arr[index]);
            function(index, arr, target - arr[index], ls, ds);
            ls.remove(ls.size() - 1);
        }

        //not take
        function(index + 1, arr, target, ls, ds);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        List<ArrayList<Integer>> seq = new ArrayList<>();
        function(0, arr, 7, new ArrayList<>(), seq);
        System.out.println(seq);
    }
}
