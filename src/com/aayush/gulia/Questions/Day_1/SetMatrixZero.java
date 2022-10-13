package com.aayush.gulia.StriverSheet.Day_1;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        setValues(matrix);
        setZero(matrix);
        display(matrix);
    }
    private static void setZero(int[][] matrix){
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if (matrix[i][j] == 0){

                    int r = 0;

                    while (r < matrix.length){
                        if (matrix[i][r] != 0){
                            matrix[i][r] = -1;
                        }
                        r++;
                    }

                    int c = 0;

                    while (c < matrix[0].length){
                        if (matrix[c][j] != 0){
                            matrix[c][j] = -1;
                        }
                        c++;
                    }
                }
            }
        }


        // mark -1 --> 0

        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if (matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private static void display(int[][] matrix){
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    private static void setValues(int[][] matrix){
        matrix[0][0] = 1;
        matrix[0][3] = 1;

        matrix[0][1] = 1;
        matrix[0][2] = 1;

        matrix[1][0] = 3;
        matrix[1][1] = 1;
        matrix[1][2] = 0;
        matrix[1][3] = 8;

        matrix[2][0] = 8;
        matrix[2][1] = 2;
        matrix[2][2] = 5;
        matrix[2][3] = 7;

        matrix[3][0] = 1;
        matrix[3][1] = 3;
        matrix[3][2] = 9;
        matrix[3][3] = 9;
    }

}
