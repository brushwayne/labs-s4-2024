import java.io.*;

class p1 {
    public static void main(String args[])throws IOException {
        kiitian k = new kiitian();
        k.course();
        k.get_input();
    }
}

abstract class student {
    int roll;
    int reg;
    String course;

    void get_input() { }

    void course()throws IOException { }
}

class kiitian extends student {

    @Override
    void course() throws IOException {
        BufferedReader in = new BufferedReader
        (new InputStreamReader(System.in));

        System.out.println("Enter the Roll: ");
        roll = Integer.parseInt(in.readLine());

        System.out.println("Enter the Reg: ");
        reg = Integer.parseInt(in.readLine());

        course = "B.Tech. (Computer Science & Engg)";
    }

    @Override
    void get_input() {
        System.out.printf("Roll: \t%d\n", roll);
        System.out.printf("Reg: \t%d\n", reg);
        System.out.printf("Course: \t%s\n", course);
    }
}