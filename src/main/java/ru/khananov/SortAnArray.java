package ru.khananov;

public class SortAnArray {
  public static void main(String[] args) {
    new SortAnArray().countingSort(new int[]{-2, 6, -10, 0, 5,2,3,1});
  }

  public int[] countingSort(int[] nums) {
    int counts[] = new int[2 * 50000 + 1];
    for (int i = 0; i < nums.length; i++) {
      counts[nums[i] + 50000]++;
    }

    int resultIndex = 0;
    for (int i = 0; resultIndex < nums.length; i++) {
      while (counts[i]-- != 0) {
        nums[resultIndex++] = i - 50000;
      }
    }

    return nums;
  }
}
