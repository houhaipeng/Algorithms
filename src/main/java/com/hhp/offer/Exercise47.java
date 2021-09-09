package com.hhp.offer;

/**
 * 剑指 Offer 47. 礼物的最大价值
 * 题目：在一个 m*n 的棋盘的每一格都放一个礼物，每个礼物都有一定的价值（价值大于 0）。
 * 你可以从棋盘的左上角开始拿格子里的礼物，并每次向右或者向下移动一格、直到到达棋盘的右下角。
 * 给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？
 *
 * 示例 1:
 *
 * 输入:
 * [
 *  [1,3,1],
 *  [1,5,1],
 *  [4,2,1]
 * ]
 * 输出: 12
 * 解释: 路径 1→3→5→2→1 可以拿到最多价值的礼物
 *
 * 动态规划
 *
 */
public class Exercise47 {

    public int maxValue(int[][] grid) {
        //获取二维数组的长和宽
        int m = grid.length, n = grid[0].length;
        //初始化二维矩阵的第一行
        for (int j = 1; j < n; j++)
            grid[0][j] += grid[0][j - 1];
        //初始化二维矩阵的第一列
        for (int i = 1; i < m; i++)
            grid[i][0] += grid[i - 1][0];
        //从左到右，从上到下依次递推计算每个格子的最大价值礼物
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                grid[i][j] = Math.max(grid[i - 1][j], grid[i][j - 1]);
        //返回右下角的格子的最大价值
        return grid[m - 1][n - 1];
    }
}
