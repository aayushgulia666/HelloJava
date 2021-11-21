package com.aayush.gulia;

/*
    In this project we will be creating a file we capital characters and then copying that file to another file
    containing that characters in lower case.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws Exception{
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\CopyUpperToLower\\src\\com\\aayush\\gulia\\Upper.txt");
        String upperString = "I AM CURRENTLY LEARNING JAVA PROGRAMMING LANGUAGE";
        fileOutputStream.write(upperString.getBytes(StandardCharsets.UTF_8));

        FileInputStream fileInputStream = new FileInputStream("C:\\CopyUpperToLower\\src\\com\\aayush\\gulia\\Upper.txt");
        byte [] byteArray = new byte[fileInputStream.available()];
        fileInputStream.read(byteArray);
        String str = new String(byteArray);
        // convert that upper case string to lower case string

        String lowerString = new String(str.toLowerCase());

        FileOutputStream fileOutputStream1 = new FileOutputStream("C:\\CopyUpperToLower\\src\\com\\aayush\\gulia\\UpperToLower.txt");
        fileOutputStream1.write(lowerString.getBytes());

        System.out.println("Operation completed.");

    }
}
