package com.aayush.gulia.PrintingPatterns;

public class KoyoElectricPatternQuestion {
    /**
     *
     *  Q) Print this pattern.
     *
     *          * * * * *
     *          * * *
     *          *
     */

    static void printPattern(int n){
        for (int i=n; i>=1; i = i-2){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(13);
    }
}
