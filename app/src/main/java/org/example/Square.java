package org.example;

public class Square extends Rectangle { // No need to implement polygon since Rectangle already does
    public Square(double side) {
        super(side, side);
    }

    @Override
    public int numberOfSides() {
        return 4;
    }

    public double getSide() {
        return getLength();
    }
}
