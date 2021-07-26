package com.hhp.leetcode;

/**
 * 98. 验证二叉搜索树
 * 题目：给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 * 假设一个二叉搜索树具有如下特征：
 *      节点的左子树只包含小于当前节点的数。
 *      节点的右子树只包含大于当前节点的数。
 *      所有左子树和右子树自身必须也是二叉搜索树。
 *
 * 示例 1:
 * 输入:
 *     2
 *    / \
 *   1   3
 * 输出: true
 *
 * 示例2:
 * 输入:
 *     5
 *    / \
 *   1   4
 *      / \
 *     3   6
 * 输出: false
 * 解释: 输入为: [5,1,4,null,null,3,6]。
 *     根节点的值为 5 ，但是其右子节点值为 4 。
 *
 * 方法二：中序遍历
 * 方法一中提及的性质，我们可以进一步知道二叉搜索树「中序遍历」得到的值构成的序列一定是升序的
 */
public class Exercise98_2 {
    long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        //访问左子树
        if (!isValidBST(root.left)) return false;
        //判断当前节点是否
        if (root.val <= pre) return false;
        //将pre修改为当前值，故pre是递增的
        pre = root.val;
        //访问右子树，此时pre修改为root.right的值
        return isValidBST(root.right);
    }

}
