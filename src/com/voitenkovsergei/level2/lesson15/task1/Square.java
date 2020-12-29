package com.voitenkovsergei.level2.lesson15.task1;

public class Square extends Polygon implements IPolygon {

    private Side side;

    public Square(String name, double side) {
        super(name);
        this.side = new Side(side);
    }

    @Override
    public void countArea() {
        setArea(Math.pow(side.getValue(), 2));
    }

    @Override
    public void countPerimeter() {
        setPerimeter(side.getValue() * 4);
    }

    @Override
    public void countDiagonal() {
        setDiagonal(Math.sqrt(2) * side.getValue());
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }
}