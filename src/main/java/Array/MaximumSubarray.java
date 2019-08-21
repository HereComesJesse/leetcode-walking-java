/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package Array;

/**
 * @author zhangjundong
 * @date 2019/8/2123:23
 */
public class MaximumSubarray {

    /**
     * Description:
     * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
     *
     * Solutions:
     * Time Complexity:O(n)    Space Complexity:O(1)
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums){
        int len=nums.length;
        int[] dp=new int[len];
        dp[0]=nums[0];
        int max=dp[0];
        for (int i=1;i<len;i++){
            dp[i]=nums[i]+(dp[i-1]>0?dp[i-1]:0);
            max=Math.max(max,dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] input=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int output= new MaximumSubarray().maxSubArray(input);
        System.out.println(output);
    }
}
