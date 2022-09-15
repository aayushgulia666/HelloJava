package com.aayush.gulia.PrintingPatterns;

import java.util.Scanner;

public class PrintPyramid {
    /**
     * Q) Print this pattern.
     *
     *
     *                    *
     *                   ***
     *                  *****
     *                 *******
     *                *********
     *               ***********
     *              *************
     *
     *
     */

    static void printPattern(int n){
        /* n - number of rows
        *  m - number of columns
        */

        // number of rows
        int m = n*2-1;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=m; j++){
                if (j >= n - (i-1) && j <= n + (i - 1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = scanner.nextInt();
        printPattern(n);
    }
}
