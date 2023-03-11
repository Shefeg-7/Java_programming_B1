package day09_b_if_statements;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {


        int result = 67;
        int passRate = 65;
        Scanner input = new Scanner(System.in);
        if (result >= passRate) {
            System.out.println(" Passed Java quiz . Feyruzis happy.");
        } else {
            System.out.println(" Feyruz is crying");
        }


    }



}
