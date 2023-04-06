package day09_b_if_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
         // create a Scanner object
        Scanner input =new Scanner(System.in);

        System.out.println("What is your balance?");
        double balance = input.nextDouble();
        System.out.println ("How much do you want to withdraw?");
        double withdraw =input.nextDouble();
        balance= balance- withdraw ;
        // balance -= withdraw;

        System.out.println();
        System.out.println(" New balance is: "+ balance);

        if (balance< withdraw ) {
            System.out.println(" You can't withdraw");
            System.out.println();
            System.out.println(" New balance is:" + balance);
        } else{
            System.out.println(" Your new balance is:" + balance);


        }


    }
}
