package com.aayush.gulia.DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        System.out.println(fib3(n));
    }

    //memoization
    static int fib(int n, int[] dp){

        if (n <= 1) return n;

        if (dp[n] != -1){
            return dp[n];
        }

        return dp[n] = fib(n-1, dp) + fib(n-2, dp);
    }

    //tabulation

    static int fib2(int n, int[] dp){

        dp[0] = 0; dp[1] = 1;

        for (int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    //space optimized tabulation

    static int fib3(int n){
        int prev = 1, prev2 = 0;

        for (int i=2; i<=n; i++){

            int cur = prev + prev2;
            prev2 = prev;
            prev = cur;
        }

        return prev;
    }
}
