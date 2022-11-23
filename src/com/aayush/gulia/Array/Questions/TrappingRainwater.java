package com.aayush.gulia.Array.Questions;

import java.util.Arrays;

public class TrappingRainwater {

    static int rainWaterTwoPointer(int[] height){
        int leftMax = 0, rightMax = 0;
        int left = 0, right = height.length-1;
        int totalWater = 0;

        while (left <= right){

            if (height[left] <= height[right]){ // verify that there is a building at right i.,e greater or equal to left.
                if (height[left] >= leftMax){
                    leftMax = height[left];
                }
                else{
                    totalWater += leftMax - height[left];
                }

                left++;
            }

            else{
                if (height[right] >= rightMax){
                    rightMax = height[right];
                }
                else{
                    totalWater += rightMax - height[right];
                }

                right++;
            }
        }

        return totalWater;
    }
    static void rainWaterBruteforce(int[] height){
        int totalWaterTrapped = 0;
        int[] prefixMax = new int[height.length];
        int[] suffixMax = new int[height.length];


        int pMax = 0, sMax = 0;
        int i,j;

        for (i=0, j=height.length-1; i<height.length; i++, j--){
            if (pMax < height[i]){
                pMax = height[i];
            }
            prefixMax[i] = pMax;

            if (sMax < height[j]){
                sMax = height[j];
            }
            suffixMax[j] = sMax;
        }

//        System.out.println("Suffix max : " + Arrays.toString(suffixMax));
//        System.out.println("Prefix max : " + Arrays.toString(prefixMax));


        int water = 0;

        for (i=0; i<height.length; i++){
            water = (Math.min(prefixMax[i], suffixMax[i]) - height[i]); //gets water at each index.
            totalWaterTrapped += water;
            water = 0;
        }

        System.out.println("Total trapped water is: " + totalWaterTrapped);

    }
    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};
        int totalWater = rainWaterTwoPointer(height);
        System.out.println(totalWater);
    }
}
