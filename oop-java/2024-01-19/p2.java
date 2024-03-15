/* WAP in java which will accept two integers 
from the command line argument
and will display the sum of two numbers. */

class p2 {
    public static void main(String args[]) {

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = x + y;

        System.out.println(z);
    }
}