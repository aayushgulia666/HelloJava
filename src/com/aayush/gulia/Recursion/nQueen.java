package com.aayush.gulia.Recursion;


public class nQueen {
    static int[][] input = {{0,0,0,0},
                     {0,0,0,0},
                     {0,0,0,0},
                     {0,0,0,0}};

    private static void solve(int column, int[][] board){
        if (column == board.length){
            display(board);
            return;
        }

        for (int row=0; row<board.length; row++){
            if (isSafe(row, column, board)){
                board[row][column] = 1;
                solve(column+1, board);
                board[row][column] = 0;
            }
        }
    }

    private static boolean isSafe(int row, int col, int[][] board){
        // upper diagonal
        int r = row;
        int c = col;
        while (row >= 0 && col >= 0){
            if (board[row][col] == 1) return false;
            row--;
            col--;
        }

        //left arm
        row = r;
        col = c;
        while (col >= 0){
            if (board[row][col] == 1) return false;
            col--;
        }

        //lower diagonal
        col = c;
        while (row < board.length && col >= 0){
            if (board[row][col] == 1) return false;
            row++;
            col--;
        }

        return true;
    }

    private static void display(int[][] arr){
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        solve(0, input);
    }
}
