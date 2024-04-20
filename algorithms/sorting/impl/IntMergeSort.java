package algorithms.sorting.impl;

public class IntMergeSort {
    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l)/2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private void merge(int[] arr, int l, int m, int r) {
        int length1 = m - l + 1;
        int length2 = r - m;
        var L = new int[length1];
        var R = new int[length2];
        for (int i = 0; i < length1; i++) {
            L[i] = arr[l + i];
        }
        for (int i = 0; i < length1; i++) {
            R[i] = arr[m + 1 + i];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < length1 && j < length2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < length1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < length2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
