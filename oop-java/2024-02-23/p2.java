public class p2 {
    public static void main(String args[]) {
        
        Circle c = new Circle(4.5);
        c.calcArea();
        c.display();

        Triangle t = new Triangle(4.5, 3.6, 7.5);
        t.calcArea();
        t.display();
    }
}

abstract class Shape {
    double area;

    void calcArea() {

    }

    void display() {

    }
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    void calcArea() {
        area = 3.141 * radius * radius;
    }

    @Override
    void display() {
        System.out.printf("Area: \t%f\n", area);
    }
}

class Triangle extends Shape {
    
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    void calcArea() {
        double s = (a + b + c) / 2.0;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    void display() {
        System.out.printf("Area: \t%f\n", area);
    }
}