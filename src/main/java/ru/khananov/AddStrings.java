package ru.khananov;

public class AddStrings {
    public static void main(String[] args) {
    }

    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int tens = 0;
        int indexNum1 = num1.length() - 1;
        int indexNum2 = num2.length() - 1;

        while (indexNum1 >= 0 || indexNum2 >= 0 || tens != 0) {
            int digit1 = indexNum1 < 0 ? 0 : Character.getNumericValue(num1.charAt(indexNum1));
            int digit2 = indexNum2 < 0 ? 0 : Character.getNumericValue(num2.charAt(indexNum2));
            int sum = digit1 + digit2 + tens;

            tens = sum / 10;
            result.insert(0, sum % 10);

            indexNum1--;
            indexNum2--;
        }

        return result.toString();
    }
}
