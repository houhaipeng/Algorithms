package com.hhp.offer;

/**
 * 剑指 Offer 33. 二叉搜索树的后序遍历序列
 * 题目：输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。
 * 如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
 *
 * 参考以下这颗二叉搜索树：
 *
 *      5
 *     / \
 *    2   6
 *   / \
 *  1   3
 * 示例 1：
 * 输入: [1,6,3,2,5]
 * 输出: false
 * 示例 2：
 * 输入: [1,3,2,6,5]
 * 输出: true
 *
 * 方法：递归分治
 */
public class Exercise33 {

    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }

    private boolean recur(int[] postorder, int i, int j) {
        //说明此子树节点数量<=1
        if (i >= j) return true;
        int p = i;
        //postorder[j]为根节点
        while (postorder[p] < postorder[j]) p++;
        //此时postorder[m] > 根节点
        int m = p;
        //p继续向后移，检查后面的数是否 > 根节点
        while (postorder[p] > postorder[j]) p++;
        //当p == j时，说明m后面的数均 > 根节点
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }
}
