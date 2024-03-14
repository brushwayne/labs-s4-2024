public class p8 {
    public static void main(String[] args) {

        Shape rect = new Rectangle();
        Shape circle = new Circle();
    
        rect.draw();
        circle.draw();
    }
}

interface Shape {
    void draw();
    }

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
    
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}