package ru.khananov;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr = new IntersectionOfTwoArrays().intersection(
                new int[] {1, 2, 2, 2, 2, 1}, new int[] {2, 2, 2, 2, 2, 1, 1});

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        int[] arr = new int[1001];
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            arr[nums1[i]] = 1;
        }

        for (int i = 0; i < nums2.length; i++) {
            if (arr[nums2[i]] == 1) {
                arr[nums2[i]] = 2;
                count++;
            }
        }

        int[] result = new int[count];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                result[j] = i;
                j++;
            }
        }

        return result;
    }
}
