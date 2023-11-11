package ru.khananov;

public class SumOfAllOddLengthSubarrays {
    public static void main(String[] args) {
        System.out.println(new SumOfAllOddLengthSubarrays().sumOddLengthSubarrays(new int[] {

        }));
    }

    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0, n = arr.length;
        for (int i = 0; i < n; ++i) {
            sum += ((i + 1) * (n - i) + 1) / 2 * arr[i];
        }

        return sum;
    }
}
