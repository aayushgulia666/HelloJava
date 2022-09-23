package com.aayush.gulia.PrintingPatterns;

public class HalfPyramids {

    /**
     * Q) Print the pattern.
     * <p>
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     * * * * * * *
     * * * * * * * *
     * <p>
     * * * * * * * *
     * * * * * * *
     * * * * * *
     * * * * *
     * * * *
     * * *
     * *
     */
    static void halfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        halfPyramid(7);
    }
}
