package ru.khananov;

public class RichestCustomerWealth {
  public static void main(String[] args) {
    System.out.println(new RichestCustomerWealth().maximumWealth(new int[][] {
        {2,8,7}, {7,1,3}, {1,9,5}
    }));
  }

  public int maximumWealth(int[][] accounts) {
    int maxWealth = 0;
    for (int i = 0; i < accounts.length; i++) {
      int sum = 0;
      for (int j = 0; j < accounts[i].length; j++) {
        sum += accounts[i][j];
      }

      if (sum > maxWealth) {
        maxWealth = sum;
      }
    }
    return maxWealth;
  }
}
