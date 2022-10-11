package com.aayush.gulia.Recursion;

public class TypesOfRecursion {

    /**
     * Iterative version of tail recursion.
     */

    public static void tailRecursionIterative(int n){
        while (n > 0){
            System.out.println(n);
            n--;
        }
    }

    /**
     * Tail recursion is defined as a recursive function in which the recursive call is the last
     * statement that is executed by the function. So basically nothing is left to execute after
     * the recursion call.
     *
     * Tail recursion can be easily converted into iterative function, iterative functions are more space efficient in case of tail recursion
     * some compilers under code optimization detects tail recursion and converts it into a loop to reduce space consumption.
     */

    public static void tailRecursion(int n){
        if (n > 0){
            System.out.println(n);
            tailRecursion(n-1);
        }
    }

    /**
     * If a recursive function calling itself and that recursive call is the first statement in the function then it’s known as
     * Head Recursion. all the processing is done at the returning time.
     */

    public static void headRecursion(int n){
        if (n > 0){
            headRecursion(n-1);
            System.out.println(n);
        }
    }

    /**
     * Head recursion are a little trickier to convert into loop, but it can be converted..
     */

    public static void headRecursionIterative(int n){
        for (int i=1; i<=n; i++){
            System.out.println(i);
        }
    }

    public static void treeRecursion(int n){
        if (n > 0){
            System.out.println(n);
            treeRecursion(n-1);
            treeRecursion(n-1);
        }

    }

    public static void indirectRecursion(){

    }

    public static void main(String[] args) {
        treeRecursion(3);
    }

    public static void nestedRecursion(){

    }
}
