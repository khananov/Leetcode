package ru.khananov;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(
                new RansomNote().canConstruct("qwee", "rewqe")
        );
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> chars = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            chars.put(ransomNote.charAt(i), chars.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }

        for (int i = 0; i < magazine.length(); i++) {
            if (chars.containsKey(magazine.charAt(i))) {
                chars.put(magazine.charAt(i), chars.get(magazine.charAt(i)) - 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            if (entry.getValue() > 0) return false;
        }

        return true;
    }
}
