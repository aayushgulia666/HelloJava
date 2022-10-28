package com.aayush.gulia.Recursion;

import java.util.Scanner;

/**
 * Checks if a given string is a palindrome using recursion.
 * @author Aayush Gulia
 * @since 28/10/2022
 * @see <a href="https://www.geeksforgeeks.org/recursive-function-check-string-palindrome/">Palindrome using recursion</a>
 */

public class Palindrome {
    /**
     * Returns a boolean value whether the given string is a palindrome or not.
     * @param i index from where the string starts.
     * @param chars an array of chars containing string.
     * @return bool value.
     */
    static boolean isPalindrome(int i, char[] chars){

        if (i >= chars.length/2){
            return true;
        }

        if (chars[i] != chars[chars.length -i-1]){
            return false;
        }

        return isPalindrome(i+1, chars);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        System.out.println(isPalindrome(0, chars));

    }
}
