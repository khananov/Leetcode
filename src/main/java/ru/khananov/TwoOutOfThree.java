package ru.khananov;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TwoOutOfThree {
  public static void main(String[] args) {
    new TwoOutOfThree().twoOutOfThree(
        new int[] {1,1,3,2},
        new int[] {2, 3},
        new int[] {3}
    );
  }

  public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
    boolean[] n1 = new boolean[101];
    boolean[] n2 = new boolean[101];
    boolean[] n3 = new boolean[101];
    int maxLength = Math.max(nums1.length, Math.max(nums2.length, nums3.length));
    for (int i = 0; i < maxLength; i++) {
      if (i < nums1.length) n1[nums1[i]] = true;
      if (i < nums2.length) n2[nums2[i]] = true;
      if (i < nums3.length) n3[nums3[i]] = true;
    }

    List<Integer> distinct = new ArrayList<>();
    for (int i = 0; i < n1.length; i++) {
      if ((n1[i] && n2[i]) || (n1[i] && n3[i]) || (n2[i] && n3[i])) {
        distinct.add(i);
      }
    }
    return distinct;
  }
}
