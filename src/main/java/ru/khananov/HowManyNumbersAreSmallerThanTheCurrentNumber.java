package ru.khananov;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
  public int[] smallerNumbersThanCurrent(int[] nums) {
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }

    int[] counting = new int[max + 1];
    for (int i = 0; i < nums.length; i++) {
      counting[nums[i]]++;
    }

    int[] result = new int[nums.length];
    int countingIterator = 0;
    for (int i = 0; i < nums.length; i++) {
      int sum = 0;
      while (countingIterator != nums[i]) {
        sum += counting[countingIterator++];
      }
      result[i] = sum;
      countingIterator = 0;
    }

    return result;
  }
}
