package com.hhp.offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 剑指 Offer 37. 序列化二叉树
 * 题目：请实现两个函数，分别用来序列化和反序列化二叉树。
 *
 * 你需要设计一个算法来实现二叉树的序列化与反序列化。
 * 这里不限定你的序列 / 反序列化算法执行逻辑，
 * 你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
 *
 *     1
 *    / \
 *   2   3
 *     /  \
 *    4    5
 * 输入：root = [1,2,3,null,null,4,5]
 * 输出：[1,2,3,null,null,4,5]
 *
 * Your Codec object will be instantiated and called as such:
 * Exercise37 codec = new Exercise();
 * codec.deserialize(codec.serialize(root));
 */
public class Exercise37 {

    // Encodes a tree to a single string.
    //序列化
    public String serialize(TreeNode root) {
        if (root == null) return "[]";
        StringBuilder res = new StringBuilder("[");
        //双花括号里面就是可以直接调用其对象里面的内部方法来初始化
        Queue<TreeNode> queue = new LinkedList<TreeNode>() {{ add(root);}};
        while (!queue.isEmpty()) {
            //pop（）函数和poll（）函数都是从首位置取元素并删除；
            //区别在于，pop遇到null会报异常。poll遇到null会返回null。
            TreeNode node = queue.poll();
            if (node != null) {
                res.append(node.val + ",");
                queue.add(node.left);
                queue.add(node.right);
            } else {
                res.append("null,");
            }
        }
        res.deleteCharAt(res.length() - 1);
        res.append("]");
        return res.toString();
    }

    // Decodes your encoded data to tree.
    //反序列化
    public TreeNode deserialize(String data) {
        if (data.equals("[]")) return null;
        //去除"[a,...,n]"的中括号[]
        String[] vals = data.substring(1, data.length() - 1).split(",");
        //根节点=层序遍历的第一个节点
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        Queue<TreeNode> queue = new LinkedList<TreeNode>() {{add(root);}};
        int i = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (!vals[i].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.left);
            }
            i++;
            if (!vals[i].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.right);
            }
            i++;
        }
        return root;
    }
}
