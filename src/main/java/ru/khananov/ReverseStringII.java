package ru.khananov;

public class ReverseStringII {
    public static void main(String[] args) {
        System.out.println(new ReverseStringII().reverseStr("abcdefg", 8));
    }

    public String reverseStr(String s, int k) {
        char[] str = s.toCharArray();

        for (int i = 0; i < s.length(); i += k * 2) {
            if (i + k <= s.length())
                reverseK(i, i + k - 1, str);
            else
                reverseK(i, s.length() - 1, str);
        }

        return new String(str);
    }

    public void reverseK(int i, int j, char[] str) {
        while (i < j) {
            char temp = str[j];
            str[j--] = str[i];
            str[i++] = temp;
        }
    }
}