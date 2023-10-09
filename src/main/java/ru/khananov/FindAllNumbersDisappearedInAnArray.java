package ru.khananov;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        System.out.println(
                new FindAllNumbersDisappearedInAnArray().findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1})
        );
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNums = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] > 0)
                nums[Math.abs(nums[i]) - 1] *= -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                disappearedNums.add(i + 1);
        }

        return disappearedNums;
    }
}
