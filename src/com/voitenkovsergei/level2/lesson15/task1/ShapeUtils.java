package com.voitenkovsergei.level2.lesson15.task1;

public class ShapeUtils {

    public static boolean isRectangle(Object obj) {
        return obj instanceof Rectangle;
    }

    public static boolean isTriangle(Object obj) {
        return obj instanceof Triangle;
    }

    public static void toPrint(Object obj){
        System.out.println(Object.class.getSimpleName() + " является прямоугольником ? " + isRectangle(obj));
        System.out.println(Object.class.getSimpleName() + " является треугольником ? " + isTriangle(obj));
    }
}