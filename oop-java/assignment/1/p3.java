/*Write a program in java to create a class Account having data members Bank Name,Account
ID,Account Name,Balance and password, it contains member functions Get_Account_Details()--to
input account details, Display()-- to display account details, With_Draw()-to withdraw money from the
account, Deposit()-to deposit money into the account, Validate_password()--to check 4 digit user
entered password is valid or not for withdraw or deposit money into his/her account.Create object of
the Account class and access all the functions of the class through it.*/

import java.io.*;

class p3 {
    public static void main(String args[])throws IOException {
    
        Account a = new Account();

        a.get_account_details();
        a.display();
        a.withdraw();
    }
}

class Account {
    String bank_name;
    String account_name;
    String password;
    int account_id;
    int balance;

    Account() {

    }

    Account(String bank_name, String account_name, int account_id, int balance, String password) {
        this.bank_name = bank_name;
        this.account_name = account_name;
        this.account_id = account_id;
        this.balance = balance;
        this.password = password;
    }

    void get_account_details()throws IOException {

        BufferedReader in = new BufferedReader
        (new InputStreamReader(System.in));

        System.out.printf("Enter Bank name: \t");
        bank_name = in.readLine();

        System.out.printf("Enter Account name: \t");
        account_name = in.readLine();

        System.out.printf("Enter Account id: \t");
        account_id = Integer.parseInt(in.readLine());

        System.out.printf("Enter Balance: \t");
        balance = Integer.parseInt(in.readLine());

        System.out.printf("Enter Password: \t");
        password = in.readLine();
    }

    void display() {
        System.out.printf("BankName\tAccountName\tAccountId\tBalance\n");
        System.out.printf("%s\t%s\t%d\t%d\n", this.bank_name, this.account_name, this.account_id, this.balance);
    }

    boolean validate_password(String password) {
        return password.equals(this.password);
    }   

    int withdraw()throws IOException {

        BufferedReader in = new BufferedReader
        (new InputStreamReader(System.in));

        System.out.printf("Enter Password: \t");

        if (!validate_password(in.readLine())) {
            System.out.printf("Invalid Password\n");
            return 1;
        }

        System.out.printf("Enter Withdraw Amount: ");
        int withdraw_amount = Integer.parseInt(in.readLine());

        if (withdraw_amount > balance) {
            System.out.printf("Insufficient funds!");
            return 1;
        }

        this.balance -= withdraw_amount;
        System.out.printf("Dispensed RS. %d\n", withdraw_amount);
        System.out.printf("Remaining Rs. %d\n", balance);

        return 0;
    } 
}