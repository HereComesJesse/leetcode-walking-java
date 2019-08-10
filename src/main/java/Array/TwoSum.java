/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package Array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author zhangjundong
 * @date 2019/8/923:37
 */
public class TwoSum {

    /**
     * Description:
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * Solutions:
     * Time Complexity:O(n)    Space Complexity:O(n)
     * @param nums
     * @param target
     * @return
     */
    public int[] twosum(int[] nums,int target){
        HashMap<Integer,Integer> hashMap=new HashMap<Integer, Integer>();

        for(int i=0;i<nums.length;i++){
            Integer remain=target-nums[i];
            if(hashMap.containsKey(remain)){
                return new int[]{hashMap.get(remain),i};
            }
            hashMap.put(nums[i],i);
        }
        return null;
    }


    public static void main(String[] args) {
        int[] nums=new int[]{2,7,11,15};
        int target=9;
        int[] result= new TwoSum().twosum(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
