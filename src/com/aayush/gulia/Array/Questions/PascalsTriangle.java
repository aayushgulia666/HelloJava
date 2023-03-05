package com.aayush.gulia.Array.Questions;

import java.util.ArrayList;

/**
 * @author Aayush Gulia
 * @since 05-03-2023
 *
 * Element at a given row and column in a pascal triangle can be given by  (r-1)
 *                                                                             C
 *                                                                              (c-1)
 */
public class PascalsTriangle {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> pascalTriangle = new ArrayList<>();
        ArrayList<Integer> row = null;
        ArrayList<Integer> prev = new ArrayList<>();

        int numRows = 5;

        for (int i=1; i<=numRows; i++){
            row = new ArrayList<>();
            for (int j=0; j<=i; j++){
                if (j==0 || j==i){
                    row.add(1);
                }else{
                    row.add(prev.get(j-1) + prev.get(j));
                }
            }
            prev = row;
            pascalTriangle.add(row);
        }
        System.out.println(pascalTriangle);
    }
}
