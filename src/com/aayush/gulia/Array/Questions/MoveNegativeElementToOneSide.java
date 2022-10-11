package com.aayush.gulia.Array.Questions;

import java.util.Arrays;

public class MoveNegativeElementToOneSide {

    public static void move(int[] a){
        int i=0;
        int j=a.length-1;

        while (i<j){
            while (a[i] < 0){i++;}
            while (a[j] > 0){j--;}

            if (i<j){
                a[i] = a[i] ^ a[j];
                a[j] = a[i] ^ a[j];
                a[i] = a[i] ^ a[j];
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {-1,6,-7,4,-9,0,1,2,3,4,-5,3,-2};
        move(a);

        System.out.println(Arrays.toString(a));
    }
}
