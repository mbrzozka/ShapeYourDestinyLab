package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SquareTest {
    // Tests for square with side length 9
    @Test
    public void testArea() {
        Square s = new Square(9);
        assertEquals(81, s.getArea(), 0.0001); // Should return 81
    }

    // Tests for perimeter of square with side length 9
    @Test
    public void testPerimeter() {
        Square s = new Square(9);
        assertEquals(36, s.getPerimeter(), 0.0001); // Should return 36
    }

    // Tests for number of sides of square
    @Test
    public void testNumberOfSides() {
        Square s = new Square(9);
        assertEquals(4, s.numberOfSides()); // Should return 4
    }

    // Tests getting side length of square with side length 9
    @Test
    public void testGetSide() {
        Square s = new Square(9);
        assertEquals(9, s.getSide()); // Should return 9
    }

    // Tests square type hierarchy: Square -> Rectangle -> Parallelogram -> Polygon
    @Test
    public void testHierarchy() {
        Square s = new Square(9);
        assertTrue(s instanceof Parallelogram);
        assertTrue(s instanceof Polygon);
    }
}
