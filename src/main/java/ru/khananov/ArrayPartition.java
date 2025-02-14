package ru.khananov;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ArrayPartition {
  public static void main(String[] args) {
    System.out.println(new ArrayPartition().arrayPairSum(new int[] {1,2,3,2}));
  }

  public int arrayPairSum(int[] nums) {
    Arrays.sort(nums);
    int maxSum = 0;
    for (int i = 0; i < nums.length; i += 2) {
      maxSum += nums[i];
    }
    System.gc();
    return maxSum;
  }
}
