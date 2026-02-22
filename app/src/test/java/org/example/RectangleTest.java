package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    // Tests for rectangle with length 8 and width 3
    @Test
    public void testArea() {
        Rectangle r = new Rectangle(8, 3);
        assertEquals(24, r.getArea(), 0.0001); // Should return 24
    }

    // Tests for perimeter of rectangle with length 8 and width 3
    @Test
    public void testPerimeter() {
        Rectangle r = new Rectangle(8, 3);
        assertEquals(22, r.getPerimeter(), 0.0001); // Should return 22
    }

    // Tests for number of sides of rectangle
    @Test
    public void testNumberOfSides() {
        Rectangle r = new Rectangle(8, 3);
        assertEquals(4, r.numberOfSides()); // Should return 4
    }

    // Tests getting length and width of rectangle with length 8 and width 3
    @Test
    public void testGetters() {
        Rectangle r = new Rectangle(8, 3);
        assertEquals(8, r.getLength()); // Should return 8
        assertEquals(3, r.getWidth()); // Should return 3
    }
}