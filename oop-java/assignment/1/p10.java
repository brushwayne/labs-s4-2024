/*Let us consider two types of geometrical shapes: 1-D shape and 2-D shape. A shape in
general provides with the basic interface to display the non-measurable shape related
information like the name of the shape or dimension of the shape. Further assume that 1-D
shapes have only one measurable metric: the length and 2-D shapes have two measurable
metrics: the perimeter and the area. Finally, consider that a straight line is a 1-D shape and a
circle is a 2-D shape. Write a Java program to represent shape, 1-D shape, 2-D shape and 3-D
shape as suitable interfaces containing proper abstract methods, and straight line and circle as
suitable classes that implements the previously defined interfaces. Note that, no actual
computation is necessary in implementation. Supply only the print messages wherever needed*/

class p10 {
    public static void main(String[] args) {
        StraightLine line = new StraightLine(5.0);
        Circle circle = new Circle(3.0);

        System.out.println("Line:");
        line.printName();
        line.printDimensions();

        System.out.println("\nCircle:");
        circle.printName();
        circle.printDimensions();
    }
}

interface Shape {
    void printName();
    void printDimensions();
}

interface Measurable1D extends Shape {
    double getLength();
}

interface Measurable2D extends Shape {
    double getPerimeter();
    double getArea();
}

abstract class AbstractShape implements Shape {
    public void printName() {
        System.out.println("Generic Shape");
    }

    public void printDimensions() {

    }
}

class StraightLine extends AbstractShape implements Measurable1D {
    private double length;

    StraightLine(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void printDimensions() {
        System.out.println("Length: " + length);
    }
}

class Circle extends AbstractShape implements Measurable2D {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void printDimensions() {
        System.out.println("Radius: " + radius);
    }
}

