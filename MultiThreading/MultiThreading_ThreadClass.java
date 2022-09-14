package com.aayush.gulia.MultiThreading;

/*
Main method is also a Thread.

Multithreading by extending Thread class.
 */

public class MultiThreading_ThreadClass {
    public static void main(String[] args) {
        Start s = new Start();
        s.start();
        int i=0;
        while(i<20){
            System.out.println("World : " + i);
            i++;
        }
    }

}

class Start extends Thread{
    public void run() {
        Display();
    }

    void Display() {
        int i = 0;
        while (i < 20) {
            System.out.println("Hello : " + i);
            i++;
        }
    }
}


