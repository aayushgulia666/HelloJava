package com.aayush.gulia.Recursion;

public class Factorial {
    public static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }

        return factorial(n-1)*n;
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println(factorial(x));
    }
}
