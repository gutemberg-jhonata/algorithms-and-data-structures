package algorithms.sorting.impl;

public class IntBucketSort {
    public void sort(int arr[]) {
        var count = new int[100];
        for (int num: arr) {
            count[num]++;
        }
        int i = 0;
        for (int n = 0; n < count.length; n++) {
            for (int j = 0; j < count[n]; j++) {
                arr[i] = n;
                i++;
            }
        }
    }
}
