package com.myFuture;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//HashMap七种遍历方式

public class HashMapIterator {
    public static void main(String[] args) {

        //迭代器（iterator）EntrySet方式遍历
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "dd");
        map.put(2, "aa");
        map.put(3, "cc");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + entry.getValue());

        }
        //迭代器（iterator）KeySet方式遍历
        Map<Integer, String> map1 = new HashMap<>();
        map.put(1, "dd");
        map.put(2, "aa");
        map.put(3, "cc");
        Iterator<Integer> iterator1 = map1.keySet().iterator();
        while (iterator1.hasNext()) {
            Integer key = iterator1.next();
            System.out.println(key);
            System.out.println(map.get(key));
        }
        //ForEach EntrySet方式遍历
        Map<Integer, String> map2 = new HashMap<>();
        map.put(1, "dd");
        map.put(2, "aa");
        map.put(3, "cc");

        for (Map.Entry<Integer, String> entry : map2.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        //ForEach KeySet方式遍历

        Map<Integer, String> map3 = new HashMap<>();
        map3.put(1, "dd");
        map3.put(2, "aa");
        map3.put(3, "cc");

        for (Integer key : map3.keySet()) {
            System.out.println(key);
            System.out.println(map3.get(key));
        }

        //Lambda方式遍历
        Map<Integer, String> map4 = new HashMap<>();
        map4.put(1, "dd");
        map4.put(2, "aa");
        map4.put(3, "cc");

        map4.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
        });

        //Stream API单线程
        Map<Integer, String> map5 = new HashMap<>();
        map5.put(1, "dd");
        map5.put(2, "aa");
        map5.put(3, "cc");

        map5.entrySet().stream().forEach((entry) -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });

        //Stream API多线程

        Map<Integer, String> map6 = new HashMap<>();
        map6.put(1, "dd");
        map6.put(2, "aa");
        map6.put(3, "cc");

        map6.entrySet().parallelStream().forEach((entry) -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });

    }
}
