package com.aayush.gulia.IO.Classes;

import java.io.DataInputStream;
import java.io.FileInputStream;
/*
    Java application generally uses the data output stream to write data that can later be read by a data input stream.
    (in a machine independent way)

    @author: aayushgulia07@outlook.com
 */

public class DataInputStream_exm {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("C:\\CopyUpperToLower\\src\\Final_Production\\Text.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);

        int i;
        while ((i = dataInputStream.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
