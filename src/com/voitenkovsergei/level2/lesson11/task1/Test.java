package com.voitenkovsergei.level2.lesson11.task1;

public class Test {

    public static void main(String[] args) {
        Point point1 = new Point(4, 8);
        Point point2 = new Point(8, 4);

        System.out.println(point1.distance(point2));

        Rectangle rectangle = new Rectangle(point1, point2);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getDiagonal());
    }
}
