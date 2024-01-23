/* Write a menu driven program for arithmetic operations
( addition, subtraction, multiplication & division)
for 2 integers using switch case.
The program will also ask the  user whether to continue or not
and print the default value as invalid choice. 
Use InputSTreamReader and BufferedReader */

import java.io.*;
class p4 {

    void add(double x, double y) {
        System.out.println(x + y);
    }

    void subtract(double x, double y) {
        System.out.println(x - y);
    }

    void multiply(double x, double y) {
        System.out.println(x * y);
    }

    void divide(double x, double y) {
        System.out.println(x / y);
    }

    void print_choices() {
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
    }

    public static void main(String args[])throws IOException {
        
        BufferedReader in = new BufferedReader
        (new InputStreamReader(System.in));

        p4 program = new p4();

        int choice = 0;

        while (choice != 5) {


            program.print_choices();
            System.out.println("\n");
            choice = Integer.parseInt(in.readLine());

            if (choice == 5) {
                break;
            }

            System.out.println("\n");

            System.out.print("Enter first operand: ");
            int op1 = Integer.parseInt(in.readLine());
            System.out.print("Enter second operand: ");
            int op2 = Integer.parseInt(in.readLine());

            switch (choice) {
                case 1:
                    program.add(op1, op2);
                    break;
                case 2:
                    program.subtract(op1, op2);
                    break;
                case 3:
                    program.multiply(op1, op2);
                    break;
                case 4:
                    program.divide(op1, op2);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}