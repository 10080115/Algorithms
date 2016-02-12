package Sorts;

/**
 * Created by lishiwei on 16/2/11.
 */

public class BubbleSort {
    private static Comparable[] arr = {3, 5, 8, 4, 2, -2};

    private static void SelectSort(Comparable[] arr) {
        int N = arr.length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++)
                if (SortUtil.less(arr[j + 1], arr[j])) SortUtil.exch(arr, j + 1, j);
        }
    }

    public static void main(String[] args) {
        SelectSort(arr);
        SortUtil.show(arr);
    }
}
