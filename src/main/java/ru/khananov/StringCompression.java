package ru.khananov;

import java.util.Arrays;

public class StringCompression {
  public static void main(String[] args) {
   new StringCompression().compress(
       new char[] {'a','a','b','b','c','c','c'}
   );
  }

  public int compress(char[] chars) { // TODO
    int start = 0;
    int countChars = 1;
    if (chars.length == 1) return 1;
    
    for (int i = 1; i < chars.length; i++) {
      if (chars[start] == chars[i]) {
        countChars++;
        if (i + 1 == chars.length) {
          if (countChars > 1) {
            chars[start+1] = Character.forDigit(countChars, 10);
          }
        }
      } else {
        if (countChars > 1) {
          chars[start+1] = Character.forDigit(countChars, 10);
        }
        start += countChars;
        countChars = 1;
      }
    }
    System.out.println(Arrays.toString(chars));
    return start;
  }
}
