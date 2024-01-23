/* WAP in java which will accept N numbers 
from command line argument and will display
their sum, count odd, count even */

class p3 {
    public static void main(String args[]) {

        int sum = 0;

        int even_sum = 0;
        int odd_sum = 0;

        int count_even = 0;
        int count_odd = 0;

        int k;
        for (int i = 0; i < args.length; i++) {
            k = Integer.parseInt(args[i]);

            if (k % 2 == 0) {
                count_even++;
                even_sum += k;
            } else {
                count_odd++;
                odd_sum += k;
            }

            sum += k;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Even Sum: " + even_sum);
        System.out.println("Odd Sum: " + odd_sum);
        System.out.println("Even Count: " + count_even);
        System.out.println("Odd Count: " + count_odd);
    }
}