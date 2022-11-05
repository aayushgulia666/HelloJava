package com.aayush.gulia.Questions;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }

        int result = 1;
        for (int i=2; i<=n; i++){
            result *= i;
        }
        return result;
    }

    public static int ncr(int n, int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }

    public static void printPascalTriangleRow(int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<n-i; j++){
                System.out.print(" ");
            }

            for (int j=0; j<=i; j++){
                System.out.print(" " + ncr(i, j));
            }
            System.out.println();
        }
    }

    public static void printPascalTriangle(int n){

        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> row, prev = null;

        for (int i=0; i<n; i++){
            row = new ArrayList<>();
            for (int j=0; j<=i; j++){
                if (j==0 || j == i){
                    row.add(1);
                }
                else{
                    //row.add(prev.get(j - 1) + prev.get(j));
                    row.add(prev.get(j-1) + prev.get(j));
                }
            }
            prev = row;
            answer.add(row);
        }

        System.out.println(answer);
    }

    public static void main(String[] args) {
        printPascalTriangle(5);

    }
}
