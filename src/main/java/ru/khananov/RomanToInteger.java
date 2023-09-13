package ru.khananov;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {

    }

    public int romanToInt(String s) {
        Map<Character, Integer> romanToArabicMap = new HashMap<>();
        romanToArabicMap.put('I', 1);
        romanToArabicMap.put('V', 5);
        romanToArabicMap.put('X', 10);
        romanToArabicMap.put('L', 50);
        romanToArabicMap.put('C', 100);
        romanToArabicMap.put('D', 500);
        romanToArabicMap.put('M', 1000);

        int result = 0;
        int previousValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanToArabicMap.get(s.charAt(i));

            if (currentValue < previousValue) result -= currentValue;
            else result += currentValue;

            previousValue = currentValue;
        }

        return result;
    }
}
