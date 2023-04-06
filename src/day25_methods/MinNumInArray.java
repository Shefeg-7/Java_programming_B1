package day25_methods;

import java.util.Arrays;

public class MinNumInArray {
    public static int minNumINArr(int[] arr) {


        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;

    }
    public static int minNumInArrWithSort ( int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
}