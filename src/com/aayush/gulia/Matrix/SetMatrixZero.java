package com.aayush.gulia.Matrix;

/**
 * @author Aayush Gulia
 * @since 04-03-2023
 *
 * leet code 73
 */

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,1,1},{0,1,1}};
        setMatrixOptimalApproach(matrix);

//        int col0 = 1;
//        int rows = matrix.length;
//        int column = matrix[0].length;
//
//        for (int i=0; i<rows; i++){
//            if (matrix[i][0] == 0){
//                col0 = 0;
//            }
//
//            for (int j=1; j<column; j++){
//                if (matrix[i][j] == 0){
//                    matrix[i][0] = matrix[0][j] = 0;
//                }
//            }
//        }
//
//        for (int i=rows-1; i>=0; i--){
//            for (int j=column-1; j>=1; j--){
//                if (matrix[i][0] == 0 || matrix[0][j] == 0){
//                    matrix[i][j] = 0;
//                }
//
//                if (col0 == 0){
//                    matrix[i][0] = 0;
//                }
//            }
//        }
//        display(matrix);
    }

    static void display(int[][] matrix){
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Brute force approach for setting all the rows and columns to zero,
     * traverse every element of matrix if (matrix[i][j] == 0) then set it's entire row and column to character which is
     * not included inside the matrix, because we have to preserve other zeros which we have not traversed yet.
     *
     * At last set all elements marked with zero.
     *
     * T.C O(m*n)*(m+n) for every zero we have to traverse its row and col
     * S.C O(1) no extra space is required
     * @param matrix input matrix
     */
    static void setMatrixZeroBruteForce(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if (matrix[i][j] == 0){
                    int index = i - 1;
                    while (index>=0){
                        matrix[index][j] = -1;
                        index--;
                    }

                    index = j + 1;
                    while (index<rows){
                        matrix[i][index] = -1;
                        index++;
                    }

                    index = i + 1;
                    while (index<cols){
                        matrix[index][j] = -1;
                        index++;
                    }

                    index = j - 1;
                    while (index >= 0){
                        matrix[i][index] = -1;
                        index--;
                    }
                }
            }
        }

        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if (matrix[i][j] == -1) matrix[i][j] = 0;
            }
        }

        display(matrix);
    }

    /**
     * Here, we will use two arrays for rows and columns, to mark the entire row || column as zero.
     * @param matrix input matrix
     */

    static void setMatrixZeroUsingAuxSpace(int [][] matrix){

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] row = new boolean[rows];
        boolean[] col = new boolean[cols];

        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if (matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if (row[i] || col[j]) matrix[i][j] = 0;
            }
        }

        display(matrix);
    }

    /**
     * Use first column and row to mark the rows and columns to be filled with zero.
     * Separate variable is used for column 0, as cannot use one element to set both row and column to be zero.
     * @param matrix input matrix
     */

    static void setMatrixOptimalApproach(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean col0 = false;

        for (int i=0; i<rows; i++){
            if (matrix[i][0] == 0) col0=true;
            for (int j=1; j<cols; j++){
                if (matrix[i][j] == 0){
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }

        for (int i=rows-1; i>=0; i--){
            for (int j=cols-1; j>=1; j--){
                if (matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
            if (col0) matrix[i][0] = 0;
        }
        display(matrix);
    }
}
