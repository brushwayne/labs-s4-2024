class p3 {

    String name;
    String batch;
    int roll;
    static String college = "KIIT";

    p3 (String name, String batch, int roll) {
        this.name = name;
        this.batch = batch;
        this.roll = roll;
    }

    public static void main(String args[]) {

        p3 stud1 = new p3("Aman Pathak", "CSE-42", 22051662);
        p3 stud2 = new p3("Kavya Tiwari", "CSE-35", 22051225);

        System.out.println("Name\t\tBatch\tRoll\t\tUniversity");
        System.out.println(stud1.name +"\t" + stud1.batch + "\t" + stud1.roll + "\t" + stud1.college);
        System.out.println(stud2.name +"\t" + stud2.batch + "\t" + stud2.roll + "\t" + stud2.college);

        college = "DTU";

        System.out.println("\nAfter Changing the Static var college\n");

        System.out.println("Name\t\tBatch\tRoll\t\tUniversity");
        System.out.println(stud1.name +"\t" + stud1.batch + "\t" + stud1.roll + "\t" + stud1.college);
        System.out.println(stud2.name +"\t" + stud2.batch + "\t" + stud2.roll + "\t" + stud2.college);
    }
}