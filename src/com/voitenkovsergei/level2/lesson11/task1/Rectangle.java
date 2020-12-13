package com.voitenkovsergei.level2.lesson11.task1;

public class Rectangle {

    Point coordinateOfTheUpperLeftCorner;
    Point coordinateOfTheLowerRightCorner;

    public Rectangle(int x1, int y1, int x2, int y2) {
        coordinateOfTheUpperLeftCorner = new Point(x1, y1);
        coordinateOfTheLowerRightCorner = new Point(x2, y2);
    }

    public int getAreaOfTriangle() {
        return (coordinateOfTheLowerRightCorner.getCoordinateX() - coordinateOfTheUpperLeftCorner.getCoordinateX())
                * (coordinateOfTheUpperLeftCorner.getCoordinateY() - coordinateOfTheLowerRightCorner.getCoordinateY());
    }

    public double getLengthOfDiagonal() {
        int length = coordinateOfTheUpperLeftCorner.getCoordinateX() - coordinateOfTheLowerRightCorner.getCoordinateX();
        int height = coordinateOfTheLowerRightCorner.getCoordinateY() - coordinateOfTheUpperLeftCorner.getCoordinateY();

        return Math.sqrt(Math.pow(length, 2) + Math.pow(height, 2));
    }
}
