package org.example;

public class IsoscelesRightTriangle extends RightTriangle {
    public IsoscelesRightTriangle(double leg) {
        // Call the constructor for RightTriangle with both legs equal to leg
        super(leg, leg);
    }

    public double getLeg() {
        return getLegA(); // Both legs are equal
    }
}
