package day17_Loop;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int max=0;
        int min=9999999;
        int count=1;
        while(count<=5);
        System.out.println("Enter a number");
        int num= input.nextInt();

//        int max = 0;                // int max = -279....... ;
//        int min = 9999999;        // int min =  279....... ;


//        int max = Integer.MIN_VALUE;                // int max = -279....... ;
//        int min = Integer.MAX_VALUE;                // int min =  279....... ;

        int max = -2147483648;                // int max = -279....... ;
        int min = 2147483647;                // int min =  279....... ;


        System.out.println(max);
        System.out.println(min);


    }
}
