package ru.khananov;

import java.util.Arrays;

public class RelativeSortArray {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(
        new RelativeSortArray().relativeSortArray(
            new int[] {2,3,1,3,2,4,6,7,9,2,19},
            new int[] {2,1,4,3,9,6}
        )
    ));
  }

  public int[] relativeSortArray(int[] arr1, int[] arr2) {
    int max = 0;
    for (int i = 0; i < arr1.length; i++) {
      if (arr1[i] > max) {
        max = arr1[i];
      }
    }

    int[] counting = new int[max + 1];

    for (int i = 0; i < arr1.length; i++) {
      counting[arr1[i]]++;
    }

    int arr1Iterator = 0;
    for (int i = 0; i < arr2.length; i++) {
      int currentNum = arr2[i];
      while (counting[currentNum] != 0) {
        arr1[arr1Iterator++] = currentNum;
        counting[currentNum]--;
      }
    }

    for (int i = 0; i < counting.length; i++) {
      while (counting[i] != 0) {
        arr1[arr1Iterator++] = i;
        counting[i]--;
      }
    }
    return arr1;
  }
}
