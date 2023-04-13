package My_Util;

public class StringUtil {
    /*
    reverse
    crate a method that will accept a String and return the reversed String
    This method made by Loopcamp Batch#1
     */
    public static String reverseStr(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    /**
     * This method made by Loopcamp Batch#1
     * This method accepts a String parameter and puts it in a format
     * Ex:
     * The format will be like this
     * <p>
     * First letter is in upper case and rest is in lower case
     * <p>
     * Then return a String in a formatted way.
     */
    public static String fixFormat(String str) { // feyruz  -- F
        String fixed = str.trim();
        fixed = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        return fixed;



    }
    public static int frequencyOfCharacter (String str,char ch){
        // "aabbaacca", 'a'
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;

    }

    /**
     * This method accepts String
     * And returns only unique characters as a String
     */
    public static String uniqueCharacters (String str) {
        String checked = "";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            if (!checked.contains(str.charAt(i)+"")){
                int count = StringUtil.frequencyOfCharacter(str, str.charAt(i));
                checked += str.charAt(i);

                if (count == 1) {
                    unique += str.charAt(i);
                }
            }
        }
        return unique;
    }


}
//... (2 lines left)







