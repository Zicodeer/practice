package com.myFuture;

import java.awt.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Finall {
//   List<String> list = new LinkedList<String>();
//   LinkedList linkedList = new LinkedList();
//
//
//   Map<String,String> map = new HashMap<String, String>();
//   HashMap hashMap = new HashMap();

    //    public static void main(String[] args){
//        Map<String,String> map = new HashMap<String, String>();
//        map.put(String.valueOf(System.currentTimeMillis()) + "a","1");
//        map.put(String.valueOf(System.currentTimeMillis()) + "a","2");
//        map.put(String.valueOf(System.currentTimeMillis()) + "a","3");
//        for (Map.Entry<String,String> entry : map.entrySet()){
//            System.out.println(entry.getValue());
//        }
//    }
    //方法可以与类同名
    void Finall(){

    }
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put(String.valueOf(System.nanoTime()) + "a", "1");
        map.put(String.valueOf(System.nanoTime()) + "a", "2");
        map.put(String.valueOf(System.nanoTime()) + "a", "3");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }


    }
}
