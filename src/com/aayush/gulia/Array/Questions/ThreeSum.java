package com.aayush.gulia.Array.Questions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Leet code 15
 */

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = getTriplet(nums);
        System.out.println(ans);
    }

    static List<List<Integer>> getTriplet(int[] nums){
        Arrays.sort(nums);

        List<List<Integer>> ans = new LinkedList<>();

        for(int i=0; i<nums.length-2; i++){

            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){

                int lo = i+1, hi = nums.length-1, sum =  -nums[i];

                while(lo < hi){
                    if(nums[lo] + nums[hi] == sum){
//                        System.out.println(nums[i] + " " +  nums[lo] + " " + nums[hi]);

                        ans.add(Arrays.asList(nums[i], nums[lo], nums[hi]));

                        while(lo < hi && nums[lo] == nums[lo+1]) lo++;
                        while(lo < hi && nums[hi] == nums[hi-1]) hi--;

                        lo++; hi--;
                    }

                    else if(nums[lo] + nums[hi] < sum){
                        lo++;
                    }
                    else{
                        hi--;
                    }
                }
            }
        }
        return ans;
    }
}
