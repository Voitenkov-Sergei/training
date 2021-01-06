package com.voitenkovsergei.level2.lesson18.task1;

import com.voitenkovsergei.level2.lesson11.task1.Point;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Pair<Point, String> kvPair1 = new Pair<>(new Point(12, 11), "Hello");
        Pair<Integer, ArrayList<String>> kvPair2 = new Pair<>(12, new ArrayList<String>());
        System.out.println(kvPair1.toString());
        System.out.println(kvPair2.toString());
        Pair<String, Point> pair1 = PairUtil.swap(kvPair1);
        Pair<ArrayList<String>, Integer> pair2 = PairUtil.swap(kvPair2);
        System.out.println(pair1);
        System.out.println(pair2);
    }
}