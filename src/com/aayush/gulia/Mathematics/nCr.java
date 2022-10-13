package com.aayush.gulia.Mathematics;

public class nCr {
    public static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }

        int result = 1;
        for (int i=2; i<=n; i++){
            result *= i;
        }
        return result;
    }

    public static int ncr(int n, int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
}
