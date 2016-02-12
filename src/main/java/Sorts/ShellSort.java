package Sorts;

/**
 * Created by lishiwei on 16/2/12.
 */
public class ShellSort {
    static private Comparable arr[] = {4, 3, 5, 1, 9, 2, 15, -4};

    private static void Sort(Comparable[] arr) {
        int N = arr.length;
        int h = 1;
        while (h < N / 3)
            h = 3 * h + 1;
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && SortUtil.less(arr[j], arr[j - h]); j -= h) {
                    SortUtil.exch(arr, j, j - h);
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        Sort(arr);
        SortUtil.show(arr);
    }
}
