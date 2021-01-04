package com.voitenkovsergei.level2.lesson18.task1;

public class Test {

    public static void main(String[] args) {
        Pair<K, V> pair = new Pair<>(new K(10), new V("Text"));

        System.out.println(pair.toString());
        System.out.println(PairUtil.swap(pair));
    }
}