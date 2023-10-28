package ru.khananov;

import java.math.BigInteger;

public class BaseSeven {
    public static void main(String[] args) {

    }

    public String convertToBase7(int num) {
        BigInteger m = new BigInteger(""+num);
        return m.toString(7);
    }
}
