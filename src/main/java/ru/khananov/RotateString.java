package ru.khananov;

public class RotateString {
  public static void main(String[] args) {
    System.out.println(new RotateString().rotateString("abcde", "cdeab"));
  }

  public boolean rotateString(String s, String goal) {
    if (s.length() != goal.length()) {
      return false;
    }
    return (s + s).contains(goal);
  }
}
