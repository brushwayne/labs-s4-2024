import java.io.*;
class p11 {
    public static void main(String args[])throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int rows = 3;
        int columns = 3;

        int arr[][] = new int[3][3];

        System.out.println("Enter the elements (total 9): ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = Integer.parseInt(in.readLine());
            }
        }

        int sum_diagonal_left = 0;
        int sum_diagonal_right = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == j) {
                    sum_diagonal_left += arr[i][j];
                }

                if (i == columns - j - 1) {
                    sum_diagonal_right += arr[i][j];
                }
            }
        }   

        System.out.println("Left diagonal sum: " + sum_diagonal_left);
        System.out.println("Right diagonal sum: " + sum_diagonal_right);
    }
}
