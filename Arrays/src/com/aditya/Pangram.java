package com.aditya;

import java.util.*;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "tplnzrkatrol";
        System.out.println(checkIfPangram(sentence));
    }



    public static boolean checkIfPangram(String sentence) {
        char[] charArray = sentence.toCharArray();
        Arrays.sort(charArray);
        char a = 'a';
        int count = 1;
        int i = 0;
        while (i < charArray.length && charArray[i] == a) {
            i++;
            while (i < charArray.length && charArray[i] != a) {
                a++;
                count++;
            }
        }
        return (count == 26);

//        for (int i = 0; i < charArray.length - 1; i++) {
//            if (charArray[i] == charArray[i + 1]) {
//                return false;
//            }
//        }
//        return true;
    }
}
