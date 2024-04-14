package algorithms.sorting.impl;

import java.util.List;

import algorithms.sorting.ListSorter;

public class QuickSort<T extends Comparable<T>> implements ListSorter<T> {

    @Override
    public void sort(List<T> arr) {
        sort(arr, 0, arr.size() - 1);
    }

    private void sort(List<T> arr, int l, int r) {
        if (l < r) {
            var left = l;
            var pivot = arr.get(r);
            for (int i = l; i < r; i++) {
                if (arr.get(i).compareTo(pivot) < 0) {
                    var tmp = arr.get(left);
                    arr.set(left, arr.get(i));
                    arr.set(i, tmp);
                    left++;
                }
            }
            arr.set(r, arr.get(left));
            arr.set(left, pivot);
            sort(arr, l, left - 1);
            sort(arr, left + 1, r);
        }
    }
    
}
