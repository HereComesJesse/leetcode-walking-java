/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhangjundong
 * @date 2019/8/2319:34
 */
public class PlusOne {
    /**
     * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
     *
     * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
     *
     * You may assume the integer does not contain any leading zero, except the number 0 itself.
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits){
        int n=digits.length;
        for (int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newNumber=new int[n+1];
        newNumber[0]=1;
        return newNumber;
    }

    public static void main(String[] args) {
        int[] input=new int[]{8,9};
        int[] output= new PlusOne().plusOne(input);
    }
}
