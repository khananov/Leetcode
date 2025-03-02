package ru.khananov;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MergeTwo2DArraysBySummingValues {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(new MergeTwo2DArraysBySummingValues().mergeArrays(
        new int[][] {{1,2},{2,3},{4,5}},
        new int[][] {{1,4},{3,2},{4,1}}
    )));
  }

//  public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
//    Map<Integer, Integer> nums = new TreeMap<>();
//    int maxLength = Math.max(nums1.length, nums2.length);
//
//    for (int i = 0; i < maxLength; i++) {
//      if (i < nums1.length)
//        nums.put(nums1[i][0], nums.getOrDefault(nums1[i][0], 0) + nums1[i][1]);
//      if (i < nums2.length)
//        nums.put(nums2[i][0], nums.getOrDefault(nums2[i][0], 0) + nums2[i][1]);
//    }
//
//    int[][] arrNums = new int[nums.size()][2];
//    int i = 0;
//    for (Map.Entry<Integer, Integer> entry : nums.entrySet()) {
//      arrNums[i][0] = entry.getKey();
//      arrNums[i++][1] = entry.getValue();
//    }
//
//    return arrNums;
//  }

  public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
    int[][] nums = new int[nums1.length + nums2.length][2];
    int numsI = 0;
    int nums1I = 0;
    int nums2I = 0;

    while (nums1I < nums1.length || nums2I < nums2.length) {
      if (nums1I < nums1.length) {
        if (nums2I < nums2.length) {
          if (nums1[nums1I][0] < nums2[nums2I][0]) {
            nums[numsI][0] = nums1[nums1I][0];
            nums[numsI++][1] = nums1[nums1I++][1];
          } else if (nums1[nums1I][0] > nums2[nums2I][0]) {
            nums[numsI][0] = nums2[nums2I][0];
            nums[numsI++][1] = nums2[nums2I++][1];
          } else {
            nums[numsI][0] = nums1[nums1I][0];
            nums[numsI++][1] = nums1[nums1I++][1] + nums2[nums2I++][1];
          }
        } else {
          nums[numsI][0] = nums1[nums1I][0];
          nums[numsI++][1] = nums1[nums1I++][1];
        }
      } else {
        nums[numsI][0] = nums2[nums2I][0];
        nums[numsI++][1] = nums2[nums2I++][1];
      }
    }

    int numsCounter = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i][0] > 0) numsCounter++;
    }

    int[][] newNums = new int[numsCounter][2];
    for (int i = 0; i < numsCounter; i++) {
      newNums[i][0] = nums[i][0];
      newNums[i][1] = nums[i][1];
    }

    return newNums;
  }
}
