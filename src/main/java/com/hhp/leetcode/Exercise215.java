package com.hhp.leetcode;

import java.util.Random;

/**
 * 215. 数组中的第K个最大元素
 * 题目：给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
 * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 */
public class Exercise215 {

    public int findKthLargest(int[] nums, int k) {

        int len = nums.length;
        int left = 0;
        int right = len - 1;
        //转换一下，第k大元素的索引是len - k
        int target = len - k;
        while (true) {
            int index = partition(nums, left, right);
            if (index == target) return nums[target];
            else if (index < target) left = index + 1;
            else right = index - 1;
        }
    }

    public int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        int j = left;
        for (int i = left + 1; i <= right ; i++) {
            if (nums[i] < pivot) {
                //小于pivot的元素都被交换到前面
                j++;
                swap(nums, j, i);
            }
        }
        swap(nums, j, left);
        return j;
    }
    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
