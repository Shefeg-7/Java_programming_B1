package day12_switch_statement;

import Day05_variables.School;

import java.util.Scanner;

public class Calculator {
    /*
    declare  and assign 2 number veriables
     */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter 1st number");
        double numOne= input.nextDouble();
        System.out.println("Select operator \n\t+\n\t-\n\t*\n\t?\n\t%\n\t Enter");
        String operator =input.next();
        System.out.println("Enter 2nd number:");

    }
}
