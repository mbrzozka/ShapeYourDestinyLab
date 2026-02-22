package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RightTriangleTest {
    @Test
    public void testArea() {
        RightTriangle rt = new RightTriangle(3, 4);
        assertEquals(6, rt.getArea(), 0.0001);  // 1/2 * 3 * 4
    }

    @Test
    public void testPerimeter() {
        RightTriangle rt = new RightTriangle(3, 4);
        double expected = 3 + 4 + 5;  // Hypotenuse = 5
        assertEquals(expected, rt.getPerimeter(), 0.0001);
    }

    @Test
    public void testGetters() {
        RightTriangle rt = new RightTriangle(3, 4);
        assertEquals(3, rt.getLegA());
        assertEquals(4, rt.getLegB());
    }
}
