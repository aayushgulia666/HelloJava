package com.aayush.gulia.Mathematics;

public class Gcd {
    public static int gcd(int a, int b){
        if (b==0)
            return a;
        return gcd(b, a%b);
    }

    public static int fastPower(int x, int y){

        int result = 1;

        while (y > 0) {
            if ((y & 1) == 0) {
                x *= x;
                y >>>= 1;
            } else {
                result *= x;
                y--;
            }
        }
        return result;

//        int result = 1;
//
//        while (b > 0){
//
//        if ((b&1) != 0){
//            result = result * a;
//        }
//
//        a = a * a;
//        b = b >> 1;
//        }
//        return result;
    }

    public static int power(int a, int b){
        int result = 1;

        for (int i=0; i<b; i++){
            result = result * a;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(fastPower(2, 5));
    }
}
