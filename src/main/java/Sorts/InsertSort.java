package Sorts;

/**
 * Created by lishiwei on 16/2/11.
 */
public class InsertSort {
    static Comparable[] arr = {3, 5, 8, 4, 2, -2};

    private static void InsertSort(Comparable[] arr) {
        int N = arr.length;
        for (int i = 1; i < N; i++) {
            //记录插入的位置
            for (int j = i; j > 0 && SortUtil.less(arr[j], arr[j - 1]); j--)
                SortUtil.exch(arr, j, j - 1);
        }
    }

    public static void main(String[] args) {
        InsertSort(arr);
        SortUtil.show(arr);
    }
}
