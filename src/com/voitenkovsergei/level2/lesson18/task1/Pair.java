package com.voitenkovsergei.level2.lesson18.task1;

public class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K k, V v) {
        super();
        this.key = k;
        this.value = v;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "k=" + key +
                ", v=" + value +
                '}';
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}