package day11_if_statements;
/*
 /*
    1- English
    2-Spanish
    3-Turkish
    4- Russian
    5-French
    based on the number piked print a massage
     */


import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {



    Scanner input =new Scanner (System.in);
        System.out.println(" Enter a number on the language they wanted to use: /n/t1-English /n/t2 Spanish/n/t3- Turkish/n/t4 - Russian/n/t5 -French/n/nEnter number:");

        int languageNum = input.nextInt();
        if (languageNum ==1 ) {
            System.out.println(" Hello, thank you for the call");
        } else if (languageNum ==2) {
            System.out.println(" Hola, gracias por la llamada .");
        }else if ( languageNum==3) {
            System.out.println(" Privet, Spasibo za vash zvonok");
        }else if ( languageNum == 5) {
            System.out.printf("Mersi Bacu");
        }else{
            System.out.println("Invalid input");




        }
        }




}
