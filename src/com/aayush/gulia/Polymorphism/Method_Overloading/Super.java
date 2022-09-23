package com.aayush.gulia.Polymorphism.Method_Overloading;
/*
    @author: Aayush Gulia
    @email: aayushgulia07@outlook.com
redefining the method of super class in sub class.
In this program there are two void methods Display() with same name and same signature, it's called
method overriding not overloading.
 */

public class Super {
    public Super() {

    }

    void Display() {
        System.out.println("Display method of super class.");
    }
}

class Child extends Super {
    public Child() {

    }

    void Display() {
        super.Display(); // this calls method of it's super class.
        System.out.println("Display method of child class");
        /*
        This Display method is override in it's sub class.
         */
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.Display();
//        Super s = new Super();
//        s.Display();
    }
}
