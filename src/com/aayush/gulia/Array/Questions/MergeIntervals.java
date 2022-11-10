package com.aayush.gulia.Array.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    private static List<List<Integer>> mergeIntervals(List<List<Integer>> intervals){
        List<List<Integer>> mergedIntervals = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        if(intervals.size() == 0){
            return intervals;
        }

        intervals.sort((a, b) -> a.get(0) - b.get(0));

        for (int i=0; i<intervals.size(); i++){
            if (mergedIntervals.isEmpty() || mergedIntervals.get(mergedIntervals.size() -1).get(1) < intervals.get(i).get(0)){
                ArrayList<Integer> ls = new ArrayList<>();
                ls.add(intervals.get(i).get(0));
                ls.add(intervals.get(i).get(1));

                mergedIntervals.add(ls);
            }

            else{
                mergedIntervals.get(mergedIntervals.size() - 1).set(1, Math.max(mergedIntervals.get(mergedIntervals.size() -1).get(1), intervals.get(i).get(1)));
            }
        }

        return mergedIntervals;
    }
    public static void main(String[] args) {
        List<List<Integer>> intervals = Arrays.asList(Arrays.asList(1,2),
                Arrays.asList(19,25),
                Arrays.asList(2,6),
                Arrays.asList(8,10),
                Arrays.asList(15,18));

        System.out.println(mergeIntervals(intervals));

    }
}
