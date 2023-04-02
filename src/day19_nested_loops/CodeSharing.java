package day19_nested_loops;

public class CodeSharing {
    public static void main(String[] args) {

    }

    String word = "applea";
    String unique = "";


        for(
    int i = (0; i<word.length(); i++){



        int count = 0;
        char letter = word.charAt(i);

        if (unique.contains("" + letter)) {
            continue;
        }

        for (int j = 0; j < word.length(); j++) {

            char each = word.charAt(j);

            if (letter == each) {
                count++;
            }

        }

        System.out.println(letter + " - " + count);
        unique += letter;
    }
}
