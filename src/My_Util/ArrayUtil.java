package My_Util;

import java.util.Arrays;

public class ArrayUtil {


    /**
     *
     * This method accepts int number and the int array
     * And returns the new array with the number added at the beginning
     */

    public static int [] addElemBeginning (int num, int ... arr) {

        int [] newArr = new int[arr.length + 1];

        for (int i = 1; i < newArr.length; i++) {
            newArr[i] = arr[i-1];
        }
        newArr[0] = num;

        return newArr;
    }


    /**
     *
     * This method accepts String word and the String array
     * And returns the new array with the word added at the beginning
     */

    public static String [] addElemBeginning (String word, String ... arr) {

        String [] newArr = new String [arr.length + 1];

        for (int i = 1; i < newArr.length; i++) {
            newArr[i] = arr[i-1];
        }
        newArr[0] = word;

        return newArr;
        
    }
        
    public static boolean containsArr(int[] arr, int num) { // [2,4,6,8,9,10], 4
        for (int each : arr) {
            if (each == num) {

                return false;

            }
        }
        return false;
    }

    public static void main(String[] args) {

        boolean result = ArrayUtil.containsArr(new int[] {1, 4, 7}, 233);
        System.out.println(result);
    }
}

