package ru.khananov;

public class PalindromeNumber {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int reverseNum = 0;
        int tempX = x;

        while (tempX != 0) {
            reverseNum = reverseNum * 10 + (tempX % 10);
            tempX /= 10;
        }

        return x == reverseNum;
    }
}
