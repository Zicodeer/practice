package com.atomic;

import java.util.concurrent.atomic.AtomicInteger;

//使用AtomicInteger实现MyLock
public class MyLock {
    private AtomicInteger status = new AtomicInteger(0);
    public void lock(){
        while (!status.compareAndSet(0,1)){
            Thread.yield();
        }
    }
    public void unlock(){
        status.compareAndSet(1,0);
    }
}
