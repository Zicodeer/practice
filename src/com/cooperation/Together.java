package com.cooperation;
//同时开始
public class Together {
    //协作对象
    static class FireFlag{
        private volatile boolean fired = false;
        public synchronized void waitForFire() throws InterruptedException{
            while (!fired){
                wait();
            }
        }
        public synchronized void fire(){
            this.fired = true;
            notifyAll();
        }
    }
    static class Racer extends Thread{
        FireFlag fireFlag;
        public Racer(FireFlag fireFlag){
            this.fireFlag = fireFlag;
        }
        @Override
        public void run(){
            try {
                this.fireFlag.waitForFire();
                System.out.println("start run" +Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        int num = 10;
        FireFlag fireFlag = new FireFlag();
        Thread[] recers = new Thread[num];
        for (int i = 0;i < num;i++){
            recers[i] = new Racer(fireFlag);
            recers[i].start();
        }
        Thread.sleep(1000);
        fireFlag.fire();
    }
}
