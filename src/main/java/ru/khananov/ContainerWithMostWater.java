package ru.khananov;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(new ContainerWithMostWater().maxArea(new int[] {
                1,8,6,2,5,4,8,3,7
        }));
    }

    public int maxArea(int[] height) {
        int maxArea = 0;
        int right = 0;
        int left = height.length - 1;

        while (right < left) {
            int minHeight = height[right] < height[left] ? height[right] : height[left];
            int currentArea = minHeight * (left - right);
            maxArea = currentArea > maxArea ? currentArea : maxArea;

            if (height[right] < height[left])
                right++;
            else
                left--;
        }

        return maxArea;
    }
}