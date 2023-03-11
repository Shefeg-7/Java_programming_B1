package day09_b_if_statements;

import java.util.Scanner;

public class Single_if_with_scanner {
    public static void main(String[] args) {
        // creat a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.println(" Why are we studying Java");
        String answer = input.nextLine();
        System.out.println(" I Java fun (true or false) ? ");

        boolean answer2 = input.nextBoolean();

        if (answer2) {
            System.out.println(" Feyruz is really happy");



        }
    }

}
