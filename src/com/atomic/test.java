package com.atomic;

import java.util.concurrent.atomic.AtomicInteger;

class test1 {
    private volatile int count = 0;

    public synchronized void increment() {

        count++;
    }

    public int getCount() {
        return count;

    }
}

//多线程下使用原子类保证线程安全

class test2 {
    private AtomicInteger count = new AtomicInteger();

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }

}
/**
 AtomicInteger 主要利用CAS+volatile+native方法来保证原子操作，从而避免了synchronized的高开销；

 CAS的原理是拿期望的值和原本的一个值作比较，如果相同则更新成新的值。
 */