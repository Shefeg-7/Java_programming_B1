package day22_Array_2;

import java.util.Arrays;
import java.util.Scanner;

public class SplitExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String days = "monday, tuesday, wednesday, thursday, friday, wednesday, saturday, sunday";

        // .split(" ay")

        int countWords = 0;
        for (
                int i = 0; i < days.length(); i++) {
            if (days.charAt(i) == ',') {
                countWords++;
            }
        }
        System.out.println("Total words: " + (countWords + 1));

        String[] dayArr = days.split(",");
        System.out.println(Arrays.toString(dayArr));

        String[] dayArr1 = days.split(", ");
        System.out.println(Arrays.toString(dayArr1));

        String[] dayArr2 = days.split(" ");
        System.out.println(Arrays.toString(dayArr2));

        System.out.println("--------------");
        String[] dayArr3 = days.split("ay ");
        System.out.println(Arrays.toString(dayArr3));
        System.out.println(dayArr3.length);  // 1
        System.out.println("--------------");


        String[] dayArr4 = days.split("wednesday");
        System.out.println(dayArr3.length);  //
        System.out.println(Arrays.toString(dayArr4));


        System.out.println("-----------------------------");
        String[] dayArr5 = days.split("");
        System.out.println(Arrays.toString(dayArr5));


        String month = "jan-feb-mar-apr-may-jun-july-aug-sep-oct-nov-dec";
    /*
        can you guy print each month
     */
        String[] monthArr = month.split("-");

                for ( String eachMonth : monthArr) {
            System.out.println(eachMonth.substring(0, 1).toUpperCase() + eachMonth.substring(1));  // Can you print it first letter of each upper case and rest lower case


            // Mystic Creature
            //  CharArray.java
            String[] letters = {"l", "o", "o", "p"};
            System.out.println(Arrays.toString(letters));


            String word = "loop";
            // toCharArray();
            char[] convertedWord = word.toCharArray();   // ['l', 'o', 'o', 'p']
            System.out.println(Arrays.toString(convertedWord));
            System.out.println(convertedWord[0]);
            System.out.println(convertedWord[1]);
            System.out.println(convertedWord[2]);
            System.out.println(convertedWord[3]);

            System.out.println("-----");
            for (char eachCharacter : convertedWord) {
                System.out.println(eachCharacter);
            }


            String days1= "Monday - Sunday";
            //             012345.........
            char[] allLetters = days.toCharArray();
            System.out.println(allLetters[6]);
            System.out.println(Arrays.toString(allLetters));


        }
    }
}


