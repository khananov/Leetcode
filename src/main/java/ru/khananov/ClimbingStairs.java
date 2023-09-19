package ru.khananov;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(new ClimbingStairs().climbStairs(3));
    }

    public int climbStairs(int n) {
        if (n == 0 || n == 1)
            return 1;

        int prev = 1, curr = 1;

        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }

        return curr;
    }
}
