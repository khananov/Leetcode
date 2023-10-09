package ru.khananov;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(
                new MissingNumber().missingNumber(new int[] {9,6,4,2,3,5,7,0,1})
        );
    }

    public int missingNumber(int[] nums) {
        int sum = 0;
        int sumNums = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += (i + 1);
            sumNums += nums[i];
        }

        return sum - sumNums;
    }
}
