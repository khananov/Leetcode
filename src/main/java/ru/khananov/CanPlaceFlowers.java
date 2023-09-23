package ru.khananov;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        System.out.println(
                new CanPlaceFlowers().canPlaceFlowers(new int[] {0, 0, 1, 0, 0}, 1));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int countFlowers = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                int prev = i - 1 < 0 ? 0 : flowerbed[i-1];
                int next = i + 1 > flowerbed.length - 1 ? 0 : flowerbed[i+1];

                if (prev == 0 && next == 0) {
                    countFlowers++;
                    i++;
                }
            }
        }

        return countFlowers >= n;
    }
}
