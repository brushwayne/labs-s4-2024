import java.io.*;

class p12 {

    public static void main(String args[])throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of toys: ");
        int items = Integer.parseInt(in.readLine());

        Toy toys[] = new Toy[items];

        System.out.println("-----------------");

        for (int i = 0; i < items; i++) {
            System.out.println("Item: " + (i + 1));

            System.out.print("Toy ID: ");
            int toy_id = Integer.parseInt(in.readLine());

            System.out.print("Toy Name: ");
            String toy_name = in.readLine();

            System.out.print("Toy Quantity: ");
            int toy_quantity = Integer.parseInt(in.readLine());

            System.out.print("Toy Price: ");
            float toy_price = Float.parseFloat(in.readLine());

            toys[i] = new Toy(toy_id, toy_name, toy_quantity, toy_price);
            
            System.out.println("-----------------");
        }

        float grand_total = 0;

        for (int i = 0; i < items; i++) {
            grand_total += toys[i].toy_price * toys[i].toy_quantity;
        }

        for (int i = 0; i < items; i++) {
            System.out.println("Toy ID\tToy Name\tToy Quantity\tToy Price");
            System.out.println(
                toys[i].toy_id       + "\t\t" +
                toys[i].toy_name     + "\t\t" +
                toys[i].toy_quantity + "\t\t" +
                toys[i].toy_price
            );        
        }

        System.out.println("Grand Total: " + grand_total);
    }
}

class Toy {

    int toy_id;
    String toy_name;
    int toy_quantity;
    float toy_price;

    Toy (int toy_id, String toy_name, int toy_quantity, float toy_price) {
        this.toy_id = toy_id;
        this.toy_name = toy_name;
        this.toy_quantity = toy_quantity;
        this.toy_price = toy_price;
    }
}