package com.aayush.gulia;

import java.util.Scanner;

public class Main {
    // program to add two numbers.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter two numbers: ");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=a+b;
        System.out.println("Sum is "+c);
    }
}
