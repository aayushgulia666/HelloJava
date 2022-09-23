package com.aayush.gulia;

import java.util.Scanner;

public class DecimalToHexa {
    public static void main(String[] args) {
        UI();
        CE();
    }

    public static void UI() {
        System.out.println("Decimal to Hexadecimal convertor");
        System.out.println("v.1 (beta)");
        System.out.println("Please enter base 10 number below: ");
    }

    public static void CE() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String convertedToHexadecimal = Integer.toHexString(x);
        System.out.println("Hexadecimal val: " + convertedToHexadecimal);
    }
}
