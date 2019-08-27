/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package Easy;

/**
 * @author zhangjundong
 * @date 2019/8/2619:50
 */
public class ClimbingStairs {
    /**
     * Dynamic Programming 动态规划
     * Description:
     * You are climbing a stair case. It takes n steps to reach to the top.
     *
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     *
     * Note: Given n will be a positive integer.
     *
     * Time Complexity:O(n)    Space Complexity:O(n)
     * @param n
     * @return
     */
    public int climbStairs(int n){
        if(n==1){
            return 1;
        }
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for (int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    /**
     * Time Complexity:O(n)    Space Complexity:O(1)
     * @param n
     * @return
     */
    public int climbStairs1(int n){
        if(n==1){
            return 1;
        }
        int first=1;
        int second=2;
        for (int i=3;i<=n;i++){
            int third=first+second;
            first=second;
            second=third;
        }
        return second;
    }

    public static void main(String[] args) {
        int input=3;
        int output= new ClimbingStairs().climbStairs(input);
        System.out.println(output);
    }
}
