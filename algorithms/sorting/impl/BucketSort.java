package algorithms.sorting.impl;

import java.util.List;

public class BucketSort {

    public void sort(List<Integer> arr) {
        var count = new int[51];
        for (int num: arr) {
            count[num]++;
        }
        int i = 0;
        for (int n = 0; n < count.length; n++) {
            for (int j = 0; j < count[n]; j++) {
                arr.set(i, n);
                i++;
            }
        }
    }
    
}
