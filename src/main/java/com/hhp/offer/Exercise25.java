package com.hhp.offer;

/**
 * 剑指 Offer 25. 合并两个排序的链表
 * 题目：输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 *
 * 示例1：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 *  双指针
 */
public class Exercise25 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //伪节点先设置为一个值为零的节点
        ListNode dum = new ListNode(0), cur = dum;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            //cur后移
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return dum.next;
    }
}
