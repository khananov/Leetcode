package ru.khananov;

public class SquaresOfASortedArray {
  public int[] sortedSquares(int[] nums) {
    int[] sortedSquares = new int[nums.length];
    int start = 0, end = nums.length - 1;
    int sortedIndex = end;
    while (start <= end) {
      if (Math.abs(nums[start]) > Math.abs(nums[end])) {
        sortedSquares[sortedIndex] = nums[start] * nums[start];
        start++;
      } else {
        sortedSquares[sortedIndex] = nums[end] * nums[end];
        end--;
      }
      sortedIndex--;
    }

    return sortedSquares;
  }
}
