package ru.khananov;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {
        int maxSubstring = 0;
        int countSubstring = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] chars = new int[128];
            for (int j = i; j < s.length(); j++) {
                if (chars[s.charAt(j)] == 1) break;
                chars[s.charAt(j)] = 1;
                countSubstring++;
            }

            maxSubstring = countSubstring > maxSubstring ? countSubstring : maxSubstring;
        }

        return maxSubstring;
    }
}
