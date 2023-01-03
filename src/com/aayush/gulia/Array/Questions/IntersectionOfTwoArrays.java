package com.aayush.gulia.Array.Questions;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {4,5};

        System.out.println(Arrays.toString(intersection(num1, num2)));
    }

    /**
     * Brute force approach. Here we are finding if the element of fist array is present in second array, if match is found we add the
     * element to a set (set avoid duplicates) or we can maintain a visited array to avoid duplicate elements.
     * @param nums1 first array
     * @param nums2 second array
     * @since 03-01-2022
     * @return intersection of two arrays.
     */
    static int[] intersection(int[] nums1, int[] nums2){

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums1) {
            for (int i : nums2) {
                if (num == i) {
                    set.add(num);
                }
            }
        }

        int[] arr = new int[set.size()];

        // copy set elements in an array.
        int i=0;
        for (int num : set){
            arr[i++] = num;
        }

        return arr;
    }
}
