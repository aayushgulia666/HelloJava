package com.aayush.gulia.Array.Questions;

import java.util.*;

/**
 * Leet code 15
 */

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<ArrayList<Integer>> set = new HashSet<>();

        getTriplet(nums, map, set);
        System.out.println(set);
    }

    /**
     * Brute force approach, generate all triplets and check for the sum if sum is zero then add it to HashSet to avoid duplicates.
     * all triplets will be stored in the HashSet passed while calling the method.
     */
    static void getTriplet(int[] nums, HashSet<ArrayList<Integer>> set){

        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j< nums.length; j++){
                for (int k=j+1; k< nums.length; k++){

                    if (nums[i] + nums[j] + nums[k] == 0){

                        ArrayList<Integer> ls = new ArrayList<>();
                        Collections.addAll(ls, nums[i], nums[j], nums[k]);

                        set.add(ls);
                    }
                }
            }
        }
    }


    /**
     * Using HashMap (Hashing).
     * will use HashMap to get the third triplet as a + b + c = 0   i.,e   c = -(a+b).
     * @param nums array containing elements.
     * @param map extra space to calculate third triplet.
     * @param set contain triplets having sum 0.
     */

    static void getTriplet(int[] nums, HashMap<Integer, Integer> map, HashSet<ArrayList<Integer>> set){

        //add all elements in the map with their occurrence
        for (int i=0; i<nums.length; i++){

            if (map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                count++;
                map.put(nums[i], count);
                continue;
            }

            map.put(nums[i], 1);
        }

        //check for third triplet
        for (int i=0; i<nums.length; i++){

            if (map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                count--;
                map.put(nums[i], count);
            }

            for (int j=i+1; j< nums.length; j++){

                if (map.containsKey(nums[j])){
                    int count = map.get(nums[j]);
                    count--;
                    map.put(nums[j], count);
                }

                int thirdTriplet = -(nums[i] + nums[j]);

                if (map.containsKey(thirdTriplet)){
                    if (map.get(thirdTriplet) > 0){
                        ArrayList<Integer> ls = new ArrayList<>();
                        Collections.addAll(ls, nums[i], nums[j], thirdTriplet);
                        Collections.sort(ls);

                        set.add(ls);
                    }
                }

                if (map.containsKey(nums[j])){
                    int count = map.get(nums[j]);
                    count++;
                    map.put(nums[j], count);
                }
            }
            if (map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                count++;
                map.put(nums[i], count);
            }
        }
    }


    /**
     * Two pointer approach
     * @param nums array containing elements
     * @return triplets
     */
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
