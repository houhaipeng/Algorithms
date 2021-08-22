package com.hhp.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 48. 最长不含重复字符的子字符串
 * 题目：请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 *
 * 示例 1:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是"wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke"是一个子序列，不是子串。
 *
 * 1. 动态规划+哈希表
 * 2. 动态规划+线性遍历
 */
public class Exercise48 {

    public int lengthOfLongestSubstring(String s) {
        //各字符最后一次出现的索引位置
        Map<Character, Integer> dic = new HashMap<Character, Integer>();
        int res = 0, tmp = 0;
        for (int j = 0; j < s.length(); j++) {
            //获取索引i
            int i = dic.getOrDefault(s.charAt(j), -1);
            //更新哈希表
            dic.put(s.charAt(j), j);
            //dp[j - 1] -> dp[j]
            tmp = tmp < j - i ? tmp + 1 : j - i;
            //res与dp[j]
            res = Math.max(res, tmp);
        }
        return res;
    }
}
