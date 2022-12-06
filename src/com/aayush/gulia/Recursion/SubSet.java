package com.aayush.gulia.Recursion;

import java.util.ArrayList;

/**
 * Subset -> not ordered and not contiguous.
 * Subsequence -> ordered according to index and not contiguous.
 */
public class SubSet {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> allSubSets = new ArrayList<>();
        int[] arr = {1, 2, 2};
        uniqueSubSet(0, arr, new ArrayList<>(), allSubSets);
        System.out.println(allSubSets);
    }

    /**
     * Generate unique subsets, subsequences
     * @param index i
     * @param arr array of elements
     * @param ls temp array
     * @param ds contains all subsets
     */
    static void uniqueSubSet(int index, int[] arr, ArrayList<Integer> ls, ArrayList<ArrayList<Integer>> ds){
        ds.add(new ArrayList<>(ls));

        for (int i=index; i< arr.length; i++){
            if (i != index && arr[i] == arr[i-1]) continue;

            ls.add(arr[i]);
            uniqueSubSet(i+1, arr, ls, ds);
            ls.remove(ls.size() - 1);
        }
    }

    /**
     * Generates all the subsets, subsequences.
     * @param index i
     * @param arr array
     * @param ls temp ds
     * @param ds stores answer
     */

    static void subSet(int index, int[] arr, ArrayList<Integer> ls, ArrayList<ArrayList<Integer>> ds){
        if (index == arr.length){
            ds.add(new ArrayList<>(ls));
            return;
        }

        //pick
        ls.add(arr[index]);
        subSet(index+1, arr, ls, ds);
        ls.remove(ls.size() - 1);

        //not pick
        subSet(index+1, arr, ls ,ds);
    }
}
