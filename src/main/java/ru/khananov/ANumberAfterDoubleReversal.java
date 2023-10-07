package ru.khananov;

public class ANumberAfterDoubleReversal {
    public static void main(String[] args) {
        System.out.println(new ANumberAfterDoubleReversal().isSameAfterReversals(0));
    }

    public boolean isSameAfterReversals(int num) {
        int tempNum = num;
        int reverseNum = 0;

        while (tempNum != 0) {
            reverseNum = reverseNum * 10 + tempNum % 10;
            tempNum /= 10;
        }

        tempNum = reverseNum;
        reverseNum = 0;

        while (tempNum != 0) {
            reverseNum = reverseNum * 10 + tempNum % 10;
            tempNum /= 10;
        }

        return num == reverseNum;
    }
}
