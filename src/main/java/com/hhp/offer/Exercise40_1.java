package com.hhp.offer;

import java.util.Arrays;

/**
 * 剑指 Offer 40. 最小的k个数
 * 题目：输入整数数组 arr ，找出其中最小的 k 个数。
 * 例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 *
 *  快速排序
 *
 */
public class Exercise40_1 {

    public int[] getLeastNumbers(int[] arr, int k) {
        quickSort(arr, 0, arr.length);
        return Arrays.copyOf(arr, k);
    }

    private void quickSort(int[] arr, int l, int r) {
        //子数组长度为1时终止递归
        if (l >= r) return;
        //哨兵划分操作（以arr[l]为基准）
        int i = l, j = r;
        //跳出循环后，i==j
        while (i < j) {
            //此处必须是先j,后i(如果基准是arr[r],则必须是先i,后j)
            //从右向左，找到一个比基准arr[1]小的
            while (i < j && arr[j] >= arr[l]) j--;
            //从左向右找到一个比基准arr[1]大的，
            while (i < j && arr[i] <= arr[l]) i++;
            //
            swap(arr, i, j);
            //
        }
        //此时i==j,与基准交换
        swap(arr, i, l);
        quickSort(arr, l, i - 1);
        quickSort(arr, i + 1, r);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
