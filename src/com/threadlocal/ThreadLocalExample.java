package com.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Random;

public class ThreadLocalExample implements Runnable {
    private static final ThreadLocal<SimpleDateFormat> formatter = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyMMdd HHmm"));

    public static void main(String[] args) throws InterruptedException {
        ThreadLocalExample obj = new ThreadLocalExample();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(obj, " " + i);
            Thread.sleep(new Random().nextInt(1000));
            thread.start();

        }
    }


    @Override
    public void run() {
        System.out.println("Thread name" + Thread.currentThread().getName() + "default formatter" + formatter.get().toPattern());
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        formatter.set(new SimpleDateFormat());
        System.out.println("Thread name" + Thread.currentThread().getName() + " formatter" + formatter.get().toPattern());

    }
}
