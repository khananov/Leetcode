package ru.khananov;

import java.util.ArrayList;
import java.util.List;

public class DesignHashSet {
    public static void main(String[] args) {

    }

    List<Integer> ls;
    public DesignHashSet() {
        ls= new ArrayList<>();
    }

    public void add(int key) {
        if(!ls.contains(key)) ls.add(key);

    }

    public void remove(int key) {
        if(ls.contains(key)) ls.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        return ls.contains(key);
    }
}
