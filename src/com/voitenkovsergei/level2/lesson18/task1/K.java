package com.voitenkovsergei.level2.lesson18.task1;

public class K {

    private final int key;

    public K(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "K{" +
                "key=" + key +
                '}';
    }

    public int getKey() {
        return key;
    }
}