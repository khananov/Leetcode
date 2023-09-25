package ru.khananov;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(new HappyNumber().isHappy(19));
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = sqrt(slow);
            fast = sqrt(sqrt(fast));
        } while (fast != slow);

        return slow == 1;
    }

    public int sqrt(int n) {
        int result = 0;

        while (n != 0) {
            result += (n % 10) * (n % 10);
            n = n / 10;
        }

        return result;
    }
}
