package com.voitenkovsergei.level2.lesson15.task1;

public class Test {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Прямоугольник", 6, 8);
        Rectangle rectangle2 = new Rectangle("Прямоугольник2", 6, 8);

        rectangle.countArea();
        rectangle.countDiagonal();
        rectangle.countPerimeter();
        rectangle2.countArea();
        rectangle2.countDiagonal();
        rectangle2.countPerimeter();
        ShapeUtils.toPrint(rectangle);
        System.out.println("Сумма площадей равны ? " + rectangle.isAreaEqual(rectangle2.getArea()));
        System.out.println(rectangle.toString());
        System.out.println(rectangle2.toString());

        Square square = new Square("Квадрат", 6);
        Square square2 = new Square("Квадрат2", 5);

        square.countArea();
        square.countPerimeter();
        square.countArea();
        square2.countArea();
        square2.countPerimeter();
        square2.countArea();
        rectangle.isAreaEqual(rectangle2.getArea());
        ShapeUtils.toPrint(square);
        System.out.println("Сумма площадей равны ? " + square.isAreaEqual(square2.getArea()));
        System.out.println(square.toString());
        System.out.println(square2.toString());

        Triangle triangle = new Triangle("Треугольник", 6, 6, 8);
        Triangle triangle2 = new Triangle("Треугольник2", 6, 6, 6);

        triangle.countArea();
        triangle.countDiagonal();
        triangle.countPerimeter();
        triangle2.countArea();
        triangle2.countDiagonal();
        triangle2.countPerimeter();
        ShapeUtils.toPrint(triangle);
        System.out.println("Сумма площадей равны ? " + triangle.isAreaEqual(triangle2.getArea()));
        System.out.println(triangle.toString());
        System.out.println(triangle2.toString());

        Parallelogram parallelogram = new Parallelogram("Треугольник", 6, 6, 30);
        Parallelogram parallelogram2 = new Parallelogram("Треугольник2", 6, 6, 40);

        parallelogram.countArea();
        parallelogram.countDiagonal();
        parallelogram.countPerimeter();
        parallelogram.countHeight();
        parallelogram2.countArea();
        parallelogram2.countDiagonal();
        parallelogram2.countPerimeter();
        parallelogram2.countHeight();
        ShapeUtils.toPrint(parallelogram);
        System.out.println("Сумма площадей равны ? " + parallelogram.isAreaEqual(parallelogram2.getArea()));
        System.out.println(parallelogram.toString());
        System.out.println(parallelogram2.toString());
    }
}