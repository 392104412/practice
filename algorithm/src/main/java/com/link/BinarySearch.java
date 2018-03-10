package com.link;

import org.junit.Test;

/**
 * 二分法检索
 */
public class BinarySearch {

    private final int[] NUM = new int[]{1,4,6,8,10};

    @Test
    public void testSearch(){
        System.out.println(getIndexes(10));
    }

    public int getIndexes(int num){
        return getIndexes(num, NUM);
    }

    public int getIndexes(int num, int[] sortedArr){
        assert sortedArr != null : "array can not be null";
        int low = 0;
        int high = sortedArr.length-1;
        while (low <= high){
            int mid = (low+high)/2;
            if (num == sortedArr[mid]) {
                return mid;
            } else if (num > sortedArr[mid]) {
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }
        return -1;
    }
}
