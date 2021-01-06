package com.voitenkovsergei.level2.lesson15.task1;

public final class ShapeUtils {

    private ShapeUtils() {
    }

    public static boolean isRectangle(Figure figure) {
        return figure instanceof Rectangle;
    }

    public static boolean isTriangle(Figure figure) {
        return figure instanceof Triangle;
    }

    public static void toPrint(Figure figure) {
        System.out.println(figure.getName() + " является прямоугольником ? " + isRectangle(figure));
        System.out.println(figure.getName() + " является треугольником ? " + isTriangle(figure));
    }
}