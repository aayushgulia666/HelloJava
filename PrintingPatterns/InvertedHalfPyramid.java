package com.aayush.gulia.PrintingPatterns;

public class InvertedHalfPyramid {
    /**
     * Q) Print the pattern.
     *
     *         *
     *        **
     *       ***
     *      ****
     *     *****
     */

    /* no. of rows and columns are equal
     *
     *  here we have to print * and spaces " ". we will use two nested for loops.
     *  one will print stars and one will print spaces.
     * */

    static void invertedHalfPyramid(int n){

        /**
         *              *
         *            * *
         *          * * *
         *        * * * *
         */

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void reverseInvertedHalfPyramid(int n){

        /**
         *         * * * * *
         *           * * * *
         *             * * *
         *               * *
         *                 *
         */

        for (int i=n; i>=1; i--){
            for (int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            for (int j=1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        reverseInvertedHalfPyramid(5);
        invertedHalfPyramid(5);


        /**
         * Both this method together prints.
         *
         *           * * * * *
         *            * * * *
         *              * * *
         *                * *
         *                  *
         *                  *
         *                * *
         *              * * *
         *            * * * *
         *          * * * * *
         */
    }
}
