package ru.khananov;

import java.util.Arrays;

public class ApplyOperationsToAnArray {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(
        new ApplyOperationsToAnArray().applyOperations(new int[] {1,2,2,1,1,0})
    ));
  }

  public int[] applyOperations(int[] nums) {
    int[] afterOperations = new int[nums.length];
    int j = 0;

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] != 0) {
        if (nums[i] == nums[i + 1]) {
          afterOperations[j++] = nums[i] * 2;
          nums[i+1] = 0;
        } else {
          afterOperations[j++] = nums[i];
        }
      }
    }
    afterOperations[j] = nums[nums.length - 1];
    return afterOperations;
  }
}
