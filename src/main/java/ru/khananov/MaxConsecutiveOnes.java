package ru.khananov;

public class MaxConsecutiveOnes {
  public static void main(String[] args) {
    System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
  }

  public static int findMaxConsecutiveOnes(int[] nums) {
    int maxConsecutiveOnes = 0;
    int currentConsecutiveOnes = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        currentConsecutiveOnes++;
      } else {
        if (currentConsecutiveOnes > maxConsecutiveOnes) {
          maxConsecutiveOnes = currentConsecutiveOnes;
        }
        currentConsecutiveOnes = 0;
      }
    }

    if (currentConsecutiveOnes > maxConsecutiveOnes) {
      maxConsecutiveOnes = currentConsecutiveOnes;
    }
    return maxConsecutiveOnes;
  }
}
