package org.home.hometask.m4;

public class AlternatingThreads {
    private static final Object lock = new Object();
    private static boolean turn = true;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (!turn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.print("1");
                    turn = false;
                    lock.notify();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (turn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.print("2");
                    turn = true;
                    lock.notify();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
