public class p3 {
    public static void main(String args[]) {
        
        Circle c = new Circle(4.5);
        c.calcArea();
        c.display();
    }
}

class Circle {
    double area;
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    
    void calcArea() {
        area = 3.141 * radius * radius;
    }

    void display() {
        System.out.printf("Area: \t%f\n", area);
    }
}