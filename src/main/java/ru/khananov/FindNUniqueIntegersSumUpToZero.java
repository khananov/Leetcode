package ru.khananov;

import java.util.Arrays;

public class FindNUniqueIntegersSumUpToZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new FindNUniqueIntegersSumUpToZero().sumZero(
            5
        )));
    }

    public int[] sumZero(int n) {
        int[] ints = new int[n];
        int temp = n % 2 == 0 ? 1 : 0;

        for (int i = 0; i < n; i++) {
            ints[i] = temp;
            temp = temp <= 0 ? temp * -1 + 1 :  temp * -1;
        }

        return ints;
    }
}
