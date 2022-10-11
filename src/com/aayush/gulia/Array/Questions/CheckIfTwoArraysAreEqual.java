package com.aayush.gulia.Array.Questions;

import java.util.Arrays;

/**
 * <a href="https://www.geeksforgeeks.org/check-if-two-arrays-are-equal-or-not/">Check if two arrays are equal</a>
 */

public class CheckIfTwoArraysAreEqual {
    public static boolean isEqual(int[] a, int[] b){
        int n = a.length;
        int m = b.length;

        if (n != m){
            return false;
        }

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i=0; i<a.length; i++){
            if (a[i] != b[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1,1,5,23,546,0};
        int[] b = {1,1,12,23,546,0};

        System.out.println(isEqual(a, b));
    }
}
