package com.aayush.gulia.BitManipulation;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        //swapping numbers without using third variable;

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
}
