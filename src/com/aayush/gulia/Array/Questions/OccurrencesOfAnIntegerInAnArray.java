package com.aayush.gulia.Array.Questions;

import java.util.Collections;

public class OccurrencesOfAnIntegerInAnArray {
    public static int occurrences(int[] a, int key){
        int count = 0;
        for (int i=0; i<a.length; i++){
            if (key == a[i]){
                count++;
            }
        }
        return count;
    }

    public static int frequency(int[] a, int key){
        return Collections.frequency(Collections.singleton(a), key);
    }

    public static void main(String[] args) {
        int[] a = {1,1,1,2,2,2,3,3,3,4,56,6,75,84,7,54,87};
        System.out.println(occurrences(a, 1));
    }
}
