class p6 {

    int x;
    int y;

    void add() {
        System.out.println(x + y);
    }

    void add(int x, int y) {
        System.out.println(x + y);
    }

    void add(int x, float y) {
        System.out.println(x + y);
    }

    void add(float x, int y) {
        System.out.println(x + y);
    }

    public static void main(String args[]) {
        
        p6 prog = new p6();

        int a = 5;
        float b = (float) 4.5;

        prog.x = 6;
        prog.y = 7;

        prog.add();
        prog.add(a, a);
        prog.add(a, b);
        prog.add(b, a);

    }
}