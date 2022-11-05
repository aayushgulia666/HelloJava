package com.aayush.gulia.Matrix;

/**
 * @author Aayush Gulia
 * @since 05/11/2022
 * This class is used to transpose a 2D array (Matrix)
 */
public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        transpose(arr);
        display(arr);
    }

    /**
     * swap rows with column
     * @param matrix 2d array
     */

    public static void transpose(int[][] matrix){
        for (int i=0; i<matrix.length; i++){
            for (int j=i; j<matrix[0].length; j++){
                int temp;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    /**
     * Used to display matrix
     * @param matrix 2d array
     */
    private static void display(int[][] matrix){
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
