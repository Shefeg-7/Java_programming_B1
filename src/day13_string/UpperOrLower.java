package day13_string;

import java.util.Scanner;

public class UpperOrLower {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the letter");

    // lower cage range ----> 97-122
        //upper case range -----> 65-90
        if (letter >= 97 && <=122){
            System.out.println("Your entered letter:" + letter+ "\nYour converted letter:"+(char) (letter-32));
        } else if (letter >= 65 && letter <= 90) {
        }
}         char letter = 'A';  //  -- > 97
      System.out.println("You entered letter: " + letter +"\nYour converted letter: " + (char)(letter + 32));


    }
