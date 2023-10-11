package ru.khananov;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        int[] arr = new int[1001];
        int[] tempArr = new int[nums1.length];
        int j = 0;

        for (int i = 0; i < nums1.length; i++) {
            arr[nums1[i]]++;
        }

        for (int i = 0; i < nums2.length; i++) {
            if (arr[nums2[i]] > 0) {
                tempArr[j++] = arr[nums2[i]]--;
            }
        }

        int[] result = new int[j];

        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] != 0)
                result[i] = tempArr[i];
        }
        return result;
    }
}
