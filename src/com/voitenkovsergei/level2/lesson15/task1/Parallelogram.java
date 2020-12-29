package com.voitenkovsergei.level2.lesson15.task1;

public class Parallelogram extends Figure implements CalculatingDiagonal, CalculatingHeight {

    private final Side side1;
    private final Side side2;
    private final double angle;

    public Parallelogram(String name, Side side1, Side side2, double angle) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.angle = Math.toRadians(angle);
    }

    @Override
    public double countArea() {
        return side1.getValue() * side2.getValue() * Math.sin(angle);
    }

    @Override
    public double countPerimeter() {
        return 2 * side1.getValue() + 2 * side2.getValue();
    }

    @Override
    public double countDiagonal() {
        return Math.sqrt(Math.pow(side1.getValue(), 2)
                + Math.pow(side2.getValue(), 2)
                - 2 * side1.getValue()
                * side2.getValue()
                * Math.cos(angle));
    }

    @Override
    public double countHeight() {
        return side1.getValue() * Math.sin(angle);
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", angle=" + angle +
                "} " + super.toString();
    }

    public Side getSide1() {
        return side1;
    }

    public Side getSide2() {
        return side2;
    }

    public double getAngle() {
        return angle;
    }
}