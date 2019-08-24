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
 * @date 2019/8/247:43
 */
public class AddBinary {
    /**
     * Given two binary strings, return their sum (also a binary string).
     *
     * The input strings are both non-empty and contains only characters 1 or 0.
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a,String b){
        StringBuilder sb=new StringBuilder();
        int i=a.length()-1,j=b.length()-1,carry=0;
        while (i>=0||j>=0){
            int sum=carry;
            if(i>=0){
                sum+=a.charAt(i--)-'0';
            }if(j>=0){
                sum+=b.charAt(j--)-'0';
            }
            sb.append(sum % 2);
            carry=sum/2;
        }
        if(carry!=0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a="11";
        String b="1";
        String output= new AddBinary().addBinary(a,b);
        System.out.println(output);
    }

}
