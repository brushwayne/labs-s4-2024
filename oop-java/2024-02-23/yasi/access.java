package yasi;

public class access {

    private int privateVar = 10; // Accessible only within access class

    int defaultVar = 20; // Accessible within the same package (yasi.access)

    protected int protectedVar = 30; // Accessible within the package and subclasses (in any package)

    public int publicVar = 40; // Accessible from anywhere

    public void displayAccess() {
        System.out.println("privateVar: " + privateVar); // Accessible
        System.out.println("defaultVar: " + defaultVar); // Accessible
        System.out.println("protectedVar: " + protectedVar); // Accessible
        System.out.println("publicVar: " + publicVar); // Accessible
    }
}

