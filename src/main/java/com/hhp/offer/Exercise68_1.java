package com.hhp.offer;

/**
 * 剑指 Offer 68 - I. 二叉搜索树的最近公共祖先
 * 题目：给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 *
 * 最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，
 * 满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。
 *
 * 迭代
 */
public class Exercise68_1 {

    //迭代：每一次迭代的结果会作为下一次迭代的初始值
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        while (root != null) {
            //p,q都在root的右子树中
            if (root.val < p.val && root.val < q.val)
                //遍历至右子节点
                root = root.right;
            //p,q都在root的左子树中
            else if (root.val > p.val && root.val > q.val)
                //遍历至左子节点
                root = root.left;
            else break;
        }
        return root;
    }
}
