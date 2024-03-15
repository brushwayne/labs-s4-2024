import java.io.*;

class p9 {
    public static void main(String args[])throws IOException {

        BufferedReader in = new BufferedReader
        (new InputStreamReader(System.in));

        System.out.print("Enter 1st String: ");
        String str1 = in.readLine();

        System.out.print("Enter 2nd String: ");
        String str2 = in.readLine();
        
        System.out.println("Joined: " + String.join(" ", str1, str2));

        System.out.println("Is Empty: " + str1.isEmpty());

        System.out.println("sequence to be replaced: ");
        String s = in.readLine();

        System.out.println("replacement sequence: ");
        String r = in.readLine();

        System.out.println("Replaced: " + str1.replace(s, r));

        System.out.println("Substring: " + str2.substring(3, 4));
    }
}
