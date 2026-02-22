package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IsoscelesRightTriangleTest {
    // Test area of an isosceles right triangle with legs of 7
    @Test
    public void testArea() {
        IsoscelesRightTriangle irt = new IsoscelesRightTriangle(7);
        assertEquals(0.5 * 7 * 7, irt.getArea(), 0.0001);
    }
    
    // Test perimeter of an isosceles right triangle with legs of 7
    @Test
    public void testPerimeter() {
        IsoscelesRightTriangle irt = new IsoscelesRightTriangle(7);
        double expected = 7 + 7 + Math.sqrt(7 * 7 + 7 * 7);
        assertEquals(expected, irt.getPerimeter(), 0.0001);
    }

    // Test getting the leg of an isosceles right triangle with legs of 7
    @Test
    public void testGetLeg() {
        IsoscelesRightTriangle irt = new IsoscelesRightTriangle(7);
        assertEquals(7, irt.getLeg());
    }
}