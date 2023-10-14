package ru.khananov;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        new ContainsDuplicate().containsDuplicate(new int[] {1, 2, 3, 4, 5, 6});
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> setNums = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            setNums.add(nums[i]);
        }

        return setNums.size() != nums.length;
    }
}
