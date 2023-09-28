package ru.khananov;

public class MaximumNumberOfBallsInABox {
    public static void main(String[] args) {
    }

    public int countBalls(int lowLimit, int highLimit) {
        int maxBalls = 0;
        int[] boxes = new int[46];

        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = 0;
            int temp = i;

            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }

            maxBalls = maxBalls > ++boxes[sum] ? maxBalls : boxes[sum];
        }

        return maxBalls;
    }
}
