import java.util.Scanner;

class p7 {

    int m1, m2, m3;
    char g1, g2, g3;

    char get_grade(int marks) {
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

        return grade;
    }

    void get_marks() {

        Scanner sc = new Scanner(System.in);

        p7 program = new p7();

        System.out.println("Enter the Marks for subject 1: ");
        m1 = sc.nextInt();
        g1 = program.get_grade(m1);

        System.out.println("Enter the Marks for subject 2: ");
        m2 = sc.nextInt();
        g2 = program.get_grade(m2);

        System.out.println("Enter the Marks for subject 3: ");
        m3 = sc.nextInt();
        g3 = program.get_grade(m3);

    }

    void display() {
        System.out.println("Marks\tGrade");
        System.out.println(m1 + "\t" + g1);
        System.out.println(m2 + "\t" + g2);
        System.out.println(m3 + "\t" + g3);
    }

    public static void main(String args[]) {

        p7 program = new p7();

        program.get_marks();
        program.display();

    }
}