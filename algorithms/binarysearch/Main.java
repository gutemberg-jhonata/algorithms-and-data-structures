package algorithms.binarysearch;

public class Main {

    public static void main(String[] args) {
        var arr = new int[]{5, 10, 15, 30, 35, 40, 55, 60};
        var finder = new BinarySearch();
        System.out.println(finder.find(arr, 2));
    }

}
