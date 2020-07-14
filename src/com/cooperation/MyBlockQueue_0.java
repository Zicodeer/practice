package com.cooperation;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyBlockQueue_0 {
    static class MyBlockQueue<E>{
        private Queue<E> queue = null;
        private int limit;
        public MyBlockQueue(int limit){
            this.limit = limit;
            queue = new ArrayDeque<>(limit);
        }
        public synchronized void put(E e) throws InterruptedException{
            while (queue.size() == limit){
                wait();
            }
            queue.add(e);
            notifyAll();
        }
        public synchronized E take() throws InterruptedException{
            while (queue.isEmpty()){
                wait();
            }
            E e = queue.poll();
            notifyAll();
            return e;
        }
    }
    //生产者
    static class Producer extends Thread{
        MyBlockQueue<String> queue;
        public Producer(MyBlockQueue<String> queue){
            this.queue = queue;

        }
        @Override
        public void  run(){
            int num = 0;
            try {
                while (true){
                    String task = String.valueOf(num);
                    queue.put(task);
                    System.out.println("produce task" + task);
                    num++;
                    Thread.sleep((long) (Math.random()*100));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //消费者
    static class Consume extends Thread{
        MyBlockQueue<String> queue;
        public Consume(MyBlockQueue<String> queue){
            this.queue = queue;
        }
        @Override
        public void run(){
            try {
                while (true){
                    String task = queue.take();
                    System.out.println("handle task" + task);
                    Thread.sleep((long) (Math.random()*100));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        MyBlockQueue<String> queue = new MyBlockQueue<>(10);
        new Producer(queue).start();
        new Consume(queue).start();
    }
}
