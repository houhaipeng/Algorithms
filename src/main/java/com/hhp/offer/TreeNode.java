package com.hhp.offer;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    //无参构造器
    TreeNode() {}
    TreeNode(int x) {
        val = x;
    }
    //全参构造器
    TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
