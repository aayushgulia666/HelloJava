package com.aayush.gulia.Recursion;

public class FibonacciSeries {

    //Fibonacci series goes like this --> 0 , 1, 1, 2, 3, 5, 8, 13, 21, 34, . . .

    public static int fibonacci(int n){
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        return fibonacci(n-2)+fibonacci(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
}
