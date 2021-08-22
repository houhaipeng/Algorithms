package com.hhp.offer;

/**
 * 剑指 Offer 51. 数组中的逆序对
 * 题目：在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组，求出这个数组中的逆序对的总数。
 *
 * 示例 1:
 * 输入: [7,5,6,4]
 * 输出: 5
 *
 *
 * 归并排序
 */
public class Exercise51 {

    int[] nums, tmp;

    public int reversePairs(int[] nums) {


    }

    private int mergeSort(int l, int r) {
        //终止条件
        if (l >= r) return 0;
        //递归划分
        int m = (l + r) / 2;
        int res = mergeSort(l, m) + mergeSort(m + 1, r);
        //合并阶段
        int i = l, j = m + 1;
        //将nums数组的元素复制到tmp数组中
        for (int k = 1; k <= r; k++)
            tmp[k] = nums[k];
        
    }
}
