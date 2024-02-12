/*Design an class PersonalLoan having data member principal, years and rate and a method
float find_Simple_Interrest(). Two banks Bank1 and Bank2 are derived from PersonalLoan to
offer loan to their customers and each bank has its own interest rate( 10% for Bank1 and 15%
for Bank2). Write down the necessary java code to exhibit run time polymorphism.*/

public class p7 {
    public static void main(String[] args) {
        PersonalLoan loan1 = new Bank1(10000, 2);
        PersonalLoan loan2 = new Bank2(5000, 3);

        System.out.println("SI for Bank1: " + loan1.find_Simple_Interest());
        System.out.println("SI for Bank2: " + loan2.find_Simple_Interest());
    }
}

class PersonalLoan {
    double principal;
    int years;
    double rate;

    public PersonalLoan(double principal, int years, double rate) {
        this.principal = principal;
        this.years = years;
        this.rate = rate;
    }

    public double find_Simple_Interest() {
        return (principal * rate * years) / 100;
    }
}

class Bank1 extends PersonalLoan {
    public Bank1(double principal, int years) {
        super(principal, years, 10.0);
    }
}

class Bank2 extends PersonalLoan {
    public Bank2(double principal, int years) {
        super(principal, years, 15.0);
    }
}


