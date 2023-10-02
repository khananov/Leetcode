package ru.khananov;

public class NumberOfEmployeesWhoMetTheTarget {
    public static void main(String[] args) {

    }

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;

        for (int hour : hours) {
            if (hour >= target)
                count++;
        }

        return count;
    }
}
