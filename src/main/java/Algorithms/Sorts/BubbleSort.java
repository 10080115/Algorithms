package Algorithms.Sorts;

/**
 * Created by lishiwei on 16/2/11.
 */

public class BubbleSort {
    private static Comparable[] arr = {8,5,3,8,9};

    private static void BubbleSort(Comparable[] arr) {
        int N = arr.length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++)
                if (SortUtil.less(arr[j + 1], arr[j])) SortUtil.exch(arr, j + 1, j);
        }
    }

    //某一趟没有进行排序 就不进入排序了
    private static void BubbleSort2(Comparable[] arr) {
        int N = arr.length;
        boolean flag = true;
        int k = N-1;
        while (flag){
            flag = false;
            for(int i = 0;i<k;i++){
                if (SortUtil.less(arr[i + 1], arr[i])) {
                    SortUtil.exch(arr, i + 1, i);
                    flag = true;
                }
            }
            k--;
        }
    }
    //记录最后一次交换的位置
    private static void BubbleSort3(Comparable[] arr) {
        int N = arr.length;
        int  flag = N;
        while (flag>0){
            flag = 0;
            for(int i = 0;i<N-1;i++){
                if (SortUtil.less(arr[i + 1], arr[i])) {
                    SortUtil.exch(arr, i + 1, i);
                    flag = i+1;
                }
            }
            N--;
        }
    }
    public static void main(String[] args) {
        BubbleSort3(arr);
        SortUtil.show(arr);
    }
}
