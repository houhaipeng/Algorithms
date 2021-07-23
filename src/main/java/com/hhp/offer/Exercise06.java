package com.hhp.offer;


import java.util.ArrayList;
import java.util.List;

/**
 * 从尾到头打印链表
 *
 * 题目描述:输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 * 示例：
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 *
 * 限制：
 * 0 <= 链表长度 <= 10000
 */
public class Exercise06 {

    List<Integer> tmp = new ArrayList<Integer>();

    public int[] reversePrint(ListNode head) {
        recur(head);
        int[] res = new int[tmp.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = tmp.get(i);
        }
        return res;
    }

    void recur(ListNode head) {
        if (head == null) return;
        recur(head.next);
        tmp.add(head.val);
    }
}

// Definition for singly-linked list.
/*class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}*/
