package com.aayush.gulia.Mathematics;

/**
 * Trailing zeroes for ex: 1200 have 2 trailing zeroes.
 *
 * Trailing zeroes are created whenever we have 2*5 this adds zeroes at the end, we just have to find the
 * occurrences of 2's and 5's.
 *
 * 5! = 1*2*3*4*5;
 * here we have one 2 and one 5 which gives the trailing zero at the end.
 * 5! = 120 (has one trailing zero.)
 *
 * we ignore 2 and only find the occurrences of 5 because 2 are always greater than occurrences of 5.
 */
public class TrailingZeroesInFactorial {
    public static int trailingZeroesInFactorial(int n){
        int result = 0;

        for (int i=5; i<=n; i*=5){
            result += n/i;
        }
        return result;
    }
}
