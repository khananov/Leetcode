package ru.khananov;

public class MonotonicArray {
    public static void main(String[] args) {
        System.out.println(new MonotonicArray().isMonotonic(
                new int[] {4, 3, 2, 3}
        ));
    }

    public boolean isMonotonic(int[] nums) {
        boolean isIncreasing = false;
        boolean isDecreasing = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i+1]) {
                if (isDecreasing) return false;
                isIncreasing = true;
            } else if (nums[i] > nums[i+1]) {
                if (isIncreasing) return false;
                isDecreasing = true;
            }
        }

        return true;
    }
}
