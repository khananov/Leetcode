package ru.khananov;

public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(new PowerOfFour().isPowerOfFour(-64));
    }

    public boolean isPowerOfFour(int n) {
            if (n == 1) return true;

            while (n >= 4 && n % 4 == 0) {
                if (n == 4) return true;
                n /= 4;
            }

            return false;
    }
}
