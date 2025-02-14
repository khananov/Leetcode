package ru.khananov;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[] {-1,-2,-3,-4,-5}, -8)));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> integers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int dif = target - nums[i];
            Integer value = integers.get(dif);
            if (value != null) {
                return new int[] {value, i};
            }
            integers.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }
}
