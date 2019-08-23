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
 * @date 2019/8/1923:12
 */
public class SearchInsertPosition {
    /**
     * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
     *
     * You may assume no duplicates in the array.
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums,int target){
        if(nums==null || nums[0]>target){
            return 0;
        }
       for (int i=0;i<nums.length;i++){
           if(nums[i]==target || nums[i]>target){
               return i;
           }
       }
       return nums.length;
    }

    public static void main(String[] args) {
        int[] input=new int[]{1,3,5,6};
        int target=2;
        int output= new SearchInsertPosition().searchInsert(input,target);
        System.out.println(output);
    }
}
