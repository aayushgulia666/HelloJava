package com.aayush.gulia.Array.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * If you want to convert HashSet to ArrayList just pass the set to ArrayList Constructor.
 */

public class ConvertHashSetToList {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Aayush");
        set.add("Tom Cruise");
        set.add("Brad Pitt");

        System.out.println(set);

        List<String> ls = new ArrayList<>(set);
        System.out.println(ls);

        HashSet<List<Integer>> set_res = new HashSet<>();

        set_res.add(Arrays.asList(1, 2, 3, 4, 5));
        set_res.add(Arrays.asList(6, 7, 8, 9, 10));
        set_res.add(Arrays.asList(11, 12, 13, 14, 15));

        System.out.println("This is set_res : " + set_res);

        List<List<Integer>> result = new ArrayList<>(set_res);
        System.out.println("This is out list of integers : " + result);
    }
}
