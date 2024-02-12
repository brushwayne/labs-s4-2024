/*Is method overriding possible by changing the return type of a function? Write a program in
java to create an abstract class shape having data members length, breath, base, height, and
abstract method calculateArea(). Derive two classes Triangle and Rectangle having member
function calculateArea(). The Program will find the area of Triangle and Rectangle by function
overriding concept. [Sub class should not contain any data member]*/

class p9 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 10);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("Area of triangle: " + triangle.calculateArea());
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}

abstract class Shape {
    int length, breadth, base, height;

    abstract double calculateArea();
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea() {
        return length * breadth;
    }
}


