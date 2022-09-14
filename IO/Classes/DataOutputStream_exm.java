package com.aayush.gulia.IO.Classes;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
/*
    DataOutputStream: used to write data which can be read by DataInputStream in a machine independent way.

    @author: aayushgulia07@outlook.com
 */

public class DataOutputStream_exm {
    public static void main(String[] args) throws Exception{
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\CopyUpperToLower\\src\\Final_Production\\Text.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

        String str = "This is an example of DataOutputStream";
        byte[] bytes = str.getBytes();

        dataOutputStream.write(bytes);
    }
}
