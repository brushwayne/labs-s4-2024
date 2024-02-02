import java.io.*;
class p10 {
    public static void main(String args[])throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number of rows: ");
        int rows = Integer.parseInt(in.readLine());

        System.out.print("Enter number of columns: ");
        int columns = Integer.parseInt(in.readLine());

        int arr[][] = new int[rows][columns];

        System.out.println("Enter the elements: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = Integer.parseInt(in.readLine());
            }
        }

        System.out.println("Matrix format: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("  " + arr[i][j] + "  ");
            }
            System.out.println();
        }   
    }
}
