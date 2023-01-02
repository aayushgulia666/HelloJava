package com.aayush.gulia.Array.Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FourSum {

    static void getQuadruples(int[] nums, int target, HashSet<List<Integer>> result){
        Arrays.sort(nums);

        for (int i=0; i< nums.length; i++){
            for (int j=i+1; j< nums.length; j++){
                for (int k=j+1; k< nums.length; k++){

                    int diff = target - (nums[i]+nums[j]+nums[k]);
                    int l = Arrays.binarySearch(nums, k+1, nums.length,  diff);

                    if (l >= 0){
                        result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                    }
                }
            }
        }
    }
}
