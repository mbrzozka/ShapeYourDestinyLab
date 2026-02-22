package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IsoscelesRightTriangleTest {
    // Tests for isosceles right triangle with leg length 10
    @Test
    public void testArea() {
        IsoscelesRightTriangle irt = new IsoscelesRightTriangle(10);
        assertEquals(50, irt.getArea(), 0.01);  // Should return 50
    }

    // Tests for perimeter of isosceles right triangle with leg length 10
    @Test
    public void testPerimeter() {
        IsoscelesRightTriangle irt = new IsoscelesRightTriangle(10);
        double expected = 10 + 10 + Math.sqrt(200);  // Hypotenuse = 10√2
        assertEquals(expected, irt.getPerimeter(), 0.01); // Should return 10 + 10 + 10√2
    }

    // Tests for number of sides of isosceles right triangle
    @Test
    public void testNumberOfSides() {
        IsoscelesRightTriangle irt = new IsoscelesRightTriangle(10);
        assertEquals(3, irt.numberOfSides()); // Should return 3
    }

    // Tests getting leg length of isosceles right triangle
    @Test
    public void testGetLeg() {
        IsoscelesRightTriangle irt = new IsoscelesRightTriangle(10);
        assertEquals(10, irt.getLeg()); // Should return 10
    }
}