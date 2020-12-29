package com.voitenkovsergei.level2.lesson15.task1;

public class Rectangle extends Polygon implements IPolygon {

    Side side;
    Side side2;

    public Rectangle(String name, double side, double side2) {
        super(name);
        this.side = new Side(side);
        this.side2 = new Side(side2);
    }

    @Override
    public void countArea() {
        setArea(side.getValue() * side2.getValue());
    }

    @Override
    public void countPerimeter() {
        setPerimeter(2 * side.getValue() + 2 * side2.getValue());
    }

    @Override
    public void countDiagonal() {
        setDiagonal(Math.sqrt(Math.pow(side.getValue(), 2) + Math.pow(side2.getValue(), 2)));
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
}