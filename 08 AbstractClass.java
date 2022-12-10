/*
 * Write a java program to create an abstract class named Shape that
 * contains an empty method named numberOfSides( ). Provide three classes named Rectangle,
 * Triangle and Hexagon such that each one of the classes extends the class Shape.
 * Each one of the classes contains only the method numberOfSides( ) that shows the
 * number of sides in the given geometrical structures.

 * ALGORITHM
 * 
 * 1. Start
 * 2. Create objects of the Rectangle, Triangle and Hexagon class
 * 3. Call the method numberOfSides() for each object
 * 4. Stop
 * 
 * Algorithm for the Shape class
 * 1. Start
 * 2. Declare a method numberOfSides()
 * 3. Stop
 * 
 * Algorithm for the Rectangle class
 * 1. Start
 * 2. Inherit the Shape class
 * 3. Override the method numberOfSides()
 *    3.1 Print the number of sides in a rectangle
 * 4. Stop
 * 
 * Algorithm for the Triangle class
 * 1. Start
 * 2. Inherit the Shape class
 * 3. Override the method numberOfSides()
 *   3.1 Print the number of sides in a triangle
 * 4. Stop
 * 
 * Algorithm for the Hexagon class
 * 1. Start
 * 2. Inherit the Shape class
 * 3. Override the method numberOfSides()
 *  3.1 Print the number of sides in a hexagon
 * 4. Stop
 */

public class AbstractClass {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Hexagon hexagon = new Hexagon();

        rectangle.numberOfSides();
        triangle.numberOfSides();
        hexagon.numberOfSides();
    }
}

class Shape {
    public void numberOfSides() {}
}

class Rectangle extends Shape {
    public void numberOfSides() {
        System.out.println("Rectangle has 4 sides");
    }
}

class Triangle extends Shape {
    public void numberOfSides() {
        System.out.println("Triangle has 3 sides");
    }
}

class Hexagon extends Shape {
    public void numberOfSides() {
        System.out.println("Hexagon has 6 sides");
    }
}