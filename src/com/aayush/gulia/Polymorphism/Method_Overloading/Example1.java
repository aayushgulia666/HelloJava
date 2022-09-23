package com.aayush.gulia.Polymorphism.Method_Overloading;
/*
Dynamic Method Dispatch
    @author: Aayush Gulia
    @email: aayushgulia07@outlook.com
Methods are called based on objects not by reference.
 */

public class Example1 {
    void Display() {
        System.out.println("Display method of Example1");
    }

    public static void main(String[] args) {
    }
}

class sub extends Example1 {
    void Display() {
        System.out.println("Display method of sub class");
    }

    public static void main(String[] args) {
        Example1 ex = new sub(); // methods are called based on the object created not by reference.
        /*
        here Example1 is reference and new sub() is an object.
        ---? new object is created by taking the reference of Example1 and object of sub class.
         */
        ex.Display();
    }
}

