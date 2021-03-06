package com.hhp.offer;

/**
 * 剑指 Offer 46. 把数字翻译成字符串
 * 题目：给定一个数字，我们按照如下规则把它翻译为字符串：
 * 0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。
 * 一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 *
 * 示例 1:
 * 输入: 12258
 * 输出: 5
 * 解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
 *
 * 动态规划
 * 1.
 */
public class Exercise46_2 {

    public int translateNum(int num) {
        String s = String.valueOf(num);
        //a代表dp[i-1],b代表dp[i-2]
        //初始dp[0]=1,dp[1]=1
        int a = 1, b = 1;
        for (int i = 2; i <= s.length(); i++) {
            String tmp = s.substring(i - 2, i);
            //递推,c=dp[i-1]或c=dp[i-1] + dp[i-2]
            int c = tmp.compareTo("10") >= 0 && tmp.compareTo("25") <= 0 ? a + b : a;
            //递推后移
            b = a;
            a = c;
        }
        return a;
    }
}

