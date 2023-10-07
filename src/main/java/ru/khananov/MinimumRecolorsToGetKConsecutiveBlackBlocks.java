package ru.khananov;

public class MinimumRecolorsToGetKConsecutiveBlackBlocks {
    public static void main(String[] args) {
        System.out.println(new MinimumRecolorsToGetKConsecutiveBlackBlocks().minimumRecolors(
                "BWBWBWWWWWBBBWB", 4
        ));
    }

    public int minimumRecolors(String blocks, int k) {
        int left = 0, rigth = 0;
        int minOperations = Integer.MAX_VALUE;
        int count = 0;

        while (rigth < blocks.length()) {
            if (blocks.charAt(rigth) == 'W') count++;

            if (rigth - left + 1 < k) rigth++;
            else if (rigth - left + 1 == k) {
                minOperations = Math.min(count, minOperations);
                if(blocks.charAt(left) == 'W') count--;

                left++;
                rigth++;
            }
        }

        return minOperations;
    }
}
