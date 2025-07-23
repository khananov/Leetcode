package ru.khananov;

public class MoveZeroes {
  public void moveZeroes(int[] nums) {
    int start = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[start] != 0) {
        start++;
      } else if (nums[i] != 0) {
        nums[start++] = nums[i];
        nums[i] = 0;
      }
    }
  }
}
