package org.example;

public class IsoscelesRightTriangle extends RightTriangle { // No need to implement polygon since RightTriangle already does
    public IsoscelesRightTriangle(double leg) {
        super(leg, leg);
    }

    @Override
    public int numberOfSides() {
        return 3;
    }

    public double getLeg() {
        return getLegA();
    }
}
