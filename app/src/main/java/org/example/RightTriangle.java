package org.example;

public class RightTriangle extends Shape implements Polygon {
    private double legA;
    private double legB;
    public RightTriangle(double legA, double legB) {
        this.legA = legA;
        this.legB = legB;
    }

    @Override
    public double getArea() {
        return 0.5 * legA * legB;
    }

    @Override
    public double getPerimeter() {
        double hypotenuse = Math.sqrt((legA * legA) + (legB * legB));
        return legA + legB + hypotenuse;
    }

    @Override
    public int numberOfSides() {
        return 3;
    }

    public double getLegA() {
        return legA;
    }

    public double getLegB() {
        return legB;
    }
}