package ru.khananov;

public class MinimumCutsToDivideACircle {
    public static void main(String[] args) {
        System.out.println(new MinimumCutsToDivideACircle().numberOfCuts(10));
    }

    public int numberOfCuts(int n) {
        if (n == 1) return 0;
        return n % 2 == 0 ? n / 2 : n;
    }
}
