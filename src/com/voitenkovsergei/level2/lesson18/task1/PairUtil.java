package com.voitenkovsergei.level2.lesson18.task1;

public final class PairUtil {

    private PairUtil() {
    }

    public static <X, Y> Pair<Y, X> swap(Pair<X, Y> kvPair) {
        return new Pair<>(kvPair.getValue(), kvPair.getKey());
    }
}