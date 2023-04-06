package day25_methods;

import My_Util.StringUtil;

public class UniqueCharacters {
    public static String uniqueCharacters (String str){

            String checked = "";
            String unique = "";

            for (int i = 0; i < str.length(); i++) {  // a a.... b c .... d

                if (!checked.contains(str.charAt(i)+"")){   // checked  = "";

                    int count = StringUtil.frequencyOfCharacter(str, str.charAt(i));
                    // "aaaaabcccdeeff", 'd' | 1

                    checked += str.charAt(i);  // checked = "abcd";

                    if (count == 1) {
                        unique += str.charAt(i);  //uniqiue = "bd";
                    }

                }

            }

            return unique;

        }
    }

