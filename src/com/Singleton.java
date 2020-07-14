package com;

//public class Singleton {
//    private volatile static Singleton uniqueInstance;
//    private Singleton(){
//
//    }
//    public static Singleton getUniqueInstance(){
//        if (uniqueInstance == null){
//            synchronized (Singleton.class){
//                if (uniqueInstance==null){
//                    uniqueInstance = new Singleton();
//                }
//            }
//        }
//        return uniqueInstance;
//    }
//}


public class Singleton {
    private static volatile Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }


        }
       return uniqueInstance;
    }
}
