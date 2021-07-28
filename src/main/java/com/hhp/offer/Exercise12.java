package com.hhp.offer;

/**
 * 剑指 Offer 12. 矩阵中的路径
 * 题目：给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。
 * 如果 word 存在于网格中，返回 true ；否则，返回 false 。
 *
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，
 * 其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 *
 *  深度优先搜索（DFS）+ 剪枝
 */
public class Exercise12 {

    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        //起点是所有的board中的元素
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, words, i, j, 0)) return true;
            }
        }
        return false;
    }

    //当前元素在矩阵 board 中的行列索引 i 和 j ，当前目标字符在 word 中的索引 k
    boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        //剪枝
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k])
            return false;
        if (k == word.length - 1) return true;
        //此时说明board[i][j] == word[k]且未越界，用空格标记'\0'
        board[i][j] = '\0';
        //此时传入的board是已被标记的
        boolean res = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1) ||
                      dfs(board, word, i , j + 1, k + 1) || dfs(board, word, i , j - 1, k + 1);
        //还原初始值
        board[i][j] = word[k];
        return res;
    }
}
