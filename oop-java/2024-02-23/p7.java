import java.io.*;
public class p7 {
    public static void main(String args[])throws IOException {
        Head h = new Head();
        h.getDetails();
        h.getDeptDetails();

        System.out.printf("Employee ID: \t%d\n", h.Empid);
        System.out.printf("Employee name: \t%s\n", h.Ename);
        System.out.printf("Department ID: \t%d\n", h.Deptid);
        System.out.printf("Department name: \t%s\n", h.Deptname);
    }
}

interface Employee {
    void getDetails()throws IOException;
}

interface Manager extends Employee {
    void getDeptDetails()throws IOException;
}

class Head implements Manager{
    int Empid;
    String Ename;

    int Deptid;
    String Deptname;

    @Override
    public void getDetails()throws IOException {

        BufferedReader in = new BufferedReader
        (new InputStreamReader(System.in));

        System.out.print("Enter Employee ID: ");
        Empid = Integer.parseInt(in.readLine());

        System.out.print("Enter Employee name: ");
        Ename = in.readLine();
    }

    @Override
    public void getDeptDetails() throws IOException {
        BufferedReader in = new BufferedReader
        (new InputStreamReader(System.in));

        System.out.print("Enter Department ID: ");
        Deptid = Integer.parseInt(in.readLine());

        System.out.print("Enter Department name: ");
        Deptname = in.readLine();
    }
}

