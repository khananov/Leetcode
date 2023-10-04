package ru.khananov;

import java.util.Arrays;

public class DesignHashMap {
    public static void main(String[] args) {
    }

    int[] data;
    public DesignHashMap() {
        data = new int[1000001];
        Arrays.fill(data, -1);
    }
    public void put(int key, int val) {
        data[key] = val;
    }
    public int get(int key) {
        return data[key];
    }
    public void remove(int key) {
        data[key] = -1;
    }
}
