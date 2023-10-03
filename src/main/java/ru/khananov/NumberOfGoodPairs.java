package ru.khananov;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        System.out.println(new NumberOfGoodPairs().numIdenticalPairs(
                new int[] {1, 2, 1, 1, 3, 1, 3}
        ));
    }

    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        int[] countPairs = new int[101];

        for (int num : nums) {
            result += countPairs[num]++;
        }

        return result;
    }
}
