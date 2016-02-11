package Sorts;

/**
 * Created by lishiwei on 16/2/10.
 */

/**
 * 选择排序
 * 总共N个数字 进行N-1趟排序
 * 第i轮
 * 初始化min的位置为i
 * 一趟之后将最小的元素和第i个元素进行交换 确定第i个位置的元素
 * 每一轮确定一个元素的位置
 *
 * 特点
 * 运行时间和输入的数据无关
 * 数据的移动是最少的 只进行N次交换
 */
public class SelectSort {
    private static Comparable[] arr = {4, 3, 5, 1};

    public static void SelectSort(Comparable[] arr) {
        int N = arr.length;
        for (int i = 0; i < N - 1; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++)
                if (SortUtil.less(arr[j], arr[min])) min = j;
            SortUtil.exch(arr, i, min);

        }
    }

    public static void main(String[] args) {
        SelectSort(arr);
        SortUtil.show(arr);
    }
}
