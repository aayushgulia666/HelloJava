package com.aayush.gulia.Recursion;

/**
 * Recursion have two phases 1) Ascending and 2) Descending.
 *
 * A loop only has ascending phases.
 */

public class PhasesOfRecursion {
    public static void func(int n){
        if (n > 0){
            System.out.println("Hello -> Ascending phase");

            /* Statements here will be executed at calling time */

            func(n-1);

            /* Statements here will be executed at returning time */

            System.out.println("world -> Descending phase");
        }
    }

    public static void main(String[] args) {
        func(5);
    }
}
