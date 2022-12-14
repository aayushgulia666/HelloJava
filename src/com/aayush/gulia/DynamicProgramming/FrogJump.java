package com.aayush.gulia.DynamicProgramming;

import java.util.Arrays;

/**
 * problem statement <a href="https://www.codingninjas.com/codestudio/problem-details/frog-jump_3621012">Frog jump</a>
 */

public class FrogJump {
    public static void main(String[] args) {
        int[] arr = {30,10,60,10,60,50};
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        System.out.println(frogJumpTabulation(5, arr));
    }

    //recursion
    static int frogJump(int index, int[] arr){
        if (index == 0) return 0;

        int left = frogJump(index - 1, arr) + Math.abs(arr[index] - arr[index-1]);

        int right = 0;

        if (index > 1){
           right = frogJump(index - 2, arr) + Math.abs(arr[index] - arr[index-2]);
        }

        return Math.min(left, right);
    }

    //memoization
    static int frogJump(int index, int[] arr, int[]dp){
        if (index == 0) return 0;

        if (dp[index] != -1) return dp[index];

        int left = frogJump(index - 1, arr, dp) + Math.abs(arr[index] - arr[index - 1]);

        int right = 0;
        if (index > 1){
            right = frogJump(index - 2, arr, dp) + Math.abs(arr[index] - arr[index - 2]);
        }

        return dp[index] = Math.min(left, right);

    }

    //tabulation
    static int frogJumpTabulation(int n, int[] dp, int[] arr){
        //base case
        dp[0] = 0;

        for (int i=1; i<=n; i++){
            int left, right = 0;
            left = dp[i-1] + Math.abs(arr[i] - arr[i-1]);

            if (i > 1){
                right = dp[i-2] + Math.abs(arr[i] - arr[i-2]);
            }

            dp[i] = Math.min(left, right);
        }
        return dp[n];
    }

    //space optimization
    static int frogJumpTabulation(int n, int[] arr){
        int prev, prev2, left, right=0, ans=0;

        prev = 0;
        prev2 = 0;

        for (int i=1; i<=n; i++){
            left = prev + Math.abs(arr[i] - arr[i-1]);

            if (i > 1){
                right = prev2 + Math.abs(arr[i] - arr[i-2]);
            }

            ans = Math.min(left, right);
            prev = ans;
            prev2 = prev;
        }
        return ans;
    }
}
