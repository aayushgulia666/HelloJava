package com.aayush.gulia;

public class Different_Primitive_Data_Classes{
    // program to print min and max values of different primitive data types.
    /*
    "javap java.lang.Integer" command line text generated showing all the methods and variables of the class.
    For every primitive data type there is a corresponding class which provides different methods about
    that data type.
     */
    public static void main(String[] args) {
        MyDouble();
        MyInteger();
        MyByte();
        MyFloat();
        MyChar();
    }
    public static void MyDouble(){
        double x,y;
        x=65.69;
        y=98.96;
        System.out.println(Double.sum(x,y));
        String str = Double.toHexString(x);
        System.out.println(Double.NEGATIVE_INFINITY);
    }
    public static void MyChar(){
        System.out.println("Char info");
        System.out.println("-------------------------------------");
        System.out.println("Min val of char: " + Character.MIN_VALUE);
        System.out.println("Max val of char: " + Character.MAX_VALUE);
        System.out.println("Size of char(Bytes) " + Character.BYTES);
        System.out.println("Size of char(Bits) " + Character.SIZE);

    }

    public static void MyFloat(){
        System.out.println("Float info");
        System.out.println("-------------------------------------");
        System.out.println("Min val of Float: " + Float.MIN_VALUE);
        System.out.println("Max val of Float: " + Float.MAX_VALUE);
        System.out.println("Size of Float(Bytes) " + Float.BYTES);
        System.out.println("Size of Float(Bits) " + Float.SIZE);
        System.out.println("-------------------------------------");
    }
    public static void MyByte(){
        System.out.println("byte info");
        System.out.println("-------------------------------------");
        System.out.println("Min val of byte: " + Byte.MIN_VALUE);
        System.out.println("Max val of byte: " + Byte.MAX_VALUE);
        System.out.println("Size of byte: (bytes) " + Byte.BYTES);
        System.out.println("Size of byte: (bits) " + Byte.SIZE);
        System.out.println("-------------------------------------");

    }

    public static void MyInteger(){
        // Integer min and max values.
        System.out.println("**************************************");
        System.out.println("Integer info");
        System.out.println("-------------------------------------");
        System.out.println("Min val of int: " + Integer.MIN_VALUE);
        System.out.println("Max val of int: " + Integer.MAX_VALUE);
        System.out.println("Size of int: (bytes) " + Integer.BYTES); // Integer.BYTES gives number of bytes taken by an integer.
        System.out.println("Size of int: (bits) " + Integer.SIZE); // Integer.SIZE gives number of bits taken by an integer.
        System.out.println("-------------------------------------");
        /*
        1 byte = 8 bits.
        therefore, Integer.SIZE = 32 (4*8)
         */
    }
}
