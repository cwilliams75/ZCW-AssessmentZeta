package com.zipcodewilmington.assessment1.part1;

import com.zipcodewilmington.assessment1.part2.StringUtils;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
       String result = str;
       result = result.substring(0,1).toUpperCase() + result.substring((1)).toLowerCase();
        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String result = str;
        StringBuffer buffer = new StringBuffer(str);
        result = buffer.reverse().toString();
        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String result = str;
        StringBuffer buffer = new StringBuffer(str);
        result = buffer.reverse().toString();
        result = result.substring(0,1).toUpperCase() + result.substring((1)).toLowerCase();
        return result;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String result = str;
        result = result.substring(1,14);
        return result;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++){
            chars[i] = Character.isUpperCase(chars[i])
                    ? Character.toLowerCase(chars[i])
                    : Character.toUpperCase(chars[i]);
        }

        return new String(chars);
    }
}
