package com.aayush.gulia.Recursion;

import java.util.ArrayList;

public class SubSet {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> allSubSets = new ArrayList<>();
        int[] arr = {1, 2, 2};
        subSet(0, arr, new ArrayList<>(), allSubSets);
        System.out.println(allSubSets);
    }

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
