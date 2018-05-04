package com.datastructure.queue;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private static final long serialVersionID = 1L;
    private int lruSize = 5;

    LRUCache(int lruSize) {
        super(16, 0.75f, true);
        this.lruSize = lruSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > lruSize;
    }

    public static void main(String[] args) {
        int cacheSize = 5;
        Map<Integer, String> friends = new LRUCache<>(cacheSize);

        friends.put(1000, "Kuldeep");
        friends.put(2000, "Harsh");
        friends.put(3000, "Mukul");
        friends.put(4000, "Ashwini");
        friends.put(5000, "Pankaj");
        printCache(friends);

        friends.put(90000, "Saurabh");
        friends.put(10000, "Nikhil");
        System.out.println("************");
        printCache(friends);
    }

    private static void printCache(Map<Integer, String> lruCache) {

        lruCache.forEach((key, value) -> {
                    System.out.println("key: " + key + " Value: " + value);
                }
        );

    }
}
