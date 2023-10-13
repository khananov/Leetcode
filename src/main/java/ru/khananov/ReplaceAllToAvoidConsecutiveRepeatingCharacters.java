package ru.khananov;

public class ReplaceAllToAvoidConsecutiveRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(
                new ReplaceAllToAvoidConsecutiveRepeatingCharacters().modifyString("??yw?ipkj?"));
    }

    public String modifyString(String s) {
        char[] chars = s.toCharArray();
        char tempLetter = 'a';

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '?') {
                while (i - 1 >= 0 && chars[i-1] == tempLetter ||
                        i + 1 < chars.length && chars[i+1] == tempLetter) {
                    tempLetter++;
                }
                chars[i] = tempLetter;
                tempLetter = 'a';
            }
        }
        return new String(chars);
    }
}
