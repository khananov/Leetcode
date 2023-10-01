package ru.khananov;

public class ReverseWordInAStringIII {
    public static void main(String[] args) {
        System.out.println(new ReverseWordInAStringIII().reverseWords(
                "Let's take LeetCode contest"
        ));
    }

    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder reverseString = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            for (int j = strings[i].length() - 1; j >= 0; j--) {
                reverseString.append(strings[i].charAt(j));
            }
            if (i != strings.length - 1)
                reverseString.append(" ");
        }

        return reverseString.toString();
    }
}
