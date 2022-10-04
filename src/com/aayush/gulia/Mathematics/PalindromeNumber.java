package com.aayush.gulia.Mathematics;

public class PalindromeNumber {
    public static int reverseNumber(int n){
        int last;
        int reverse = 0;

        while (n != 0){
            last = n%10;
            n = n/10;

            reverse = reverse*10 + last;
        }
        return reverse;
    }

    public static boolean isPalindromeNumber(int n){
        return reverseNumber(n) == n;
    }
}
