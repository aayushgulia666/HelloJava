package com.aayush.gulia.IO.Classes;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*
    @author: aayushgulia07@outlook.com
    Buffered output stream add a buffer to an existing output stream.
 */

public class BufferedOutputStream_exm {
    public static void main(String[] args) throws Exception{
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\CopyUpperToLower\\src\\Final_Production\\Text.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        String str = "This is an example of buffered output stream.";
        byte[] bytes = str.getBytes();

        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush(); // pushes all the data in buffer to the output stream.
        bufferedOutputStream.close();
    }
}
