package ru.khananov;

public class CountOperationsToObtainZero {
  public static void main(String[] args) {
   new CountOperationsToObtainZero().countOperations(2, 3);
  }

  public int countOperations(int num1, int num2) {
    int count = 0;
    while (num1 > 0 && num2 > 0) {
      if (num1 > num2) num1 -= num2;
      else num2 -= num1;
      count++;
    }

    return count;
  }
}
