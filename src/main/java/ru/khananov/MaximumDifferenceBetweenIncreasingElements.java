package ru.khananov;

public class MaximumDifferenceBetweenIncreasingElements {
  public int maximumDifference(int[] nums) {
    if (nums.length < 1) return -1;
    int currentI = nums[0];
    int maxDiff = 0;
    for (int j = 1; j < nums.length; j++) {
      if (nums[j] < currentI) {
        currentI = nums[j];
      } else if (nums[j] - currentI > maxDiff) {
        maxDiff = nums[j] - currentI;
      }
    }

    if (maxDiff > 0)
      return maxDiff;
    return -1;
  }
}
