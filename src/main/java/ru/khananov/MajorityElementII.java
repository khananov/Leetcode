package ru.khananov;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public static void main(String[] args) {
        System.out.println(new MajorityElementII().majorityElement(new int[] {
        1, 1, 1, 1, 2, 3, 3, 3, 3
        }));
    }

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> majorityNums = new ArrayList<>();
        Map<Integer, Integer> elementsCount = new HashMap<>();

        for (Integer num : nums) {
            elementsCount.put(num, elementsCount.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : elementsCount.entrySet()) {
            if (entry.getValue() > nums.length / 3)
                majorityNums.add(entry.getKey());
        }
        return majorityNums;
    }
}
