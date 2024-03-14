import java.io.*;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class p7 {

    public static int ProcessInput(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Number cannot be negative.");
        }
        return number * 2;
    }

    public static void main(String[] args)throws IOException {
        
        BufferedReader in = new BufferedReader
        (new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(in.readLine());

        try {
            int y = ProcessInput(number);
            System.out.println("Doubled number: " + y);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
