package com.aayush.gulia.Array.Questions;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        System.out.println(maxConsecutiveOnes(nums));
    }

    private static int maxConsecutiveOnes(int[] nums){
        int max = 0;
        int cur = 0;

        for (int i=0; i<nums.length; i++){
            if (nums[i] == 0){
                cur = 0;
            }
            if(nums[i] != 0){
                cur++;
            }
            if (max < cur) {
                max = cur;
            }
        }
        return max;
    }
}
