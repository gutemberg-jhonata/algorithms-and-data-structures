package algorithms.sorting.impl;

import java.util.List;

import algorithms.sorting.ListSorter;

public class InsertionSort<T extends Comparable<T>> implements ListSorter<T> {

    @Override
    public void sort(List<T> arr) {
        for (int i = 1; i < arr.size(); i++) {
            int j = i - 1;
            while (j >= 0 && arr.get(j + 1).compareTo(arr.get(j)) < 0) {
                var tmp = arr.get(j + 1);
                arr.set(j + 1, arr.get(j));
                arr.set(j, tmp);
                j--;
            }
        }
    }
}
