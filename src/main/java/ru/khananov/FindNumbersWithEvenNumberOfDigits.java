package ru.khananov;

public class FindNumbersWithEvenNumberOfDigits {
  public int findNumbers(int[] nums) {
    int countNumber = 0, countDigit = 0;
    for (int i = 0; i < nums.length; i++) {
      while (nums[i] != 0) {
        countDigit++;
        nums[i] /= 10;
      }

      if (countDigit % 2 == 0) {
        countNumber++;
      }
      countDigit = 0;
    }
    return countNumber;
  }
}
