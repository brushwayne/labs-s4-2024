public class p5 {

    public static void main(String[] args) {
        int result = 0;

        try {
            result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        }

        try {
            String number = "hello";
            int convertedNumber = Integer.parseInt(number);
            result += convertedNumber;
        } catch (NumberFormatException e) {
            System.out.println("Error: Could not convert string to integer!");
        }

        System.out.println("Result: " + result);
    }
}
