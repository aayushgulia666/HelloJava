package com.aayush.gulia.Polymorphism;

public class Parent {
    public Parent() {
        System.out.println("Parent class constructor");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("Main method of Parent class");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child class constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method of Child class");
        Child child = new Child();
//        Parent parent = new Parent();
    }
}

class GrandChild extends Child {
    public GrandChild() {
        System.out.println("Grand Child constructor");
    }

    public static void main(String[] args) {
        GrandChild grandChild = new GrandChild();
        System.out.println("Main method of grand child");
        /*
        Only one main method will be called, but the constructors of all the super classes will be called.
        Constructors are called from top to bottom.
        i.,e. Parent then child then child . . .
        Q) Why it works in this way ?

         */
    }
}
