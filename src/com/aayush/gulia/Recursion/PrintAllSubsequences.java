package com.aayush.gulia.Recursion;

import java.util.LinkedList;

/**
 * This class prints all the subsequences of array.
 * @author Aayush Gulia
 * @since 29/10/2022
 * @see <a href="https://www.geeksforgeeks.org/generating-all-possible-subsequences-using-recursion/">Generating all possible Subsequences using Recursion</a>
 */

public class PrintAllSubsequences {
    /**
     * global references
     */
    static int[] arr = {1,2};
    static LinkedList<Integer> ls = new LinkedList<>();

    /**
     * Recursive method for printing all the subsequences.
     * @param index starting index of array.
     */

    public static void subsequence(int index){
        if (index == arr.length){
            System.out.println(ls);
            return;
        }

        ls.add(arr[index]);
        subsequence(index + 1);
        ls.removeFirstOccurrence(arr[index]);

        subsequence(index + 1);
    }

    public static void main(String[] args) {
        subsequence(0);
    }
}
