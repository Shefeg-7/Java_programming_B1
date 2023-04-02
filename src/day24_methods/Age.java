package day24_methods;

import java.util.Scanner;

public class Age {
    public static void calculateAge(int year){
        Scanner input=new Scanner(System.in);
        int currentYear=2023;
        int bornYear= 1972
        int yourAge= currentYear-bornYear;


    }
}
/*
    make a method that accepts a number / year
    and calculates how old you are
 */
public class Age {


    public static void calculateAge(int bornYear, int currentYear) {
        int yourAge = currentYear - bornYear;

        System.out.println("Method with TWO arguments: You are " + yourAge + " old!");

    }


    public static void main(String[] args) {


        // Extra just to show how methods accepts the parameters.
        String name = "Nigar";
        int index = name.indexOf('N');
        String part = name.substring(1, 4);
        String part2 = name.substring(2);
        int length = name.length();

        System.out.println("------------------");
        calculateAge(1960);
        calculateAge(1900, 2023);


    }
}




