package com.voitenkovsergei.level2.lesson15.task1;

public class Triangle extends Figure implements CalculatingHeight {

    private final Side side1;
    private final Side side2;
    private final Side side3;

    public Triangle(String name, Side side1, Side side2, Side side3) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double countArea() {
        double semiPerimeter = countSemiPerimeter();
        return (Math.sqrt(semiPerimeter
                * (semiPerimeter - side1.getValue())
                * (semiPerimeter - side2.getValue())
                * (semiPerimeter - side3.getValue())));
    }

    @Override
    public double countPerimeter() {
        return side1.getValue() + side2.getValue() + side3.getValue();
    }

    public double countSemiPerimeter() {
        return (side1.getValue() + side2.getValue() + side3.getValue()) / 2;
    }

    @Override
    public double countHeight() {
        return 2 * countArea() / side1.getValue();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                "} " + super.toString();
    }

    public Side getSide() {
        return side1;
    }

    public Side getSide2() {
        return side2;
    }

    public Side getSide3() {
        return side3;
    }
}