package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    public void testArea() {
        Square s = new Square(5);
        assertEquals(25, s.getArea(), 0.0001);   // 5 * 5
    }

    @Test
    public void testPerimeter() {
        Square s = new Square(5);
        assertEquals(20, s.getPerimeter(), 0.0001);  // 4 * 5
    }

    @Test
    public void testGetSide() {
        Square s = new Square(5);
        assertEquals(5, s.getSide());
    }
}