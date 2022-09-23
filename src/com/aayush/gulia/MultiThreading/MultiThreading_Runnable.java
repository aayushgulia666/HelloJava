package com.aayush.gulia.MultiThreading;
/*
    Multi threading using runnable interface.

    it is mandatory to override run method with interface Runnable.
 */

public class MultiThreading_Runnable implements Runnable {
    @Override
    public void run() {
        Display();
    }

    public void Display() {
        int i = 0;
        while (true) {
            System.out.println("Hello : " + i);
            i++;
        }
    }

    public static void main(String[] args) {
        MultiThreading_Runnable multiThreading_runnable = new MultiThreading_Runnable();
        Thread t = new Thread(multiThreading_runnable); // passed the object of the class whose give it's own thread.
        t.start();
        int i = 0;
        while (true) {
            System.out.println("World : " + i);
            i++;
        }
    }
}
