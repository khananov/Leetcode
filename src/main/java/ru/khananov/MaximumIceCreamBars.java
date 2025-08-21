package ru.khananov;

public class MaximumIceCreamBars {
  public static void main(String[] args) {
    System.out.println(new MaximumIceCreamBars().maxIceCream(new int[] {1,3,2,4,1}, 7));
  }

  public int maxIceCream(int[] costs, int coins) {
    int max = 1;
    for (int i = 0; i < costs.length; i++) {
      max = Math.max(max, costs[i]);
    }

    int[] counts = new int[max + 1];
    for (int i = 0; i < costs.length; i++) {
      counts[costs[i]]++;
    }

    int result = 0;
    for (int i = 1; i < counts.length; i++) {
      if (counts[i] == 0) continue;

      while (counts[i]-- != 0 && coins >= i) {
        coins -= i;
        result++;
      }
    }

    return result;
  }
}