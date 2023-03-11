package day11_if_statements;

import java.util.Scanner;

/*
     if the number is divisible by 3 print -> Fizz
     if the number is divisible by 5 print -> Buzz

      if the number divisible by both 3 and 5 -> FizzBuzz
      if the number is not divisible by any of those ,print just the number
 */

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number" );
        int number = input.nextInt();
        if (number % 3 ==0){
             System.out.println("Fizz");
             if (number % 5 ==0){
                 System.out.println("Buzz");
                 if(number % 3 == 0 && number % 5 == 0){
                     System.out.println("FuzzBuzz");
                 }

             }

        }





    }
}
