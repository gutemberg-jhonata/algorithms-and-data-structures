package algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

import algorithms.sorting.impl.QuickSort;

public class Main {
    public static void main(String[] args) {
        ListSorter<Integer> arraySorter = new QuickSort<>();
        List<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(40);
        array.add(20);
        array.add(5);
        array.add(30);
        array.add(50);
        System.out.println(array);
        arraySorter.sort(array);
        System.out.println(array);
    }
}
