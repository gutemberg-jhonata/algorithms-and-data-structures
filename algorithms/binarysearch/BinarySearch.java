package algorithms.binarysearch;

public class BinarySearch {
    
    public int find(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (target > arr[m]) {
                l = m + 1;
            } else if (target < arr[m]) {
                r = m - 1;
            } else {
                return m;
            }
        }
        return -1;
    }

}
