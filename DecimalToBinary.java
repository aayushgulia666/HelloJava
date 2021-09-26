package com.aayush.gulia;

import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) throws InterruptedException {
        UI();
        ConvertorEngine();
    }
    public static void ConvertorEngine() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String getBinary = Integer.toBinaryString(x);
        Thread.sleep(2000);
        System.out.println("Conversion completed.");
        System.out.println("Converted Binary num is : ----> " + getBinary);
        Thread.sleep(5000);
        System.out.println("Program ended here.");
    }
    public static void UI(){
        System.out.println("Welcome to Decimal to Binary convertor . . .");
        System.out.println("v.1");
        System.out.println("<---------------><________________><------------>");
        System.out.println("Please enter base 10 number below.");
    }
}
