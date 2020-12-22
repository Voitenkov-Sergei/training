package com.voitenkovsergei.level2.lesson11.task1;

public class Rectangle {

    private final Point coordinateOfTheUpperLeftCorner;
    private final Point coordinateOfTheLowerRightCorner;

    public Rectangle(Point coordinateOfTheUpperLeftCorner, Point coordinateOfTheLowerRightCorner) {
        this.coordinateOfTheUpperLeftCorner = coordinateOfTheUpperLeftCorner;
        this.coordinateOfTheLowerRightCorner = coordinateOfTheLowerRightCorner;
    }

    public int getArea() {
        return (coordinateOfTheLowerRightCorner.getCoordinateX() - coordinateOfTheUpperLeftCorner.getCoordinateX())
                * (coordinateOfTheUpperLeftCorner.getCoordinateY() - coordinateOfTheLowerRightCorner.getCoordinateY());
    }

    public double getDiagonal() {
        return coordinateOfTheUpperLeftCorner.distance(coordinateOfTheLowerRightCorner);
    }
}
