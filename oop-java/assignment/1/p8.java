/*Implement a class BinToDec having data members binary. Include appropriate constructors
and the following methods
1) int findDecimal() is used to convert a binary to . decimal
2) int findSumDigits() is used to find the sum of digits..
Write an application class Demo where the functionality of BinToDec class is tested.*/

public class p8 {

    public static void main(String[] args) {
        BinToDec converter = new BinToDec("110101");

        int decimal = converter.findDecimal();
        int sumDigits = converter.findSumDigits();

        System.out.printf("Binary: %s\n", converter.binary);
        System.out.printf("Decimal equivalent: %d\n", decimal);
        System.out.printf("Sum of digits: %d\n", sumDigits);
    }
}

class BinToDec {

    String binary;

    BinToDec(String binary) {
        this.binary = binary;
    }

    int findDecimal() {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    int findSumDigits() {
        int sum = 0;
        for (char digit : binary.toCharArray()) {
            if (digit == '1') {
                sum++;
            }
        }
        return sum;
    }
}
