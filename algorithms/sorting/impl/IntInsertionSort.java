package algorithms.sorting.impl;

public class IntInsertionSort {
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            while (j >= 0 && arr[j + 1] < arr[j]) {
                var tmp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = tmp;
                j--;
            }
        }
    }
}