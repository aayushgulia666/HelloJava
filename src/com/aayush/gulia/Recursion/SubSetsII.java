package com.aayush.gulia.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetsII {

    public static void subSetsII(int index, int[] arr, List<Integer> ds, List<List<Integer>> answer){
        // no need of base case, loop will stop recursion.
        answer.add(new ArrayList<>(ds));
        for (int i=index; i<arr.length; i++){
            if (i != index && arr[i] == arr[i-1]) continue;
            ds.add(arr[i]);
            subSetsII(i + 1, arr, ds, answer);
            ds.remove(ds.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        int[] arr = {4,4,4,1,4};
        // sort the array.
        Arrays.sort(arr);
        subSetsII(0, arr, ds, answer);
        System.out.println(answer);
        // [[],[1],[1,2],[1,2,2],[2],[2,2]]
    }
}
