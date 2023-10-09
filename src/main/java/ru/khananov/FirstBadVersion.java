package ru.khananov;

public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(new FirstBadVersion().firstBadVersion(3));
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int mid = 0;

        while (left <= right) {
            mid = (right + left) / 2;

            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    boolean isBadVersion(int version){
        return version >= 2;
    }
}
