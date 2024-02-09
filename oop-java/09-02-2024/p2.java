class p2 {
    
    public static void main(String args[]) {

        int x = 5;

        int y = x & 1;

        System.out.println(y);
        System.out.printf("%d is even if %d is 0 else odd\n", x, y);

        int z = 1000;
        z = z >> 1;
        System.out.printf("%d was divided using right shift\n", z);

        // this is a use of ternary operator
        String str = (1== 0) ? "One is equal to zero." : "One is not equal to zero";
        System.out.println(str);
    }
}