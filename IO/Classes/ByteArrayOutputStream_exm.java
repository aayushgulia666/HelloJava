package com.aayush.gulia.IO.Classes;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
/*
    ByteArrayOutputStream - is used to write common data into multiple files,
    in this stream data is written into a byte array which can be written into
    multiple streams later.

    @author: aayushgulia07@outlook.com

 */
public class ByteArrayOutputStream_exm {
    public static void main(String[] args) throws Exception{
        FileOutputStream fileOutputStream1 = new FileOutputStream("C:\\CopyUpperToLower\\src\\Final_Production\\Text.txt");
        FileOutputStream fileOutputStream2 = new FileOutputStream("C:\\CopyUpperToLower\\src\\Final_Production\\Test.txt");

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        String str = "This is an example of ByteArrayOutputStream";
        byte[] bytes = str.getBytes();

        byteArrayOutputStream.write(bytes);

        byteArrayOutputStream.writeTo(fileOutputStream1);
        byteArrayOutputStream.writeTo(fileOutputStream2);
    }
}
