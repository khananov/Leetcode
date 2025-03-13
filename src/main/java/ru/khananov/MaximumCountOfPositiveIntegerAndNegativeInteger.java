package ru.khananov;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {
  public static void main(String[] args) {
   new MaximumCountOfPositiveIntegerAndNegativeInteger().maximumCount(
       new int[] {-2,-1,-1,1,2,3}
   );
  }

  public int maximumCount(int[] nums) {
    if (nums[0] > 0 || nums[nums.length - 1] < 0) return nums.length;
    int negCount = binarySearch(nums, 0);
    int posCount = nums.length - binarySearch(nums, 1);
    System.gc();
    return posCount > negCount ? posCount : negCount;
  }

  private int binarySearch(int[] nums, int target) {
    int right = nums.length - 1;
    int left = 0;
    int mid = right / 2;
    int result = nums.length;

    while (left <= right) {
      mid = (right + left) / 2;
      if (nums[mid] < target) {
        left = mid + 1;
      } else {
        result = mid;
        right = mid - 1;
      }
    }
    return result;
  }
}
