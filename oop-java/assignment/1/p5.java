/*Create a class Data with data members: height and breadth of object given by the user and
member functions get_data() to read the values and put_data() to display the values. Create
another class Rectangle that inherits class Data and implement its methods areaRectangle ()
and perimeterRectangle() that computes the area and perimeter of a rectangle. Create another
class Triangle that inherits class Data and implement its methods areaTriangle() and
perimeterTriangle() that computes the area and perimeter of a triangle.*/


import java.io.*;

class p5 {
    public static void main(String args[])throws IOException {

        Rectangle r = new Rectangle(10, 20);
        System.out.printf("Area of Rectangle: %d\n", r.areaRectangle());
        System.out.printf("Perimeter of rectangle: %d\n", r.perimeterRectangle());

        Triangle t = new Triangle(5, 6, 7);
        System.out.printf("Area of Triangle: %f\n", t.areaTriangle());
        System.out.printf("Perimeter of Triangle: %f\n", t.perimeterTriangle());
    }
}

class Data {
    
    int height;
    int breadth;

    Data(int height, int breadth) {
        this.height = height;
        this.breadth = breadth;
    }

    void get_data()throws IOException {
        BufferedReader in = new BufferedReader
        (new InputStreamReader(System.in));

        height = Integer.parseInt(in.readLine());
        breadth = Integer.parseInt(in.readLine());
    }

    void put_data() {
        System.out.printf("Height: %d\n", height);
        System.out.printf("Breadth: %d\n", breadth);
    }
}

class Rectangle extends Data {

    Rectangle(int height, int breadth) {
        super(height, breadth);
    }

    int areaRectangle() {
        return height * breadth;
    }

    int perimeterRectangle() {
        return 2 * (height + breadth);
    }
}

class Triangle {
    double a, b, c;

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double perimeterTriangle() {
        return a + b + c;
    }

    double areaTriangle() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}