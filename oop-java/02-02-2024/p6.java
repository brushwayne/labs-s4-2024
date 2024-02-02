import java.io.*;
class p6 {
    public static void main(String args[])throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the day number: ");
        int day = Integer.parseInt(in.readLine());
        
        if (day > 31 || day < 1) System.out.println("Invalid");

        int week = day / 7;
        int week_day = day / 7 == 0 ? day : day % 7;

        System.out.println("Week number is 3");

        switch (week_day) {

            case 0:
                System.out.println("Saturday");
                break;

            case 1:
                System.out.println("Sunday");
                break;
            
            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;
        }
    }
}
