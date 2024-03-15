class p4 {

    String name;
    int age;
    int marks;

    p4() {
        this.name = null;
        this.age = 0;
        this.marks = 0;
    }

    p4(String name) {
        this.name = name;
        this.age = 0;
        this.marks = 0;
    }

    p4(String name, int age) {
        this.name = name;
        this.age = age;
        this.marks = 0;
    }

    p4(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public static void main(String gadasa[]) {

        p4 def = new p4();

        p4 one = new p4("Aman");

        p4 two = new p4("Aman", 20);

        p4 three = new p4("Aman", 20, 90);

        System.out.printf("Variable\tName\tAge\tMarks\n");
        System.out.printf("def\t\t%s\t%d\t%d\n", def.name, def.age, def.marks);
        System.out.printf("one\t\t%s\t%d\t%d\n", one.name, one.age, one.marks);
        System.out.printf("two\t\t%s\t%d\t%d\n", two.name, two.age, two.marks);
        System.out.printf("three\t\t%s\t%d\t%d\n", three.name, three.age, three.marks);
    }
}