package com.aayush.gulia.Recursion;

public class Power {
    public static int pow(int a, int b){
        if (b == 0){
            return 1;
        }

        return pow(a, b-1) * a;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        System.out.println(pow(a, b));
    }
}
