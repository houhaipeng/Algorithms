package com.hhp.offer;

/**
 * 剑指 Offer 63. 股票的最大利润
 * 题目：假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 *
 * 示例 1:
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 *
 * 示例 2:
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 *
 * 动态规划
 */
public class Exercise63 {

    public int maxProfit(int[] prices) {
        //边界条件
        int cost = Integer.MAX_VALUE;
        int profit = 0;
        for (int price : prices) {
            //递推公式：dp[i]=max(dp[i−1],prices[i]−min(prices[0:i]))
            //说明：前i天的最大利润=max(前i-1天的最大利润,第i天买入时的最大利润(当cost最低时满足))
            cost = Math.min(cost, price);
            profit = Math.max(profit, price - cost);
        }
        return profit;
    }
}
