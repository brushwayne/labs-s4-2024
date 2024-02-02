class p1 {

    String name;
    String batch;
    int roll;

    p1 (String name, String batch, int roll) {
        this.name = name;
        this.batch = batch;
        this.roll = roll;
    }

    public static void main(String args[]) {

        p1 stud1 = new p1("Aman Pathak", "CSE-42", 22051662);
        p1 stud2 = new p1("Kavya Tiwari", "CSE-35", 22051225);

        System.out.println("Name\t\tBatch\tRoll");
        System.out.println(stud1.name +"\t" + stud1.batch + "\t" + stud1.roll);
        System.out.println(stud2.name +"\t" + stud2.batch + "\t" + stud2.roll);
    }
}