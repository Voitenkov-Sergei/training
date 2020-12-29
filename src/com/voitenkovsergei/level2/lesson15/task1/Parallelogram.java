package com.voitenkovsergei.level2.lesson15.task1;

public class Parallelogram extends Polygon implements IPolygon {

    private Side side;
    private Side side2;
    private double angle;
    private double height;

    public Parallelogram(String name, double side, double side2, double angle) {
        super(name);
        this.side = new Side(side);
        this.side2 = new Side(side2);
        this.angle = Math.toRadians(angle);
    }

    @Override
    public void countArea() {
        setArea(side.getValue() * side2.getValue() * Math.sin(angle));
    }

    @Override
    public void countPerimeter() {
        setPerimeter(2 * side.getValue() + 2 * side2.getValue());
    }

    @Override
    public void countDiagonal() {
        setDiagonal(Math.sqrt(Math.pow(side.getValue(), 2)
                + Math.pow(side2.getValue(), 2)
                - 2 * side.getValue()
                * side2.getValue()
                * Math.cos(angle)));
    }

    @Override
    public String toString() {
        return "Parallelogram{" + super.toString() +
                "angle=" + angle +
                ", height=" + height +
                "} ";
    }

    public void countHeight() {
        setHeight(side.getValue() * Math.sin(angle));
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public Side getSide2() {
        return side2;
    }

    public void setSide2(Side side2) {
        this.side2 = side2;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public void setRightAngle(double angle) {
        this.angle = angle;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}