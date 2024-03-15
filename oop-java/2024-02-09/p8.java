class p8 {
    public static void main(String args[]) {
        three_D box = new three_D(10, 20, 30);
        box.calculate_price();
        box.display();
    }
}

class two_D {
    int length;
    int width;

    two_D(int length, int width) {
        this.length = length;
        this.width = width;
    }
}

class three_D extends two_D {
    int height;
    int total;
    int price = 60;

    three_D(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    void calculate_price() {
        total = length * width * height * price;
    }

    void display() {
        System.out.printf("Length: \t%d\n", length);
        System.out.printf("Width: \t\t%d\n", width);
        System.out.printf("Height: \t%d\n", height);
        System.out.printf("Total (Rs.): \t%d\n", total);
    }
}