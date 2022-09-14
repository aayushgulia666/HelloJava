package com.aayush.gulia.IO.Classes;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
/*
    SequenceInputStream is used to combine multiple input streams.
    It reads data sequentially(one by one).
    Default constructor supports two streams, but we can create a Vector and then enumerating object to take inputs from multiple
    input streams.

    @author: aayushgulia07@outlook.com
 */

public class SequenceInputStream_exm {
    public static void main(String[] args) throws Exception{
        FileInputStream fileInputStream1 = new FileInputStream("C:\\CopyUpperToLower\\src\\Final_Production\\Test.txt");
        FileInputStream fileInputStream2 = new FileInputStream("C:\\CopyUpperToLower\\src\\Final_Production\\Text.txt");

        SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1, fileInputStream2);

        int i;
        while ((i=sequenceInputStream.read())!=-1){
            System.out.print((char) i);
        }
    }
}
