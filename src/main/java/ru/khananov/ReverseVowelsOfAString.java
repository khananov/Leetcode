package ru.khananov;

import java.util.Set;

public class ReverseVowelsOfAString {
  public static void main(String[] args) {
    String s = "IceCreAm";
    System.out.println(new ReverseVowelsOfAString().reverseVowels(s));
  }

  public String reverseVowels(String s) {
    Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
    char[] sChars = s.toCharArray();
    char tempChar;
    int left = 0;
    int right = sChars.length - 1;

    while (left < right) {
      if (!vowels.contains(sChars[left])) {
        left++;
      } else if (!vowels.contains(sChars[right])) {
        right--;
      } else {
        tempChar = sChars[left];
        sChars[left++] = sChars[right];
        sChars[right--] = tempChar;
      }
    }

    return String.valueOf(sChars);
  }
}
