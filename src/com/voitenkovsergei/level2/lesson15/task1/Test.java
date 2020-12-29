package com.voitenkovsergei.level2.lesson15.task1;

public class Test {

    public static void main(String[] args) {
        Figure rectangle = new Rectangle("Прямоугольник1", new Side(4), new Side(6));
        Figure rectangle2 = new Rectangle("Прямоугольник2", new Side(4), new Side(6));
        Figure square = new Square("Квадрат", new Side(4));
        Figure triangle = new Triangle("Треугольник", new Side(6), new Side(6), new Side(6));
        Figure parallelogram = new Parallelogram("Параллелограмм", new Side(6), new Side(6), 30);
        Figure circle = new Circle("Круг", new Point(2, 0));
        getResult(rectangle, rectangle2, square, triangle, parallelogram, circle);
        checkAreaMatch(rectangle, rectangle2, square, triangle, parallelogram, circle);
    }

    public static void getResult(Figure... figures) {
        for (Figure figure : figures) {
            System.out.println(figure.getName() + ":");
            System.out.println(figure.toString());
            System.out.println("площадь = '" + figure.countArea() + "'");
            System.out.println("периметр = '" + figure.countPerimeter() + "'");

            if (figure instanceof Circle) {
                System.out.println("диаметр = '" + ((Circle) figure).countDiameter() + "'");
                System.out.println("радиус = '" + ((Circle) figure).countRadius() + "'");
                ShapeUtils.toPrint(figure);
            } else if (figure instanceof Parallelogram) {
                System.out.println("диагональ = '" + ((Parallelogram) figure).countDiagonal() + "'");
                System.out.println("высота = '" + ((Parallelogram) figure).countHeight() + "'");
                ShapeUtils.toPrint(figure);
            } else if (figure instanceof Rectangle) {
                System.out.println("диагональ = '" + ((Rectangle) figure).countDiagonal() + "'");
                ShapeUtils.toPrint(figure);
            } else if (figure instanceof Square) {
                System.out.println("диагональ = '" + ((Square) figure).countDiagonal() + "'");
                ShapeUtils.toPrint(figure);
            } else if (figure instanceof Triangle) {
                System.out.println("высота = '" + ((Triangle) figure).countHeight() + "'");
                ShapeUtils.toPrint(figure);
            }
            System.out.println();
        }
    }

    public static void checkAreaMatch(Figure... figures) {
        for (int i = 0; i < figures.length; i++) {

            for (int j = i + 1; j < figures.length; j++) {
                boolean bool = (figures[i].isAreaEqual(figures[j]));
                System.out.println("Площадь фигуры '" + figures[i].getName()
                        + "' = площади фигуры '" + figures[j].getName() + "' - ? " + bool);
            }
        }
    }
}