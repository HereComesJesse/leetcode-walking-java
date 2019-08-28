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
 * @date 2019/8/2821:45
 */
public class MergeSortedArray {
    
    /**
     * Description:
     * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
     *
     * Note:
     *
     * The number of elements initialized in nums1 and nums2 are m and n respectively.
     * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1,int m,int[] nums2,int n){
        int i=m-1,j=n-1,k=m+n-1;
        while (i>=0 && j>=0){
            nums1[k--]=nums1[i]>nums2[j]?nums1[i--]:nums2[j--];
        }
        while (j>=0){
            nums1[j]=nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] num1=new int[]{1,2,3,0,0,0};
        int[] num2=new int[]{2,5,6};
        new MergeSortedArray().merge(num1,3,num2,3);
    }
}
