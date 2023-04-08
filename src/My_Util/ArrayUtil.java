package My_Util;

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
}
