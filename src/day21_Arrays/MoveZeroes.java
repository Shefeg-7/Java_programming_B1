package day21_Arrays;
import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {



/*
    Reverse Array
    Write a program that will reverse the order of any given array
    Ex: Input:
            [1, 2, 3, 4, 5]
    Output:
            [5, 4, 3, 2, 1]
            */


        int[] original = {0, 0, 5, 0, 1, 0};
        int[] changed = new int[original.length];
        int index = 0;
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(changed));


        System.out.println("---------------------");
        for (int i = 0; i < original.length; i++) {
            if (original[i] != 0) {

                changed[index] = original[i];
                index++;
            }
        }

        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(changed));

    }
    }