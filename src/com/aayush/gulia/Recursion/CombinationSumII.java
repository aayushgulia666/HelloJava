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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        combination(0, target, arr, ds);
        System.out.println(ans);
    }

}
