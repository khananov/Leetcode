package ru.khananov;

import java.util.HashMap;
import java.util.Map;

public class MinimumCostToMoveChipsToTheSamePosition {
  public static void main(String[] args) {
    System.out.println(new MinimumCostToMoveChipsToTheSamePosition().minCostToMoveChips(new int[] {3, 3, 1, 2, 2}));
  }

  public int minCostToMoveChips(int[] position) {
    int evenCoins = 0;
    int oddCoins = 0;

    for (int i = 0; i < position.length; i++) {
      if (position[i] % 2 == 0) {
        evenCoins++;
      } else {
        oddCoins++;
      }
    }

    return Math.min(evenCoins, oddCoins);
  }
}
