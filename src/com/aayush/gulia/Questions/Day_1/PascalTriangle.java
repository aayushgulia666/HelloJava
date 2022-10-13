package com.aayush.gulia.StriverSheet.Day_1;

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

    public static void printPascalTriangle(int n){
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

    public static void main(String[] args) {
        printPascalTriangle(5);
    }

}
