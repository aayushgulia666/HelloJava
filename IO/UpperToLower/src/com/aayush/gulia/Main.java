package com.aayush.gulia;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
    This approach is more efficient then previous one
    Source1.txt contains all upper case letters.
    Source2.txt contains all lower case letters which are converted.

    @author: aayushgulia07@outlook.com
    @github: https://github.com/Aayush000001/HelloJava/

    ASCII 65 - 90 (Upper_case)
    ASCII 97 - 122 (Lower_case)
 */

public class Main {

    public static void main(String[] args) throws Exception{
        FileInputStream fileInputStream = new FileInputStream("C:\\UpperToLower\\src\\com\\aayush\\gulia\\Source1.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\UpperToLower\\src\\com\\aayush\\gulia\\Source2.txt");

        int i;
        while((i=fileInputStream.read())!=-1){
            if(i>=65 && i<=90){
                fileOutputStream.write(i+32);
            }
            else{
                fileOutputStream.write(i);
            }
        }
        System.out.println("Operation completed");
    }
}
