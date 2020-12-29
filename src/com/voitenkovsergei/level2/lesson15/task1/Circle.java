package com.voitenkovsergei.level2.lesson15.task1;

public class Circle extends Figure implements CalculatingCircle {

    private final Point point;

    public Circle(String name, Point point) {
        super(name);
        this.point = point;
    }

    public double countRadius() {
        return Math.sqrt(Math.pow((point.getX()), 2) + Math.pow(point.getY(), 2));
    }

    @Override
    public double countDiameter() {
        return 2 * countRadius();
    }

    @Override
    public double countArea() {
        return Math.PI * Math.pow((countRadius()), 2);
    }

    @Override
    public double countPerimeter() {
        return Math.PI * countDiameter();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                "} " + super.toString();
    }

    public Point getPoint() {
        return point;
    }
}