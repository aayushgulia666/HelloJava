package com.aayush.gulia.DynamicProgramming;

import java.util.Arrays;

/**
 * Climbing stairs resembles fibonacci series.
 */

public class ClimbingStairs {
    public static void main(String[] args) {
        int[] dp = new int[46];
        Arrays.fill(dp, -1);
        System.out.println(climbStairs(45));
    }

    static int climbStairsRecursive(int n){
        if (n <= 1) return 1;

        return climbStairsRecursive(n-1) + climbStairsRecursive(n-2);
    }

    //memoization
    static int climbStairs(int n, int[] dp){

        if (n <= 1){
            return 1;
        }

        if (dp[n-1] == -1){
            dp[n-1] = climbStairs(n-1, dp);
        }

        if (dp[n-2] == -1){
            dp[n-2] = climbStairs(n-2, dp);
        }

        return dp[n-2] + dp[n-1];
    }

    //tabulation
    static int climbStairs(int n){
        int previous = 1;
        int previous2 = 1;

        for (int i=2; i<=n; i++){
            int ans = previous2 + previous;
            previous2 = previous;
            previous = ans;
        }

        return previous;
    }
}
