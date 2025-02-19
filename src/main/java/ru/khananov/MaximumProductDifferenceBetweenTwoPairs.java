package ru.khananov;

public class MaximumProductDifferenceBetweenTwoPairs {
  public static void main(String[] args) {
    System.out.println(new MaximumProductDifferenceBetweenTwoPairs().maxProductDifference(new int[] {2,9,5,9,1}));
  }

  public int maxProductDifference(int[] nums) {
    int max = 0;
    int min = Integer.MAX_VALUE;
    int prevMax = max;
    int prevMin = min;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        prevMax = max;
        max = nums[i];
      } else if (nums[i] > prevMax) {
          prevMax = nums[i];
      }
      if (nums[i] < min) {
        prevMin = min;
        min = nums[i];
      } else if (nums[i] < prevMin) {
        prevMin = nums[i];
      }
    }
    return (max * prevMax) - (min * prevMin);
  }
}
