package algorithms.sorting.impl;

import java.util.List;

import algorithms.sorting.ListSorter;

public class MergeSort<T extends Comparable<T>> implements ListSorter<T> {

    @Override
    public void sort(List<T> arr) {
        sort(arr, 0, arr.size() - 1);
    }

    private void sort(List<T> arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    @SuppressWarnings("unchecked")
    private void merge(List<T> arr, int l, int m, int r) {
        int length1 = m - l + 1;
        int length2 = r - m;
        var L = new Object[length1];
        var R = new Object[length2];
        for (int i = 0; i < length1; i++) {
            L[i] = arr.get(l + i);
        }
        for (int i = 0; i < length2; i++) {
            R[i] = arr.get(m + 1 + i);
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < length1 && j < length2) {
            if (((T) L[i]).compareTo(((T) R[j])) <= 0) {
                arr.set(k, ((T) L[i]));
                i++;
            } else {
                arr.set(k, ((T) R[j]));
                j++;
            }
            k++;
        }
        while (i < length1) {
            arr.set(k, ((T) L[i]));
            i++;
            k++;
        }
        while (j < length2) {
            arr.set(k, ((T) R[j]));
            j++;
            k++;
        }
    }
    
}
