MultiThreading.md

1) Java provides thread class and runnable interface to achieve multithreading.

2) Thread class contains the actual mechanism for multithreading.

3) In java a class can extend from only one class.

4) Runnable interface is used to extends class from some other class.

5) To achieve multithreading there need to be a class extending another class.

6) Run method is the starting point of a program for multithreading.

						STATES OF A THREAD

The first state of the thread is "new" it stores the object of the thread.

To run the object of thread the start method is called.

When start method is called then it is entered into the ready state where it is ready to run.

Then it enters into running state.

After completing the task it will enter into the terminated state.

A thread which is terminated is just like a thread which is killed.

					Therefore the different states of the Thread are: 

					NEW -> READY -> RUNNING -> TERMINATED

		While running the thread may also enter into different states like : 

		WAIT STATE: waiting for acquiring some resources or made to wait by some other thread. 

		TIME WAIT STATE: to make the thread delay for some time, using sleep method also called sleeping state.

		WAIT AND NOTIFY: when the thread is in the waiting state to get its chance till it gets notified.

		BLOCKED STATE: 