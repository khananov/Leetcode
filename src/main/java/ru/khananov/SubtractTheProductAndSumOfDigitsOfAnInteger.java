package ru.khananov;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        new SubtractTheProductAndSumOfDigitsOfAnInteger().subtractProductAndSum(1234);
    }

    public int subtractProductAndSum(int n) {
        int sumDigits = 0;
        int prodDigits = 1;

        while (n != 0) {
            sumDigits += n % 10;
            prodDigits *= n % 10;
            n /= 10;
        }

        return prodDigits - sumDigits;
    }
}
