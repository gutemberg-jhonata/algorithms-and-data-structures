package algorithms.prefixsums;

import java.util.ArrayList;
import java.util.List;

public class PrefixSum {
    private List<Integer> prefix = new ArrayList<>();

    public PrefixSum(int[] nums) {
        int total = 0;
        for (int num: nums) {
            total += num;
            prefix.add(total);
        }
    }

    public int rangeSum(int L, int R) {
        int prefixLeft = L == 0 ? 0 : prefix.get(L - 1);
        int prefixRight = prefix.get(R);
        return prefixRight - prefixLeft;
    }
}