public class p6 {
    public static void main(String args[]) {
        substaff s = new substaff(50000.0);
        s.earning();
        s.deductions();
        s.bonus();

        System.out.println(s.earning);
        System.out.println(s.deductions);
        System.out.println(s.bonus);
    }
}

interface Utils {
    void earning();
    void deductions();
    void bonus();
}

class Manager implements Utils {
    double earning;
    double bonus;
    double deductions;

    double basic;
    double pf;

    Manager(double basic) {
        this.basic = basic;
    }

    @Override
    public void earning() {
        earning = basic + 0.8 * basic + 0.15 * basic;
    }

    @Override
    public void deductions() {
        pf = 0.12 * basic;
        deductions = pf;
    }

    @Override
    public void bonus() { }
}

class substaff extends Manager {

    substaff(double basic) {
        super(basic);
    }

    @Override
    public void bonus() {
        bonus = 0.5 * basic;
    }   
}