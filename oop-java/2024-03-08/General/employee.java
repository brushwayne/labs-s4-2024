package General;

import java.io.*;

public class employee {
    protected int empid;
    private String ename;
    protected int basic;
    protected double earning;

    public void earning() {
        earning =  basic + 0.8 * basic + 0.15 * basic;
    }

    public void getInput()throws IOException {

        BufferedReader in = new BufferedReader
        (new InputStreamReader(System.in));
        
        System.out.println("Enter The name: ");
        ename = in.readLine();

        System.out.println("Enter the Emp ID: ");
        empid = Integer.parseInt(in.readLine());

        System.out.println("Enter the Basic: ");
        basic = Integer.parseInt(in.readLine());
    }

    public void display() {
        System.out.println("Emp ID: " + empid);
        System.out.println("Total earning: " + earning);
    }
}