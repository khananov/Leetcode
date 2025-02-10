package ru.khananov;

import java.util.HashSet;
import java.util.Set;

public class NRepeatedElementInSize2NArray {
  public int repeatedNTimes(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (!set.add(nums[i])) return nums[i];
    }
    return 0;
  }
}
