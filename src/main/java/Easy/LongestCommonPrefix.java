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

        String[] str1=new String[]{"flower","","flight"};
        String output1=new LongestCommonPrefix().longestCommonPrefix1(str1);
        System.out.println(output1);
    }

    public String longestCommonPrefix1(String[] strs){
        if(strs==null || strs.length==0){
            return "";
        }
        for (int i=0;i<strs[0].length();i++){
            char prefix=strs[0].charAt(i);
            for (int j=1;j<strs.length;j++){
                if(strs[j].length()==i || strs[j].charAt(i)!=prefix){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
