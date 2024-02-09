class p1 {

    // this is a global variable; allocated in stack;
    // stays in the memory for the entire lifetime of program execution
    static int x = 5;
    
    public static void main(String args[]) {

        int y = 6;

        // main functions local variable

        {
            int z = 7;
            // this gets deallocated once thsi scope finishes
        }

        System.out.println(x);
        System.out.println(y);
        System.out.println(x);

    }
}