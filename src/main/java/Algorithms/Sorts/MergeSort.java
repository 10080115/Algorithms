package Algorithms.Sorts;

/**
 * Created by lishiwei on 16/2/12.
 */
public class MergeSort {
    private static Comparable arr[] = {2, 1, 3, 4, 5, 6, 7, 8, 10, 9, 11, 12, 13, 14, 15, 16};

    private static Comparable aux[] = new Comparable[16];

    private static void Sort(int lo, int hi) {
        if (hi <= lo) return;
        int mid = (hi + lo) / 2;
        Sort(lo, mid);
        Sort(mid + 1, hi);
        Merge(lo, mid, hi);
    }

    private static void Merge(int lo, int mid, int hi) {
        int i = lo, j = mid + 1;

        for (int k = lo; k <= hi; k++)
            aux[k] = arr[k];


        for (int k = lo; k <= hi; k++) {
            if (i > mid) arr[k] = aux[j++];
            else if (j > hi) arr[k] = aux[i++];
            else if (SortUtil.less(arr[j], arr[i])) arr[k] = aux[j++];
            else arr[k] = arr[i++];

        }
    }

    public static void main(String[] args) {
        Sort(0, arr.length - 1);
        System.out.println(SortUtil.isSorted(arr));
    }
}
