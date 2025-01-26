package ru.khananov;

public class NumberOfStepsToReduceANumberToZero {
  public int numberOfSteps(int num) {
    return countSteps(num, 0);
  }

  private int countSteps(int num, int steps) {
    if (num == 0) {
      return steps;
    }

    if (num % 2 == 0) {
      return countSteps(num / 2, ++steps);
    }
    return countSteps(num - 1, ++steps);
  }
}
