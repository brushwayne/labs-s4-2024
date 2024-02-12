/*Use of final keyword with respect to variable, class and methods(). Write a program for the same*/

class p2 {
    public static void main(String args[]) {

        final int count = 3;

        Constants constant = new Constants();
        Utility utility = new Utility();
        
        for (int i = 0; i < count; i++) {
            System.out.printf("%d ", Utility.add(i, 2));
        }
        System.out.printf("\npi: %f, e: %f", constant.pi, constant.e);
    }
}

final class Constants {
    double pi = 3.141;
    double e = 2.718;
}

final class Utility {
    public static int add(int a, int b) {
        return a + b;
    }
}