package com.aayush.gulia.Patterns;

public class SolidRectangle {
    /**
     * Printing solid rectangle.
     *          * * * *
     *          * * * *
     *          * * * *
     *          * * * *
     *          * * * *
     */

    static void printSolidRectangle(int n){
        /* n - no. of rows */

        for (int i=1; i<=n; i++){
            for (int j=1; j<=4; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printSolidRectangle(5);
    }
}
