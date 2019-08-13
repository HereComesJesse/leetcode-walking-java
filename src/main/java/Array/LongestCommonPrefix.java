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
 * @date 2019/8/139:10
 */
public class LongestCommonPrefix {

    /**
     * Description:
     * Write a function to find the longest common prefix string amongst an array of strings.
     * If there is no common prefix, return an empty string "".
     *
     * Solutions:
     * Time Complexity:O(S)  Space Complexity:O(1)
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs){
        if(strs.length==0){
            return "";
        }
        String prefix=strs[0];
        for (String input : strs){
            while (input.indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] str=new String[]{"flower","flow","flight"};
        String output=new LongestCommonPrefix().longestCommonPrefix(str);
        System.out.println(output);
    }
}
