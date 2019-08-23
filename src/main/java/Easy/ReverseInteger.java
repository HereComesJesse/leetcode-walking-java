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
 * @date 2019/8/1023:46
 */
public class ReverseInteger {

    /**
     * Description:
     * Given a 32-bit signed integer, reverse digits of an integer.
     * Solutions:
     * Time Complexity:O(log(x))    Space comPlexity:O(1)
     * @param x
     * @return
     */
    public int reverse(int x){
        int result=0;
        while (x!=0){
            int mid= x % 10;
            x /= 10;
            if(result>Integer.MAX_VALUE /10 || (result==Integer.MAX_VALUE/10 && mid>7)){
                return 0;
            }
            if(result<Integer.MIN_VALUE /10 || (result==Integer.MIN_VALUE/10 && mid<-8 )){
                return 0;
            }
            result=result * 10 +mid;
        }
        return result;
    }

    public static void main(String[] args) {
        int input=1534236469;
        int output= new ReverseInteger().reverse(input);
        System.out.println(output);
    }
}
