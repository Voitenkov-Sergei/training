package com.voitenkovsergei.level2.lesson15.task1;

public class Square extends Figure implements CalculatingDiagonal {

    private final Side side;

    public Square(String name, Side side) {
        super(name);
        this.side = side;
    }

    @Override
    public double countArea() {
        return Math.pow(side.getValue(), 2);
    }

    @Override
    public double countPerimeter() {
        return side.getValue() * 4;
    }

    @Override
    public double countDiagonal() {
        return Math.sqrt(2) * side.getValue();
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "} " + super.toString();
    }

    public Side getSide() {
        return side;
    }
}