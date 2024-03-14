import java.io.*;

public class p6 {

    public static void main(String[] args) {

        try (FileReader reader = new FileReader("bar.txt")) {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (IOException e) {
            System.out.println("Error: IO Exception!");
        } finally {
            System.out.println("\nFile reading completed (or failed).");
        }
    }
}
