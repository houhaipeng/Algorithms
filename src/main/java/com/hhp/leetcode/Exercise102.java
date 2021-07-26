package com.hhp.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import com.sun.jmx.remote.internal.ArrayQueue;

/**
 * 102. 二叉树的层序遍历
 * 题目：给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 *
 * 示例：
 * 二叉树：[3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层序遍历结果：
 *
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 *
 * BFS
 */
public class Exercise102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        //双端队列
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        //
        if (root != null) queue.add(root);
        while (!queue.isEmpty()) {
            //队列长度
            int n = queue.size();
            List<Integer> level = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if ()
            }
        }
    }
}
