package ru.khananov;

public class TwoSum {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        int currentTarget = 0;

        for (int firstIndex = 0; firstIndex < nums.length - 1; firstIndex++) {
            currentTarget = target - nums[firstIndex];

            for (int secondIndex = firstIndex + 1; secondIndex < nums.length; secondIndex++) {
                if (nums[secondIndex] == currentTarget)
                    return new int[]{firstIndex, secondIndex};
            }
        }
        return new int[] {0};
    }
}
