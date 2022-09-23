package com.aayush.gulia.Polymorphism.Parameterized_Constructor;

public class Rectangle {
    int length, breadth;

    public Rectangle() {
        length = breadth = 1;
    }

    public Rectangle(int len, int br) {
        length = len;
        breadth = br;
    }

    public static void main(String[] args) {
        //Rectangle rectangle = new Rectangle(10,20); // these values will be overwritten when cuboid constructor will be called.
        Cuboid cuboid = new Cuboid(10, 20, 10);
        System.out.println(cuboid.volume());
    }
}

class Cuboid extends Rectangle {
    int height;

    public Cuboid() {
        height = 1;
    }

    public Cuboid(int len, int br, int h) {
        super(len, br); // super method passed values to parent class(super class). length & breadth to rectangle class
        height = h;
    }

    public int volume() {
        return length * breadth * height;
    }
}
