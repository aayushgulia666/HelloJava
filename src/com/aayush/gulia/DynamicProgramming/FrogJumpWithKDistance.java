package com.aayush.gulia.DynamicProgramming;

import java.util.Arrays;

public class FrogJumpWithKDistance {
    public static void main(String[] args) {
        int[] arr = {30,10,60,10,60,50};
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);

        System.out.println(frogJumpTabulation(arr.length-1, arr, dp, 2));
    }

    //recursive
    static int frogJump(int index, int[] arr, int k){
        if (index == 0) return 0;

        int min_cost = Integer.MAX_VALUE;
        for (int j=1; j<=k; j++) {
            if (index-j >= 0){
                int cost = frogJump(index - j, arr, k) + Math.abs(arr[index] - arr[index - j]);
                min_cost = Math.min(min_cost, cost);
            }
        }
        return min_cost;
    }

    //memoization

    static int frogJump(int index, int[] arr, int[] dp, int k){
        if (index == 0) return 0;

        if (dp[index] != -1) return dp[index];

        int min_cost = Integer.MAX_VALUE;

        for (int j=1; j<=k; j++){
            if (index-j >= 0){
                if (index-j >= 0){
                    int cost = frogJump(index-j, arr, dp, k) + Math.abs(arr[index] - arr[index-j]);
                    min_cost = Math.min(min_cost, cost);
                }
            }
        }
        return dp[index] = min_cost;
    }

    //tabulation
    static int frogJumpTabulation(int index, int[] arr, int[] dp, int k){
        dp[0] = 0;

        for (int i=1; i<=index; i++){
            int min_cost = Integer.MAX_VALUE;

            for (int j=1; j<=k; j++){
                if (i - j >= 0){
                    int cost = dp[i-j] + Math.abs(arr[i] - arr[i-j]);
                    min_cost = Math.min(min_cost, cost);
                }
            }
            dp[i] = min_cost;
        }
        return dp[index];
    }
}
