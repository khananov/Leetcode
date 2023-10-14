package ru.khananov;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(new MajorityElement().majorityElement(new int[] {1,2,3,4,5}));
    }

    public int majorityElement(int[] nums) {
        int num = 0;
        int countNums = 0;

        for (int i = 0; i < nums.length; i++) {
            if (countNums == 0)
                num = nums[i];
            if (num == nums[i])
                countNums++;
            else
                countNums--;
        }

        return num;
    }
}
