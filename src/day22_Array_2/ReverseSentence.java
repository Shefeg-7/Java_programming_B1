package day22_Array_2;

public class ReverseSentence {
    public static void main(String[] args) {     String sentence = "Today is Wednesday and we learned some useful methods";
        //                 methods useful some learned we and Wednesday is Today

        String [] words = sentence.split(" ");
     //   System.out.println(Arrays.toString(words));

        String reversed = "";

        for (int i = words.length-1; i >= 0 ; i--) {
            reversed += words[i] + " ";
        }

        System.out.println(reversed.trim());



    }
}
