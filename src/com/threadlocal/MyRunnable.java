package com.threadlocal;


import java.util.Date;


public class MyRunnable implements Runnable {


    private String command;

    public MyRunnable(String s) {
        this.command = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Start.time=" + new Date());
        processComand();
        System.out.println(Thread.currentThread().getName()+"end.time"+new Date());


    }

    private void processComand() {
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        return this.command;
    }
}
