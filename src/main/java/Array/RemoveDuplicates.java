/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author zhangjundong
 * @date 2019/8/1623:20
 */
public class RemoveDuplicates {
    /**
     * Description:
     * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
     *
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
     * Solutions:
     * Time Complexity:O(n)    Space Complexity:O(1)
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums){
        if(nums.length==0){
            return 0;
        }
        int i=0;
        for (int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,1,2};
        int result= new RemoveDuplicates().removeDuplicates(nums);
        System.out.println(result);
    }
}
