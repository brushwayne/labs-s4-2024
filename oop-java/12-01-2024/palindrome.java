public class plaindrome {
    public static void main(String pathak[]) {
        int x = 12345;
        int n = 0;

        while (x != 0) { n = n * 10 + x % 10; x /= 10; }
        System.out.println(n);
    }
}
