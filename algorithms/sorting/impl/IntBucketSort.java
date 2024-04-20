package algorithms.sorting.impl;

public class IntBucketSort {
    public void sort(int arr[]) {
        var count = new int[100];
        for (int num: arr) {
            count[num]++;
        }
        int i = 0;
        for (int n = 0; n < count.length; n++) {
            int j = count[n];
            while (j > 0) {
                arr[i] = n;
                i++; 
                j--;
            }
        }
    }
}
