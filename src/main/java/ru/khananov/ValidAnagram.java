package ru.khananov;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "ac", t = "bb";

        System.out.println(new ValidAnagram().isAnagram(s, t));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] word1 = s.toCharArray();
        char[] word2 = t.toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);

        return Arrays.toString(word1).equals(Arrays.toString(word2));
    }
}
