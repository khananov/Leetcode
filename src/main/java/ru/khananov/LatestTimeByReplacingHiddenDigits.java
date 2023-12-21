package ru.khananov;

import java.util.Arrays;

public class LatestTimeByReplacingHiddenDigits {
    public static void main(String[] args) {
        System.out.println(new LatestTimeByReplacingHiddenDigits().maximumTime("0?:3?"));
    }

    public String maximumTime(String time) {
        char[] chars = time.toCharArray();
        if (chars[0] == '?') {
            if (chars[1] <= '3' || chars[1] == '?') {
                chars[0] = '2';
            } else {
                chars[0] = '1';
            }
        }
        if (chars[1] == '?') {
            if (chars[0] < '2') {
                chars[1] = '9';
            } else {
                chars[1] = '3';
            }
        }
        if (chars[3] == '?') {
            chars[3] = '5';
        }
        if (chars[4] == '?') {
            chars[4] = '9';
        }

        return new String(chars);
    }
}
