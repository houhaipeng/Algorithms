package com.hhp.offer;

/**
 * 11. 盛最多水的容器
 * 题目：给你 n 个非负整数 a[1]，a[2]，...，a[n]，每个数代表坐标中的一个点(i,a[i])。
 * 在坐标内画 n 条垂直线，垂直线 i的两个端点分别为(i,a[i]) 和 (i, 0) 。
 * 找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
 *
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 * 解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。
 * 在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为49。
 *
 * 双指针
 */
public class Exercise11 {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, res = 0;
        while (i < j) {
            //将短板往中间移动
            res  = height[i] < height[j] ?
                    Math.max(res, (j - i) * height[i++]):
                    Math.max(res, (j - i) * height[j--]);
        }
        return res;
    }
}
