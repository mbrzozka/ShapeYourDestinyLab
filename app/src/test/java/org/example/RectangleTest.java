package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void testArea() {
        Rectangle r = new Rectangle(4, 6);
        assertEquals(24, r.getArea(), 0.0001);
    }

    @Test
    public void testPerimeter() {
        Rectangle r = new Rectangle(4, 6);
        assertEquals(20, r.getPerimeter(), 0.0001);
    }

    @Test
    public void testGetters() {
        Rectangle r = new Rectangle(4, 6);
        assertEquals(4, r.getLength());
        assertEquals(6, r.getWidth());
    }
}