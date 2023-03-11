package day12_switch_statement;

import java.util.Scanner;

public class MaleOrFamale {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char letter = 'h';

        switch (letter) {

            case 'm':
            case 'M':
                System.out.println("Male restroom");
                break;

            case 'f':
            case 'F':
                System.out.println("Female restroom");
                break;

            default:
                System.out.println("Invalid letter");

        }

    }

}
