package ru.khananov;

public class IsSubsequence {
  public boolean isSubsequence(String s, String t) {
    int newIndex = 0;
    for (int i = 0; i < s.length(); i++) {
      newIndex = t.indexOf(s.charAt(i), newIndex);
      if (newIndex == -1) return false;
      newIndex++;
    }

    return true;
  }
}
