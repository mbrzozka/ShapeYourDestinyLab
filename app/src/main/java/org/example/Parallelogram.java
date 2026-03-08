package org.example;

public interface Parallelogram extends Polygon {
    @Override
    default int numberOfSides() {
        return 4;
    }
}
