package com.aayush.gulia.Abstract_Class;

/*
    @author: Aayush Gulia
    @email: aayushgulia07@outlook.com

There are 2 types of classes in java
1) Concrete class
2) abstract class

1) Abstract class: is a class which have abstract written in front of it's class deceleration.
Ex: abstract class AnshulGulia{}

2) We cannot create objects of abstract class, it's not allowed.
Ex: AnshulGulia anshulGulia;                (Allowed); B.T.W it's a reference here.
    anshulGulia = new AnshulGulia           (NA); B.T.W object creation

3) Abstract class can have both abstract and non abstract methods.

4) We cannot create objects of abstract classes because abstract classes are not complete classes, can contain
   abstract method which are incomplete methods, does not contain method body.

1) Concrete class: all classes which are declared without are concrete classes.
Ex: class AayushGulia{}

2) We can create an object here.

3) It must be declared abstract if it contains abstract methods.



 */

public class First_1 {
}

abstract class First_2{
    public static void main(String[] args) {

    }
    void Meth1(){
        System.out.println("This is method 1"); // Normal method inside abstract class.
    }

    abstract void Meth2(); // Abstract method inside an abstract class.
    /*
    (A method which is not having body).
    abstract method does not contain any method body. It only has method deceleration and the parenthesis and after it
    semicolon, that's all.
     */
}

/*
    Class sub can be a concrete class only if it overrides all the method of abstract class which it is extending
    or,
    it have to be an abstract class

    +++++++++++++++X+++++++++++++++++

    an abstract class can have both non abstract method and abstract method, but
    a class must be declared abstract if it contain at least one abstract method.(1 or many)
 */
class sub extends First_2{
    @Override // this method is overriding in sub class
    void Meth2() {

    }
}
