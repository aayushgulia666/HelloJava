package com.aayush.gulia.IO.Classes;

import java.io.FileOutputStream;

public class FileOutputStream_exm {
    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\CopyUpperToLower\\src\\Final_Production\\Test.txt");

        String str = "This is an example of FileOutputString java program.";
        byte[] bytes = str.getBytes();

        fileOutputStream.write(bytes);
        fileOutputStream.close(); // closing a stream after usage is a good practice.
    }
}
