class p9 {
    public static void main(String args[]) {

        WoodBox wb = new WoodBox(10, 20, 30, "RED");

        System.out.println(wb.length);
        System.out.println(wb.width);
        System.out.println(wb.height);
        System.out.println(wb.color);
    }
}

class Plate {
    int length;
    int width;

    Plate(int length, int width) {
        this.length = length;
        this.width = width;
    }
}

class Box extends Plate {
    int height;
    
    Box(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }
}

class WoodBox extends Box {
    String color;

    WoodBox(int length, int width, int height, String color) {
        super(length, width, height);
        this.color = color;
    }
}