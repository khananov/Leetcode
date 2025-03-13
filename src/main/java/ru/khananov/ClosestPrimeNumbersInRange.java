package ru.khananov;

import java.math.BigInteger;

public class ClosestPrimeNumbersInRange {
  public static void main(String[] args) {
    new ClosestPrimeNumbersInRange().closestPrimes(84084, 407043);
  }
  // TODO Time limit exceeded
  public int[] closestPrimes(int left, int right) {
    int num1 = -1;
    int num2 = -1;
    int[] result = new int[] {num1, num2};
    int[] nums = new int[right - left + 1];
    int numsInd = 0;
    int minDiff = Integer.MAX_VALUE;
    int prevNum = -1;
    for (int i = left; i <= right; i++) {
      if (BigInteger.valueOf(i).isProbablePrime(i)) {
        nums[numsInd++] = i;
        if (prevNum != -1) {
          minDiff = i - prevNum < minDiff ? i - prevNum : minDiff;
        }
        prevNum = i;
      }
    }

    numsInd = 0;
    while (numsInd < nums.length - 1 && nums[numsInd + 1] != 0) {
      if (nums[numsInd + 1] - nums[numsInd] == minDiff) {
        result[0] = nums[numsInd];
        result[1] = nums[numsInd + 1];
        break;
      }
      numsInd++;
    }

    return result;
  }
}
