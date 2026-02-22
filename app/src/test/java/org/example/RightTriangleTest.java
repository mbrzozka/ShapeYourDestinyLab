package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RightTriangleTest {
    // Tests for right triangle with legs 6 and 8
    @Test
    public void testArea() {
        RightTriangle rt = new RightTriangle(6, 8);
        assertEquals(24, rt.getArea(), 0.0001); // Should return 24
    }

    // Tests for perimeter of right triangle with legs 6 and 8
    @Test
    public void testPerimeter() {
        RightTriangle rt = new RightTriangle(6, 8);
        double expected = 6 + 8 + 10;  // Hypotenuse = sqrt(36 + 64) = 10
        assertEquals(expected, rt.getPerimeter(), 0.0001); // Should return 24
    }

    // Tests for number of sides of right triangle
    @Test
    public void testNumberOfSides() {
        RightTriangle rt = new RightTriangle(6, 8);
        assertEquals(3, rt.numberOfSides()); // Should return 3
    }

    // Tests getting leg lengths of right triangle with legs 6 and 8
    @Test
    public void testGetters() {
        RightTriangle rt = new RightTriangle(6, 8);
        assertEquals(6, rt.getLegA()); // Should return 6
        assertEquals(8, rt.getLegB()); // Should return 8
    }
}
