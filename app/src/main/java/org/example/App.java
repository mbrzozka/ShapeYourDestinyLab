package org.example;

public class App {
  // Basic driver program that creates and displays results for each chape
  public static void main(String[] args) {
    Circle c = new Circle(4);
    Rectangle r = new Rectangle(5, 2);
    Square s = new Square(6);
    RightTriangle rt = new RightTriangle(3, 4);
    IsoscelesRightTriangle irt = new IsoscelesRightTriangle(7);
    System.out.println("Circle:");
    System.out.println("Area = " + c.getArea());
    System.out.println("Perimeter = " + c.getPerimeter());
    System.out.println();
    System.out.println("Rectangle:");
    System.out.println("Area = " + r.getArea());
    System.out.println("Perimeter = " + r.getPerimeter());
    System.out.println("Sides = " + r.numberOfSides());
    System.out.println();
    System.out.println("Square:");
    System.out.println("Area = " + s.getArea());
    System.out.println("Perimeter = " + s.getPerimeter());
    System.out.println("Sides = " + s.numberOfSides());
    System.out.println();
    System.out.println("Right Triangle:");
    System.out.println("Area = " + rt.getArea());
    System.out.println("Perimeter = " + rt.getPerimeter());
    System.out.println("Sides = " + rt.numberOfSides());
    System.out.println();
    System.out.println("Isosceles Right Triangle:");
    System.out.println("Area = " + irt.getArea());
    System.out.println("Perimeter = " + irt.getPerimeter());
    System.out.println("Sides = " + irt.numberOfSides());
  }
}