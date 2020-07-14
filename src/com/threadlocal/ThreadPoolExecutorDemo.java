package com.threadlocal;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo {
    private static final int CORE_POOL_SIZE = 5;//核心线程数为5
    private static final int MAX_POOL_SIZE = 10;//最大线程数10
    private static final int QUEUE_CAPACITY = 10;//队列容量为10
    private static final long KEEP_ALIVE_TIME = 1L;//等待时间为1L

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                CORE_POOL_SIZE,
                MAX_POOL_SIZE,
                KEEP_ALIVE_TIME,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(QUEUE_CAPACITY),
                new ThreadPoolExecutor.CallerRunsPolicy());

        for (int i = 0;i<10;i++){
            Runnable worker = new MyRunnable(""+1);
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()){

        }
        System.out.println("Finished all threads");
    }

}
