package ru.khananov;

public class ConsecutiveCharacters {
  public int maxPower(String s) {
    int maxLength = 1;
    int currLength = 1;
    char currLetter = s.charAt(0);
    for (int i = 1; i < s.length(); i++) {
      if (currLetter == s.charAt(i)) {
        currLength++;
      } else {
        currLetter = s.charAt(i);
        maxLength = Math.max(maxLength, currLength);
        currLength = 1;
      }
    }
    return Math.max(maxLength, currLength);
  }
}
