package com.aayush.gulia.Recursion;

public class HelloWorld {
    public static void helloWorld(int n){
        if (n == 0)
            return;
        System.out.println("Hello World");
        helloWorld(n-1);
    }
}
