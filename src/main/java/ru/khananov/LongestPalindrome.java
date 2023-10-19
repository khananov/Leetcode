package ru.khananov;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(new LongestPalindrome().longestPalindrome("abccccdd"));
    }

    public int longestPalindrome(String s) {
        int[] chars = new int[128];
        int maxLength = 0;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i)]++;
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 1) maxLength++;
        }

        return maxLength;
    }
}
