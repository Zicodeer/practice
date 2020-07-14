package com.algorithm;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LRUCache {
    LinkedHashMap<Integer, Integer> map;
    int capacity;

    public void LRUCache(int capacity) {

        map = new LinkedHashMap<>(capacity + 1, 0.75f, true);
        this.capacity = capacity;

    }

    public int getKey(int key) {
        if (!map.containsKey(key)) {                       //查看是否包含某个Key
            return -1;
        } else {
            return map.get(key);
        }

    }

    public void putKey(int key, int value) {
        map.put(key, value);
        if (map.size() > capacity) {
            Iterator it = map.keySet().iterator();             //keySet获取Map中key的集合
            map.remove(it.next());
        }


    }
}
