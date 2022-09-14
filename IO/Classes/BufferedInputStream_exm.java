package com.aayush.gulia.IO.Classes;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
/*
    @author: aayushgulia07@outlook.com
 */

public class BufferedInputStream_exm {
    public static void main(String[] args) throws Exception{
        FileInputStream fileInputStream = new FileInputStream("C:\\CopyUpperToLower\\src\\Final_Production\\Text.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        int i;
        while((i= bufferedInputStream.read())!=-1){
            System.out.print((char) i);
        }
    }
}
