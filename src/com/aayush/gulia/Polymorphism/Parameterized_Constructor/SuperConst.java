package com.aayush.gulia.Polymorphism.Parameterized_Constructor;

public class SuperConst {
    public static void main(String[] args) {
        Child child1 = new Child(10, 20);
    }
}

class Parent {
    public Parent() {
        System.out.println("Non - param constructor of parent class");
    }

    public Parent(int x, int y) {
        System.out.println("param constructor of parent class " + x + " " + y);
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Non - param constructor of child class");
    }

    public Child(int y) {
        System.out.println("param constructor of child class ");
    }

    public Child(int x, int y) {
        super(x, y);
        System.out.println("2 param constructor of child class --> y val: " + y + " --> x val: " + x);
    }
}
