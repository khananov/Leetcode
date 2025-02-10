package ru.khananov;

public class SumOfDigitsOfStringAfterConvert {
  public static void main(String[] args) {
    System.out.println(new SumOfDigitsOfStringAfterConvert().getLucky("leetcode", 1));
  }

  public int getLucky(String s, int k) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      sb.append(s.codePointAt(i) - 'a' + 1);
    }

    while (k > 0) {
      int sum = 0;
      for (int i = 0; i < sb.length(); i++) {
        sum += sb.charAt(i) - '0';
      }
      sb = new StringBuilder(String.valueOf(sum));
      k--;
    }
    return Integer.parseInt(sb.toString());
  }
}
