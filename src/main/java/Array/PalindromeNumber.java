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
 * @date 2019/8/1123:45
 */
public class PalindromeNumber {

    /**
     * Description:
     * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
     * Time Complexity:O(lg(n))    Space Complexity:O(1)
     * @param x
     * @return
     */
    public boolean isPalindrome(int x){
        if(x<0 || (x%10==0 && x!=0)){
            return  false;
        }
        int result=0;
        while (x>result){
            result=result*10+x%10;
            x=x/10;
        }
        return x==result || x==result/10;
    }

    public static void main(String[] args) {
        int x=121;
        Boolean output= new PalindromeNumber().isPalindrome(x);
    }
}
