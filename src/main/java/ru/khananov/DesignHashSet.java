package ru.khananov;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DesignHashSet {
    public static void main(String[] args) {

    }

    List<Integer> hashset;
    public DesignHashSet() {
        hashset= new ArrayList<>();
    }

    public void add(int key) {
        if (!contains(key))
            hashset.add(key);
    }

    public void remove(int key) {
        if (contains(key)) {
            Iterator<Integer> iterator = hashset.listIterator();
            while (iterator.hasNext()) {
                if (iterator.next() == key)
                    iterator.remove();
            }
        }
    }

    public boolean contains(int key) {
        for (Integer e : hashset)
            if (e == key) return true;

        return false;
    }
}
