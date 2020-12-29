package com.voitenkovsergei.level2.lesson15.task1;

public class Triangle extends Polygon implements IPolygon {

    private Side side;
    private Side side2;
    private Side side3;
    private double semiPerimeter;

    public Triangle(String name, double side, double side2, double side3) {
        super(name);
        this.side = new Side(side);
        this.side2 = new Side(side2);
        this.side3 = new Side(side3);
    }

    @Override
    public void countArea() {
        countSemiPerimeter();
        setArea(Math.sqrt(getSemiPerimeter()
                * (getSemiPerimeter() - side.getValue())
                * (getSemiPerimeter() - side2.getValue())
                * (getSemiPerimeter() - side3.getValue())));
    }

    @Override
    public void countPerimeter() {
        setPerimeter(side.getValue() + side2.getValue() + side3.getValue());
    }

    @Override
    public void countDiagonal() {
        setDiagonal(side2.getValue());
    }

    @Override
    public String toString() {
        return "Triangle{" + super.toString() +
                "semiPerimeter=" + semiPerimeter +
                "} ";
    }

    public void countSemiPerimeter() {
        setSemiPerimeter(side.getValue() + side2.getValue() + side3.getValue() / 2);
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

    public Side getSide3() {
        return side3;
    }

    public void setSide3(Side side3) {
        this.side3 = side3;
    }

    public double getSemiPerimeter() {
        return semiPerimeter;
    }

    public void setSemiPerimeter(double semiPerimeter) {
        this.semiPerimeter = semiPerimeter;
    }
}