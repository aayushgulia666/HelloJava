package com.aayush.gulia.Recursion;

public class TowerOfHanoi {
    public static void TOH(int n, int a, int b, int c){
        if (n > 0){
            TOH(n-1, a, c, b);
            System.out.println("Move disk " + n + " from rod " + a + " to rod " + c + " using rod" + b);
            TOH(n-1, b, a ,c);
        }
    }

    public static void main(String[] args) {
        TOH(4, 1, 2, 3);
    }
}
