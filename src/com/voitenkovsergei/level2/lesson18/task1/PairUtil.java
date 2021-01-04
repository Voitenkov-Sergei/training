package com.voitenkovsergei.level2.lesson18.task1;

public final class PairUtil {

    private PairUtil() {
    }

    public static Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair<>(pair.getValue(), pair.getKey());
    }
}