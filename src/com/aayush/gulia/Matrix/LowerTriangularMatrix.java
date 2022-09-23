package com.aayush.gulia.Matrix;

import java.util.Scanner;

/*
        @author: Aayush Gulia
        @email: aayushgulia07@outlook.com

        In this class, we are defining the dimensions of a diagonal matrix(also a square matrix) and allocating the size
        of matrix at runtime.

        We are storing the elements of a lowerTriangularMatrix in an array to save resources

        elements of this matrix is mapped on an array using a row major formula as follows : i*(i-1)/2+j-1 i->rows, j0->columns

 */

public class LowerTriangularMatrix {
    static int DIMENSION;
    static int x;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dimension : ");
        DIMENSION = scanner.nextInt();

        int[] arr = new int[DIMENSION * (DIMENSION + 1) / 2];

        for (int i = 1; i <= DIMENSION; i++) {
            for (int j = 1; j <= DIMENSION; j++) {
                x = scanner.nextInt();
                set(arr, i, j, x);
            }
        }
        display(arr);
    }

    static void set(int[] arr, int i, int j, int x) {
        if (i >= j) {
            arr[i * (i - 1) / 2 + j - 1] = x;
        }
    }

    static void display(int[] arr) {
        for (int i = 1; i <= DIMENSION; i++) {
            for (int j = 1; j <= DIMENSION; j++) {
                if (i >= j) {
                    System.out.print(arr[i * (i - 1) / 2 + j - 1] + " ");
                } else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
}