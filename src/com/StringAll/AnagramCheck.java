package com.StringAll;


import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "hah";
        String s2 = "aah";
        boolean ans = anagramCheckOfTwoString(s1, s2);
        if (ans) {
            System.out.println("They Are Anagram to Each Other");
        } else {
            System.out.println("They Are Not Anagram To Each Other");
        }

    }

    private static boolean anagramCheckOfTwoString(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 != n2) {
            return false;
        }

        char first[] = s1.toCharArray();
        char second[] = s2.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        boolean isChek = false;
        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }



        return true;
    }

}
