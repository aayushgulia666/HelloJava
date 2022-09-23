package com.aayush.gulia.IO.Classes;

import java.io.FileInputStream;

public class FileInputStream_exm {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("C:\\CopyUpperToLower\\src\\Final_Production\\Text.txt");

        int i;
        while ((i = fileInputStream.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
