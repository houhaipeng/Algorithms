package com.hhp.offer;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.Test;
/**
 * 剑指 Offer 38. 字符串的排列
 * 题目：输入一个字符串，打印出该字符串中字符的所有排列。你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
 * 示例：
 *      输入：s = "abc"
 *      输出：["abc","acb","bac","bca","cab","cba"]
 * 限制：
 *      1 <= s 的长度 <= 8
 */
public class Exercise38 {

    List<String> res = new LinkedList<String>();
    char[] c;

    @Test
    public void test() {
        String s = "abcd";
        String[] permutation = permutation(s);
        for (int i = 0; i < permutation.length; i++) {
            System.out.println(permutation[i]);
        }
    }
    //s=abc
    public String[] permutation(String s) {
        c = s.toCharArray();//c={'a','b','c'}
        dfs(0);
        return res.toArray(new String[res.size()]);
    }

    void dfs(int x) {
        if (x == c.length - 1) {
            res.add(String.valueOf(c));
            return;
        }
        Set<Character> set = new HashSet<Character>();
        //x=0,c={a,b,c}
        for (int i = x; i < c.length; i++) {
            if (set.contains(c[i])) continue;
            set.add(c[i]);
            //交换，将c[i]固定在第x位
            swap(i, x);
            //开始固定第x+1位字符
            dfs(x + 1);
            //恢复交换,此处要保证c的顺序还是{a,b,c},便于下次循环使用
            swap(i, x);
        }
    }

    void swap(int a, int b) {
        char tmp = c[a];
        c[a] = c[b];
        c[b] = tmp;
    }
}
