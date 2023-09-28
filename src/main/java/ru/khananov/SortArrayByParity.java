package ru.khananov;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                new SortArrayByParity().sortArrayByParity(new int[] {1,0,3})));
    }

    public int[] sortArrayByParity(int[] nums) {
        int oddIndex = nums.length - 1;
        int i = 0;

        while (i != oddIndex) {
            int temp;

            if (nums[i] % 2 != 0) {
                temp = nums[i];
                nums[i--] = nums[oddIndex];
                nums[oddIndex--] = temp;
            }
            i++;
        }

        return nums;
    }
}
