/* Why Interface data members are by default static final and member functions are public in
java.Write a program in java for a Company XYZ which have two types of employees-
Technical and Non- technical each have unique employee ID. But only the non-technical staff
get bonus on the eve of Diwali. Given an interface with three methods as earning(), deduction()
and bonus(), write a class for Non-technical using class Technical and the above interface to
calculate the total earning of each non-technical staff for the user entered basic salary amount */

import java.io.*;

class p4 {
    public static void main(String args[])throws IOException {
        NonTechnical emp_nt = new NonTechnical(22051662, 400_000);
        Technical emp_t = new Technical(22051778, 200_000);

        System.out.printf("Earning: \t%f\n", emp_nt.earning());
        System.out.printf("Deduction: \t%f\n", emp_nt.deduction());
        System.out.printf("Bonus: \t\t%f\n", emp_nt.bonus());

        System.out.printf("Earning: \t%f\n", emp_t.earning());
        System.out.printf("Deduction: \t%f\n", emp_t.deduction());
        System.out.printf("Bonus: \t\t%f\n", emp_t.bonus());
    }
}

interface Utility {
    double earning();
    double deduction();
    double bonus();
}

class Technical implements Utility {
    int employee_id;
    double basic;

    Technical(int employee_id, double basic) {
        this.employee_id = employee_id;
        this.basic = basic;
    }

    public double earning() {
        return basic;
    }

    public double deduction() {
        return basic * 0.01;
    }

    public double bonus() {
        return 0;
    }
}

class NonTechnical extends Technical {

    NonTechnical(int employee_id, double basic) {
        super(employee_id, basic);
    }

    public double bonus() {
        return basic * 0.1;
    }
}
