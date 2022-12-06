package com.aayush.gulia.Recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aayush Gulia
 * @since 29/10/2022
 * @see <a href="https://en.wikipedia.org/wiki/Subsequence">What is a subsequence</a>
 * last revised: 05/12/2022
 */

public class PrintAllSubsequences {

    /**
     * A subsequence is a sequence that can be derived from the given sequence by deleting some or no elements,
     * but the order must be preserved.
     * There are 2n-1 non-empty subsequences,
     * Every subarray is a subsequence and every subset is a subsequence.
     *
     * @param index starting index of array.
     * @param arr sequence of elements.
     */

    static void allSubsequences(int index, int[] arr, ArrayList<Integer> ls, List<ArrayList<Integer>> ds){

        if (index >= arr.length){
            ds.add(new ArrayList<>(ls));
            return;
        }

        //take
        ls.add(arr[index]);
        allSubsequences(index+1, arr, ls, ds);
        ls.remove(ls.size() - 1);

        //not take
        allSubsequences(index+1, arr, ls, ds);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        List<ArrayList<Integer>> sequences = new ArrayList<>();
        allSubsequences(0, arr, new ArrayList<>(), sequences);
        System.out.println(sequences);
    }

}
