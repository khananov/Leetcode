package ru.khananov;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(new SingleNumber().singleNumber(new int[] {1, 2, 2, 1, 3, 4, 4}));
    }
    public int singleNumber(int[] nums) {
        int result=0;

        for(int i=0; i<nums.length; i++)
            result = result^nums[i];

        return result;
    }
}
