package com.aayush.gulia.Recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * This class prints all the subsequences of array.
 * @author Aayush Gulia
 * @since 29/10/2022
 * @see <a href="https://www.geeksforgeeks.org/generating-all-possible-subsequences-using-recursion/">Generating all possible Subsequences using Recursion</a>
 */

public class PrintAllSubsequences {

    /**
     * Recursive method for printing all the subsequences.
     *
     * @param index starting index of array.
     * @param arr
     */

    public static void subsequence(int index, LinkedList<List<Integer>> ans, LinkedList<Integer> ls, int[] arr){
        if (index == arr.length){
            ans.add(new ArrayList<Integer>(ls));
            return;
        }

        ls.add(arr[index]);
        subsequence(index + 1, ans, ls, arr);
        ls.removeFirstOccurrence(arr[index]);

        subsequence(index + 1, ans, ls, arr);
    }

    public static void main(String[] args) {
        LinkedList<List<Integer>> ans = new LinkedList<>();
        int[] arr = {1, 2};
        subsequence(0, ans, new LinkedList<>(), arr);
        System.out.println(ans);
    }
}
