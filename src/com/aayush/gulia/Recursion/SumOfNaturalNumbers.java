package com.aayush.gulia.Recursion;

public class SumOfNaturalNumbers {
    public static int sum(int n){
        if (n == 0){ //base case
            return 0;
        }

        return sum(n-1) + n;
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
