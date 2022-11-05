package com.aayush.gulia.Queue;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.LinkedList;
import java.util.Queue;

/**
 * We can easily implement a stack using two queues.
 */

public class ImplementStackUsingQueues {
    static Queue<Integer> queue1 = new LinkedList<>();
    static Queue<Integer> queue2 = new LinkedList<>();

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);

        for (int i = 0; i< 5; i++){
            System.out.print(queue1.remove() + " ");
        }

        System.out.println(isEmpty());
        System.out.println(pop());
        System.out.println(top());
    }

    private static void push(int x){
        queue2.add(x);

        // add q1 to q2
        while (!queue1.isEmpty()){
            queue2.add(queue1.remove());
        }

        Queue<Integer> temp;
        temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    private static int pop(){
        return queue1.remove();
    }

    private static int top(){
        if (!queue1.isEmpty()){
            return queue1.peek();
        }
        return -1;
    }

    private static boolean isEmpty(){
        return queue1.isEmpty();
    }
}
