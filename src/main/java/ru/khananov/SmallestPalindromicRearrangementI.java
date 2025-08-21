package ru.khananov;

public class SmallestPalindromicRearrangementI {
  public static void main(String[] args) {
    new SmallestPalindromicRearrangementI().smallestPalindrome("jjejj");
  }

  public String smallestPalindrome(String s) {
    int[] counts = new int[123];
    for (char letter : s.toCharArray()) {
      counts[letter]++;
    }

    StringBuilder sb = new StringBuilder();
    int centerLetter = 0;
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] % 2 != 0) {
        centerLetter = i;
        counts[i]--;
      }
      int count = counts[i] / 2;
      while (count != 0) {
        sb.append((char) i);
        counts[i]--;
        count--;
      }
    }
    if (centerLetter != 0) {
      sb.append((char) centerLetter);
    }

    for (int i = counts.length - 1; i >= 0; i--) {
      while (counts[i] > 0) {
        sb.append((char) i);
        counts[i]--;
      }
    }
    return sb.toString();
  }
}
