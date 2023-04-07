package My_Util;

import java.util.Arrays;

public class ArrayUtil {


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

