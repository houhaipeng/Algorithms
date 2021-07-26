package com.hhp.leetcode;

/**
 * 62. 不同路径
 * 题目：一个机器人位于一个m x n网格的左上角 （起始点在下图中标记为 “Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
 * 问总共有多少条不同的路径？
 *
 * 示例 1：
 * 输入：m = 3, n = 7
 * 输出：28
 *
 * 动态规划
 * 可优化
 */
public class Exercise62_1 {

    public int uniquePaths(int m, int n) {

        int[][] f = new int[m][n];

        //为了方便代码编写，我们可以将所有的 f(0, j)f(0,j) 以及 f(i, 0)f(i,0) 都设置为边界条件，它们的值均为 1.
        for (int i = 0; i < m; ++i) {
            f[i][0] = 1;
        }
        for (int j = 0; j < n; ++j) {
            f[0][j] = 1;
        }
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                f[i][j] = f[i - 1][j] + f[i][j - 1];
            }
        }
        return f[m - 1][n - 1];
    }
}
