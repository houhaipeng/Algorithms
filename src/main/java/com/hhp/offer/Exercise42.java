package com.hhp.offer;

/**
 * 剑指 Offer 42. 连续子数组的最大和
 * 题目：输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * 要求时间复杂度为O(n)。
 *
 * 示例1:
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 * 动态规划:
 */
public class Exercise42 {

    public int maxSubArray(int[] nums) {
        //状态定义：设动态规划列表dp，dp[i]代表以元素nums[i]为结尾的连续子数组最大和。
        //初始状态
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            //转移方程
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }
}
