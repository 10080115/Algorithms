package Algorithms.Sorts;

/**
 * Created by bjlishiwei on 2016/2/17.
 */
public class QuickSort {

    static Comparable [] arr = {3, 5, 8, 4, 2, -2};

    private static int QuickSort(Comparable[] arr,int l,int r) {
       int i = l, j = r;

        Comparable temp = arr[i];

        while (i<j){

            while (i<j && SortUtil.less(temp,arr[j]))
                j--;

            if(i<j)
                arr[i++]=arr[j];

            while (i<j && SortUtil.less(arr[i],temp))
                i++;

            if(i<j)
                arr[j--]=arr[i];

        }

        arr[i] = temp;

        //记录插入的位置
        return i;
    }

    private static void Divide(Comparable arr[],int l,int r){

        if(l<r){
            int i = QuickSort(arr, l, r);
            Divide(arr, l, i - 1);
            Divide(arr,i+1,r);
        }

    }

    public static void main(String[] args) {
        Divide(arr, 0, arr.length - 1);
        SortUtil.show(arr);
    }
}
