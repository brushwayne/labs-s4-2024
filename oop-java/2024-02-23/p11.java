class p11 {
    public static void main(String args[]) {
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic = oc.new InnerClass();
        
        System.out.println(oc.var);
        System.out.println(ic.var);

        oc.printInfo();
        ic.printInfo();
    
    } 
}

class OuterClass {
    int var = 5;
    
    void printInfo() {
        System.out.println("I am Outer class");
    }
    class InnerClass {
        int var = 10;

        void printInfo() {
            System.out.println("I am Inner class");
        }
    }
}