package com.aayush.gulia.Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class SubSetSum {
    public static void sum(int index, int sum, int[] arr, ArrayList<Integer> sumArr){
        if (index == arr.length){
            sumArr.add(sum);
            return;
        }

        // pick element
        sum(index + 1, sum + arr[index], arr, sumArr);

        // not pick element
        sum(index + 1, sum, arr, sumArr);
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        ArrayList<Integer> answer = new ArrayList<>();
        sum(0, 0, arr, answer);
        Collections.sort(answer);
        System.out.println(answer);
    }
}
