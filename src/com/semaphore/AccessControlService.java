package com.semaphore;

import java.util.concurrent.Semaphore;

public class AccessControlService {
    public static class ConcurrentLimitException extends RuntimeException{
        private static final long serialVersionUID =1L;
    }
    private static final int MAX_PERMITS = 100;
    private Semaphore permits = new Semaphore(MAX_PERMITS,true);
    public boolean login(String name,String password){
        if (!permits.tryAcquire()){
            throw new ConcurrentLimitException();
        }
        return true;
    }
    public void logout(String name){
        permits.release();
    }
}
