package ru.khananov;

public class RepeatedSubstringPattern {
  public static void main(String[] args) {
    System.out.println(new RepeatedSubstringPattern().repeatedSubstringPattern("aaaabaaaab"));
  }

  public boolean repeatedSubstringPattern(String s) {
    int sLength = s.length();
    if (sLength < 2) return false;

    int[] divs = new int[sLength];
    for (int i = 1; i < sLength; i++) {
      if (sLength % i == 0) {
        divs[i]++;
      }
    }

    int start = 0;
    int end;
    for (int i = 1; i < sLength; i++) {
      int div = divs[i];
      if (div != 0) {
        end = i;
        while (end <= sLength) {
          if (end == sLength) return true;
          if (!s.substring(start, end).equals(s.substring(end, end + i))) {
            start = 0;
            break;
          } else {
            start = end;
            end += i;
          }
        }
      }
    }

    return false;
  }
}
