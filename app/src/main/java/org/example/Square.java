package org.example;

public class Square extends Rectangle {
    public Square(double side) {
        // Call the constructor for Rectangle with length and width both equal to side
        super(side, side);
    }

    public double getSide() {
        return getLength(); // Length and width are the same
    }
}
