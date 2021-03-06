package com.hhp.offer;

/**
 * 替换空格
 *
 * 题目描述：请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 *
 * 示例：
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 *
 * 限制：0 <= s 的长度 <= 10000
 */
public class Exercise05 {

    public static void main(String[] args) {

    }

    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' ') sb.append("%20");
            else sb.append(c);
        }
        return sb.toString();
    }
}
