package day17_Loop;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        /*
        as user enter a number
        check number is lower than my guessed number -----> iy is loop loo
        check number is higher than my guessed number -------> it is too high
        if it's correct guess ----> end the loop and print "You guessed correctly"
         */
        Scanner input=new Scanner(System.in);
        int ourSecretNum=34;
        int guessNumber;



        do {
            System.out.println("Guess a number 1 - 100 to find what is in my mind");
            guessNumber = input.nextInt();

            if (guessNumber < ourSecretNum) {
                System.out.println("its too low");
            } else if (guessNumber > ourSecretNum) {
                System.out.println("its too high");
            }

        } while (guessNumber != ourSecretNum);
        System.out.println("You guessed the correct number which is " + ourSecretNum);


    }
}
