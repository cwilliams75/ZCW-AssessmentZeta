package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        Integer count = 0;
        String toCheck = "";
        for (int i = 0; i<= input.length(); i++) {
        for (int j = i+1; j<= input.length(); j++) {
            toCheck = input.substring(i,j);
            String reverse = new StringBuilder(toCheck).reverse().toString();
            if (toCheck.equals(reverse)) {
                count++;
            }
        }
        }
        return count;
    }
}
