import java.io.*;

class p8 {

    static String toUpperCase(String s) {
        return s.toUpperCase();
    }

    static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    static void isEqual(String s, String r) {
        if (s.equals(r)) System.out.println("Equal Strings with case");
    }

    static void isEqualIgnoreCase(String s, String r) {
        if (s.equalsIgnoreCase(r)) System.out.println("Equal Strings with case");
    }

    static void positions(String s, char c) {
        System.out.printf("%s in %s at positions: ", c, s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                System.out.printf("%s ", i);
            }
        } System.out.println();
    }

    static boolean palindrome(String s) {
        boolean flag = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                flag = false;
            }
        }
        return flag;
    }

    static void counter(String s) {
        int words = 0, vowels = 0, consonants = 0;

        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }

            else if (c == ' ') {
                words++;
            }

            else if (((int) c) < 123 && ((int) c) > 64) {
                consonants++;
            }
        }

        System.out.printf("Words: \t%d\n", words + 1);
        System.out.printf("Vowels: \t%d\n", vowels);
        System.out.printf("Consonants: \t%d\n", consonants);
    }

    public static void main(String args[])throws IOException {

        BufferedReader in = new BufferedReader
        (new InputStreamReader(System.in));

        System.out.print("Enter 1st String: ");
        String str1 = in.readLine();

        System.out.print("Enter 2nd String: ");
        String str2 = in.readLine();

        System.out.printf("Uppercase: \t%s\n", toUpperCase(str1));
        System.out.printf("Lowercase: \t%s\n", toLowerCase(str1));

    
        System.out.println("Enter a Character: ");
        char chr = (char) in.read();
        positions(str1, chr);
        positions(str2, chr);

        if (palindrome(str1)) System.out.printf("%s is palindrome\n", str1);

        counter(str2);
    }
}