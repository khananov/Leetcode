package ru.khananov;

public class FindTheTownJudge {
  public static void main(String[] args) {
    new FindTheTownJudge().findJudge(3, new int[][]{{1, 3}, {2, 3}});
  }

  public int findJudge(int n, int[][] trust) {
    if (trust.length == 0 && n == 1) return 1;

    int[] people = new int[n+1];
    for (int i = 0; i < trust.length; i++) {
      people[trust[i][0]]--;
      people[trust[i][1]]++;
    }

    for (int i = 0; i < people.length; i++) {
      if (people[i] == n - 1) return i;
    }

    return -1;
  }
}
