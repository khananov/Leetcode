package ru.khananov;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        System.out.println(new ExcelSheetColumnNumber().titleToNumber("AC"));
    }

    public int titleToNumber(String columnTitle) {
        int column = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            column += (int) (Math.pow(26, columnTitle.length() - 1 - i) *
                    (columnTitle.charAt(i) - 64));
        }

        return column;
    }
}
