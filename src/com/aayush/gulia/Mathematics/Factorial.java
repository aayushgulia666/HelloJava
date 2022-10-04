package com.aayush.gulia.Mathematics;

public class Factorial {
    public static int factorial(int n){
        int f = 1;

        if (n == 0 || n == 1){
            return f;
        }

        for (int i=1; i<=n; i++){
            f *= i;
        }
        return f;
    }

    public static int recursiveFactorial(int n){

        if (n == 0){
            return 1;
        }

        return n * recursiveFactorial(n-1);
    }
}
