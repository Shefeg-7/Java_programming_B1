package day9_a_scanner;

import java.util.Scanner;

public class UsingNext {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);

        System.out.println(" Today is Saturday");

        System.out.println(" What is today's class?");

         String className= input.next();

        System.out.println();

        System.out.println(" What month is it");

        System.out.println(input.next());

        System.out.println(" I like " + input.next() + "month ");
        System.out.println();

        input.nextLine();

        System.out.println(" Enter your full name:");

        String fullName = input.nextLine();

        System.out.println(" Full name is "+ fullName);
    }
}
