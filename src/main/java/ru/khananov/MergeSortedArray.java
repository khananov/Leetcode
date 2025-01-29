package ru.khananov;

public class MergeSortedArray {
    public static void main(String[] args) {
        new MergeSortedArray().merge(
            new int [] {2, 0},
            1,
            new int[] {1},
            1
        );
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        while (n >= 0) {
            nums1[m+n+1] = m >= 0 && nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
    }
}
