package day23_Multidimensional;

import java.util.Arrays;

public class ArrayRecap {
    public static void main(String[] args) {

        System.out.println("-------------------");
        String [] words = {"java", "sql", "api", "softskills"};
        System.out.println("Before sorting: " + Arrays.toString(words));

        Arrays.sort(words);
        System.out.println("After sorting: " + Arrays.toString(words));


        System.out.println("-------------------");
        String afterJoin = String.join("^^^", words);
        System.out.println("After join: " + afterJoin);

        System.out.println("-------------------");
        String sentence = "java, sql, api, softskills";
        String [] sentArr = sentence.split("sql"); //
        System.out.println(Arrays.toString(sentArr));

        System.out.println("-------------------");
        String sentenceTwo = "Hello Loopers";
        String upper = sentenceTwo.toUpperCase();
        char [] chars = sentenceTwo.toCharArray();
        System.out.println(Arrays.toString(chars));

        for (char each : chars) {
            System.out.print(("" + each).toUpperCase());
        }
    }
}
