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
 * @date 2019/8/2523:38
 */
public class SqrtX {
    /**
     * Description:
     * Implement int sqrt(int x).
     *
     * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
     *
     * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
     * @param x
     * @return
     */
    public int mySqrt(int x){
        long r=x;
        while (r*r>x){
            r=(r+x/r)/2;
        }
        return (int)r;
    }

    public static void main(String[] args) {
        int x=2147483647;
        int output= new SqrtX().mySqrt(x);
        System.out.println(output);
    }
}
