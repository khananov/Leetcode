package ru.khananov;

import java.util.Arrays;

public class CheckIfArrayIsGood {
    public static void main(String[] args) {
        System.out.println(new CheckIfArrayIsGood().isGood(new int[] {
                1, 5, 3, 6, 6, 4, 2
        }));
    }

    public boolean isGood(int[] nums) {
        int max = 0;
        int countMax = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                countMax = 1;
                max = nums[i];
            } else if (nums[i] == max) {
                countMax++;
            }
        }

        if (countMax != 2 || nums.length != max + 1) return false;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i+1]) return false;
        }

        return true;
    }
}
