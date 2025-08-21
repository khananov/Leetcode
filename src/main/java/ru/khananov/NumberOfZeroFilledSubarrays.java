package ru.khananov;

public class NumberOfZeroFilledSubarrays {
  public static void main(String[] args) {
    System.out.println(new NumberOfZeroFilledSubarrays().zeroFilledSubarray(new int[] {0, 0, 0, 2, 0 ,0}));
  }

  public long zeroFilledSubarray(int[] nums) {
    long result = 0;
    long seq = 0;
    for (int num : nums) {
      if (num == 0) {
        seq++;
        result += seq;
      } else {
        seq = 0;
      }
    }

    return result;
  }
}
