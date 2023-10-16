package ru.khananov;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(-123));
    }

    public int reverse(int x) {
        long reverseNum = 0;

        while (x != 0) {
            int lastDig = x % 10;
            reverseNum += lastDig;
            reverseNum *= 10;
            x /= 10;
        }

        reverseNum /= 10;

        if (reverseNum > Integer.MAX_VALUE || reverseNum < Integer.MIN_VALUE) return 0;

        if (x < 0) return (int) (reverseNum * -1);

        return (int) reverseNum;
    }
}
