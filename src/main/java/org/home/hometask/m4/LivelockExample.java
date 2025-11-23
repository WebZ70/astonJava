package org.home.hometask.m4;

public class LivelockExample {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                synchronized (lock1) {
                    System.out.println("Поток 1: Удерживает lock1...");
                    try { Thread.sleep(2000); } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (!Thread.holdsLock(lock2)) {
                        System.out.println("Поток 1: Освобождает lock1 и пытается снова...");
                        continue;
                    }
                    System.out.println("Поток 1: Захватил оба lock");
                    break;
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            while (true) {
                synchronized (lock2) {
                    System.out.println("Поток 2: Удерживает lock2...");
                    try { Thread.sleep(6000); } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (!Thread.holdsLock(lock1)) {
                        System.out.println("Поток 2: Освобождает lock2 и пытается снова...");
                        continue;
                    }
                    System.out.println("Поток 2: Захватил оба lock");
                    break;
                }
            }
        });
        thread1.start();
        thread2.start();
    }


}

