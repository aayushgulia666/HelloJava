package com.aayush.gulia.Recursion;


import java.util.*;

public class CombinationSumII {
    /**
     * Leet code 40
     */

    private static Set<List<Integer>> ans = new HashSet<>();
    private static List<Integer> ds = new ArrayList<>();

    static void combination(int index, int target, int[] arr, List<Integer> ds){
        // brute force approach, throws TLE
        if (index == arr.length){
            if (target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[index] <= target){
            ds.add(arr[index]);
            combination(index + 1, target - arr[index], arr, ds);
            ds.remove(ds.size() - 1);
        }
        combination(index + 1, target, arr, ds);
    }

    static void combinationII(int index, int target, int[] arr){
        // base case

        if (target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i=index; i<arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;

            ds.add(arr[i]);
            combinationII(i + 1, target - arr[i], arr);
            ds.remove(ds.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
//        Arrays.sort(arr);
        int target = 8;

//        combination(0, target, arr, ds);
        combinationII(0, target, arr);
        System.out.println(ans);
    }

}
