class p4 {

    static {
        System.out.println("This will be printed oonly once; i.e. while runtime");
    }

    p4() {
        System.out.println("This will be executed everytime an object is created");
    }

    public static void main(String args[]) {
        p4 obj1 = new p4();
        p4 obj2 = new p4();
    }
}