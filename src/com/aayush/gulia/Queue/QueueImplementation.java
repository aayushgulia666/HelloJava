package com.aayush.gulia.Queue;

/*
        @author: Aayush Gulia
        @email: aayushgulia07@outlook.com
        @dated: 03-04-2022

        Queue Implementation using two pointers(front and rear, these are just indexes) and an array.
        This class contains operations : enqueue -> to insert an element into queue
                                         dequeue -> to remove an element from the queue
                                         createQueue -> to create a queue of desired size
                                         display -> to display all the element of the queue

         Queue is empty if >>> rear == front or vice-versa
         Queue is full is rear equals to size-1

         Initially rear=front=-1
         front pointer is one index ahead to the next element, as an example front at 0 is pointing to element at index 1.

         ### Insertion is done at the rear ###
         ### Deletion is done at the front ###
 */
public class QueueImplementation {
    static int maxSizeQueue = 0;
    static int rear, front;
    static int[] array;

    public static void main(String[] args) {
        createQueue(20);
        enqueue(12);
        enqueue(13);
        enqueue(14);
        enqueue(15);
        display();
        System.out.println(dequeue());
        System.out.println(dequeue());
        enqueue(67);
        enqueue(67);
        enqueue(67);
        enqueue(67);
        display();

    }

    static void display() {
        for (int i = front + 1; i < rear; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n");
    }

    static void createQueue(int size) {
        maxSizeQueue = size;
        rear = front = -1;
        array = new int[maxSizeQueue];
    }

    static void enqueue(int x) {
        if (rear == maxSizeQueue - 1) {
            System.out.println("Queue Overflow");
        } else {
            rear++;
            array[rear] = x;
        }
    }

    static int dequeue() {
        int x = -1;
        if (rear == front) {
            System.out.println("Queue Underflow");
            return x;
        } else {
            front++;
            x = array[front];
            return x;
        }
    }
}
