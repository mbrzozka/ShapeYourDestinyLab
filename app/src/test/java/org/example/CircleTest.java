package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    public void testArea() {
        Circle c = new Circle(5);
        double expected = Math.PI * 25;   // pi * r^2
        assertEquals(expected, c.getArea(), 0.01);
    }

    @Test
    public void testPerimeter() {
        Circle c = new Circle(5);
        double expected = 2 * Math.PI * 5;
        assertEquals(expected, c.getPerimeter(), 0.01);
    }

    @Test
    public void testGetRadius() {
        Circle c = new Circle(5);
        assertEquals(5, c.getRadius(), 0.01);
    }
}