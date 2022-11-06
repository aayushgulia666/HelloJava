package com.aayush.gulia.BitManipulation;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,3};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        int xor = 0;

        for(int num: nums){
            xor ^= num;
        }

        return xor;
    }
}
