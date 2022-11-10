package com.aayush.gulia.Array.Questions;

/**
 * @author Aayush Gulia
 * @see <a href="https://www.geeksforgeeks.org/find-any-one-of-the-multiple-repeating-elements-in-read-only-array-set-2/">GFG<a/>
 */

public class DuplicateNumberTortoiseMethod {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,7,8,9,10};

        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow]; // moves by 1 places.
            fast = nums[nums[fast]]; // moves by 2 places.
        }while (slow != fast);

        fast = nums[0];

        while (slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        System.out.println(slow);
    }
}
