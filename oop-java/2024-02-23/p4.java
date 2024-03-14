public class p4 {
    public static void main(String args[]) {
        
        Circle c = new Circle(4.5);
        c.calcArea();
        c.display();
    }
}

abstract class Shape {
    double area;

    void calcArea() {

    }
}

interface disp {
    void display();
}

class Circle extends Shape implements disp {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    
    void calcArea() {
        area = 3.141 * radius * radius;
    }

    public void display() {
        System.out.printf("Area: \t%f\n", area);
    }
}
