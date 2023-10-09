package ru.khananov;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        new FindFirstAndLastPositionOfElementInSortedArray().searchRange(
                new int[] {5,7,7,8,8,10}, 8
        );

    }

    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int first = -1, last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                first = mid;
                last = mid;

                while (first > 0 && nums[first - 1] == target)
                    first--;
                while (last < nums.length - 1 && nums[last + 1] == target)
                    last++;

                break;
            } else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return new int[] {first, last};
    }
}
