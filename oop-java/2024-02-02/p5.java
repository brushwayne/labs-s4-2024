import java.io.*;
class p5 {
    public static void main(String args[])throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the Marks: ");
        int marks = Integer.parseInt(in.readLine());
        
        char grade = '\u0000';

        if (marks >= 0 && marks < 40) {
            grade = 'F';
        } else if (marks >= 40 && marks < 50) {
            grade = 'E';
        } else if (marks >= 50 && marks < 60) {
            grade = 'D';
        } else if (marks >= 60 && marks < 70) {
            grade = 'C';
        } else if (marks >= 70 && marks < 80) {
            grade = 'B';
        } else if (marks >= 80 && marks < 90) {
            grade = 'A';
        } else if (marks >= 90 && marks <= 100) {
            grade = 'O';
        }

        System.out.println("Grade for " + marks + " marks is " + grade);
    }
}
