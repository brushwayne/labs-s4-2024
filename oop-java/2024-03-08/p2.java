import java.io.*;

 class p2 {
   public static void main(String[] args)throws IOException {

        BufferedReader in = new BufferedReader
        (new InputStreamReader(System.in));

       System.out.print("Enter the value of x: ");
       int x = Integer.parseInt(in.readLine());

       System.out.print("Enter the value of y: ");
       int y = Integer.parseInt(in.readLine());

    try {
           double result = x / y;
           System.out.println("Result: " + result);

       } catch (ArithmeticException e) {
           System.out.println("Error: Cannot divide by zero.");
       } finally {
           System.out.print("Reached here finally");
       }
   }
}
