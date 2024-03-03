package ru.khananov;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[] {-4,-2,1,3,10})));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int squaresIndex = end;
        while (start <= end) {
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                squares[squaresIndex] = nums[start] * nums[start];
                start++;
            } else {
                squares[squaresIndex] = nums[end] * nums[end];
                end--;
            }
            squaresIndex--;
        }

        return squares;
    }
}
