package algorithms.sorting.impl;

public class IntQuickSort {
    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int l, int r) {
        if (l < r) {
            int left = l;
            int pivot = arr[r];
            for (int i = l; i < r; i++) {
                if (arr[i] < pivot) {
                    var tmp = arr[left];
                    arr[left] = arr[i];
                    arr[i] = tmp;
                    left++;
                }
            }
            arr[r] = arr[left];
            arr[left] = pivot;
            sort(arr, l, left - 1);
            sort(arr, left + 1, r);
        }
    }
}
