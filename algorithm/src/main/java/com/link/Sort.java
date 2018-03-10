package com.link;

import org.junit.Test;

public class Sort {

    private final int[] Arr = new int[]{40,1,6,3,643,23,532,124,7,2,432,345,23,12};
    

    @Test
    public void test(){
        quickSort(Arr, 0, Arr.length-1);
        for (int i:Arr) {
            System.out.print(i + ",");
        }
    }

    /**
     * 快速排序
     * 思路：选定一个中间值 将大小数分两边 不断递归到结束
     * 优化点：1，如何选中间值 2，数组长度较短时考虑冒泡
     * @param arr
     */
    public void quickSort(int[] arr, int low, int high){
        if (low>=high) return;
        int mid = separateWithMid(arr, low, high);
        quickSort(arr, low, mid-1);
        quickSort(arr, mid+1, high);

    }

    public int separateWithMid(int[] arr, int low, int high){
        int mid = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= mid){
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= mid){
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = mid;
        return low;
    }
}
