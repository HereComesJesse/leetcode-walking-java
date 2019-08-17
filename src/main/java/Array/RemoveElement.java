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
 * @date 2019/8/1723:44
 */
public class RemoveElement {
    /**
     * Description:
     * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
     *
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
     *
     * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
     *
     * Solutions:
     * Time Complexity:O(n)    Space Complexity:O(1)
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums,int val){
        int i=0;
        for (int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }

    public int removeElement1(int[] nums,int val){
        int i=0;
        int n=nums.length;
        while (i<n){
            if(nums[i]==val){
                nums[i]= nums[n-1];
                n--;
            }
            else{
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] input=new int[]{3,2,3,2};
        int val=3;
        int result= new RemoveElement().removeElement(input,val);
        System.out.println(result);
    }
}
