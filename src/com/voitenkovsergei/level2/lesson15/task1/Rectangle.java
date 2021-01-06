package com.voitenkovsergei.level2.lesson15.task1;

public class Rectangle extends Figure implements CalculatingDiagonal {

    private final Side side1;
    private final Side side2;

    public Rectangle(String name, Side side1, Side side2) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double countArea() {
        return side1.getValue() * side2.getValue();
    }

    @Override
    public double countPerimeter() {
        return 2 * side1.getValue() + 2 * side2.getValue();
    }

    @Override
    public double countDiagonal() {
        return Math.sqrt(Math.pow(side1.getValue(), 2) + Math.pow(side2.getValue(), 2));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                "} " + super.toString();
    }

    public Side getSide1() {
        return side1;
    }

    public Side getSide2() {
        return side2;
    }
}