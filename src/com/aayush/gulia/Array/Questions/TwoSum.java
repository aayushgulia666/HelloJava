package com.aayush.gulia.Array.Questions;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] a = {1,2,3,4,5,6,7,8,9,0};
        int target = 14;

        for (int i=0; i<a.length; i++){
            int diff = target - a[i];

            if (map.containsKey(diff)){
                System.out.println(i + " " + map.get(diff));
            }
            map.put(a[i], i);
        }

    }
}
