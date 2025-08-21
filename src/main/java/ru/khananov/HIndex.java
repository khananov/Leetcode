package ru.khananov;

public class HIndex {
  public static void main(String[] args) {
    System.out.println(new HIndex().hIndex(new int[] {1,1,1,1,1,1,1}));
  }

  public int hIndex(int[] citations) {
    int max = 0;
    for (int i = 0; i < citations.length; i++) {
      if (citations[i] > max) max = citations[i];
    }

    int[] count = new int[max + 1];

    for (int i = 0; i < citations.length; i++) {
      count[citations[i]]++;
    }

    int citationsCount = 0;
    for (int i = max; i >= 0; i--) {
      citationsCount += count[i];
      if (citationsCount >= i) return i;
    }

    return 0;
  }
}
