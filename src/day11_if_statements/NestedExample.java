package day11_if_statements;
/*
 ask a number from user
 if number = between 1 and 10
 then check i it is even or odd
 else is not in the range
 */

import java.util.Scanner;

public class NestedExample {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number");
        int number= input.nextInt();
        if(number>= 1&& number <=10) {
            if (number % 2 == 0)
                System.out.println("Even");



            System.out.println("Odd");
        }else {
            System.out.println(" The number in the range");

        }



    }
}
