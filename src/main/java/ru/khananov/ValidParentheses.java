package ru.khananov;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        Deque<Character> chars = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    chars.addFirst(')');
                    break;
                case '{':
                    chars.addFirst('}');
                    break;
                case '[':
                    chars.addFirst(']');
                    break;
                default:
                    if (!chars.isEmpty() && s.charAt(i) == chars.getFirst())
                        chars.removeFirst();
                    else
                        return false;
            }
        }

        return chars.isEmpty();
    }
}
