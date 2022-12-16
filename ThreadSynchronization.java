/*
 * Write a Java program that implements a multi-threaded program
 * which has three threads. First thread generates a random integer every
 * 1 second. If the value is even, second thread computes the square of the
 * number and prints. If the value is odd the third thread will print
 * the value of cube of the number. Use thread Synchronization. 

 * ALGORITHM
 * 
 * 1. Start
 * 2. Declare an object of Thread1
 * 3. Call start() method of Thread1
 * 4. Stop
 * 
 * Algorithm for run() in Thread1
 * 1. Start
 * 2. While true
 * 3.     Sleep for 1 second
 * 4.     Generate a random number
 * 5.     If the number is even
 * 6.         Create an object of Thread2
 * 7.         Call start() method of Thread2
 * 8.     Else
 * 9.         Create an object of Thread3
 * 10.        Call start() method of Thread3
 * 11. Stop
 * 
 * Algorithm for run() in Thread2
 * 1. Start
 * 2. Print the square of the number
 * 3. Stop
 * 
 * Algorithm for run() in Thread3
 * 1. Start
 * 2. Print the cube of the number
 * 3. Stop
 */

import java.util.Random;

public class ThreadSynchronization {
    public static class Thread1 extends Thread {
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int n = new Random().nextInt(10);
                System.out.println("Thread 1: " + n);
                if (n % 2 == 0) {
                    Thread2 t2 = new Thread2(n);
                    t2.start();
                } else {
                    Thread3 t3 = new Thread3(n);
                    t3.start();
                }
            }
        }
    }

    public static class Thread2 extends Thread {
        private int n;

        public Thread2(int n) {
            this.n = n;
        }

        public void run() {
            System.out.println("Thread 2: " + n * n);
        }
    }

    public static class Thread3 extends Thread {
        private int n;

        public Thread3(int n) {
            this.n = n;
        }

        public void run() {
            System.out.println("Thread 3: " + n * n * n);
        }
    }

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
    }
}