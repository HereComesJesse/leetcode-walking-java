/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package Easy;

import java.util.HashMap;

/**
 * @author zhangjundong
 * @date 2019/8/1223:13
 */
public class RomanToInteger {

    /**
     * Description:
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     *
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
     *
     * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
     *
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
     *
     * Solutions
     * Time Complexity:O(n)    Space Complexity:O(1)
     * @param s
     * @return
     */
    public int RomanToInt(String s){
        if(s==null || s.length()==0){
            return -1;
        }
        HashMap<Character,Integer> hashMap=new HashMap<Character, Integer>();
        hashMap.put('I',1);
        hashMap.put('V',5);
        hashMap.put('X',10);
        hashMap.put('L',50);
        hashMap.put('C',100);
        hashMap.put('D',500);
        hashMap.put('M',1000);
        int len=s.length();
        int result=hashMap.get(s.charAt(len-1));
        for (int i=len-2;i>=0;i--){
            if(hashMap.get(s.charAt(i))>=hashMap.get(s.charAt(i+1))){
                result+=hashMap.get(s.charAt(i));
            }
            else{
                result-=hashMap.get(s.charAt(i));
            }
        }
        return result;
    }



    public static void main(String[] args) {
        String input="III";
        int output=new RomanToInteger().RomanToInt(input);
        System.out.println(output);
    }
}
