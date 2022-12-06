package com.aayush.gulia.Array.Questions;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        subArray(arr);
    }

    static void subArray(int[] arr){
        for (int s=0; s<arr.length; s++){
            for (int e=s; e<arr.length; e++){
                for (int i=s; i<=e; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
        System.out.println("{}");
    }
}
