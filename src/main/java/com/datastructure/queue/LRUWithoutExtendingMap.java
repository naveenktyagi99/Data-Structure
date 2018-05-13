package com.datastructure.queue;

import com.datastructure.linkedlist.LinkedList;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LRUWithoutExtendingMap {

    private int capacity;

    LinkedHashMap<Integer, Integer> map = null;

    LRUWithoutExtendingMap(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<Integer, Integer>();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        } else {
            int value = map.get(key);
            this.set(key, value);
            return value;
        }
    }


    private void set(int key, int value) {
        if (map.containsKey(key)) {
            map.remove(key);
        } else if (map.size() == capacity) {
            Iterator<Integer> iterator = map.keySet().iterator();
            iterator.next();
            iterator.remove();
        }
        map.put(key, value);
    }

    public void printCache() {
        for (int key : map.keySet()) {
            System.out.println("Key: " + key + " --> " + map.get(key));
        }
    }

    public static void main(String arr[]) {
        LRUWithoutExtendingMap object = new LRUWithoutExtendingMap(3);
        object.set(1, 1);
        object.set(2, 2);
        object.set(3, 3);
        object.printCache();


    }
}
