package day9_a_scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        /*
        Great a scanner object
         */
        Scanner input = new Scanner(System.in);
        // ask the user to enter 3 angle numbers
        System.out.println ("Enter 3 angle number");

        double degreeOne= input.nextDouble(),
                degreeTwo= input.nextDouble(),
                degreeThree=input.nextDouble();
        //for triangle  ----->  total degree of inner calculation is 180
        // Calculate what is the total of three numbers
        double total = degreeOne+ degreeTwo+ degreeThree;

        // write print statement that print if it is triangle
        System.out.println( " It is triangle:" + (total == 180));

        //write print statement that print if it is circle

        System.out.println("It is circle " + ( total == 360));
        System.out.println(" It is either triangle or circle ." + ( total==180 || total ==360 ));
    }

}
