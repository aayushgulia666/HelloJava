package com.aayush.gulia.Array.Questions;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int[] arr = new int[nums.length];
        int n = 3;

        for (int i=0; i< nums.length; i++){
            if (i%2==0){
                arr[i] = nums[i/2];
            }
            else{
                arr[i] = nums[n+i/2];
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
