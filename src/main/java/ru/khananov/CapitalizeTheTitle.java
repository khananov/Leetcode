package ru.khananov;

public class CapitalizeTheTitle {
    public static void main(String[] args) {
        System.out.println(new CapitalizeTheTitle().capitalizeTitle("L hV"));
    }

    public String capitalizeTitle(String title) {
        int countLetter = 0;
        char[] chars = title.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                if (countLetter > 2) {
                    chars[i + 1] = Character.toUpperCase(chars[i + 1]);
                }
                countLetter = 0;
            } else if (i - 1 < 0) {
                if (countLetter >= 2) {
                    chars[i] = Character.toUpperCase(chars[i]);
                } else {
                    chars[i] = Character.toLowerCase(chars[i]);
                }
            } else {
                countLetter++;
                chars[i] = Character.toLowerCase(chars[i]);
            }

        }

        return new String(chars);
    }
}
