package com.aayush.gulia.Array.Questions;

import java.util.Arrays;

public class RotateArray {
    public static void leftRotate(int[] a, int k){
        k = k%a.length;

        while (k>0){
            int temp = a[0];
            int i;

            for (i=0; i<a.length-1; i++){
                a[i] = a[i+1];
            }
            a[a.length-1] = temp;

            k--;
        }
    }

    public static void rightRotate(int[] a, int k){
        k = k%a.length;

        while(k>0){
            int temp = a[a.length-1];

            int i;
            for (i=a.length-1; i>0; i--){
                a[i] = a[i-1];
            }

            a[0] = temp;

            k--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        rightRotate(arr, 16);
        System.out.println(Arrays.toString(arr));

    }
}
