package com.aayush.gulia.Mathematics;

public class ReverseNumber {
    public static int reverseNumber(int n){
        int last;
        int reverse = 0;

        while(n != 0){
            last = n%10; // gives the last digit.
            n = n/10; // removes the last digit.

            reverse = reverse*10 + last;
        }

        return reverse;
    }
}
