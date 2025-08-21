package ru.khananov;


public class HeightChecker {
  public static void main(String[] args) {
    System.out.println(new HeightChecker().heightChecker(
            new int[]{2, 1, 2, 1, 1, 2, 2, 1}
        )
    );
  }

  public int heightChecker(int[] heights) {
    int max = 0;
    for (int i = 0; i < heights.length; i++) {
      if (heights[i] > max) {
        max = heights[i];
      }
    }

    int[] counting = new int[max + 1];
    for (int i = 0; i < heights.length; i++) {
      counting[heights[i]]++;
    }

    int result = 0;
    int heightIterator = 0;
    for (int i = 0; i < counting.length; i++) {
      while (counting[i] > 0) {
        if (heights[heightIterator++] != i) result++;
        counting[i]--;
      }
    }

    return result;
  }
}
