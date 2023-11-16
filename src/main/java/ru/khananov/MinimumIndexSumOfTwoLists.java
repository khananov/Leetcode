package ru.khananov;

import java.util.*;

public class MinimumIndexSumOfTwoLists {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new MinimumIndexSumOfTwoLists().findRestaurant(new String[] {
                "Shogun","Tapioca Express","Burger King","KFC"
        }, new String[] {
                "Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"
        })));
    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) map.put(list1[i], i);
        int min = 2001;
        List<String> words = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            int idx = map.getOrDefault(list2[i], 2001), sum = idx + i;
            if (min > sum) min = sum;
        }

        for (int i = 0; i < list2.length; i++) {
            int idx = map.getOrDefault(list2[i], 2001), sum = idx + i;
            if (sum == min) words.add(list2[i]);
        }

        return words.toArray(new String[0]);
    }
}
