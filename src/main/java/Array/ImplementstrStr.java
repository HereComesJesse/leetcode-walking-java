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
 * @date 2019/8/1823:15
 */
public class ImplementstrStr {
    public int strStr(String haystack,String needle){
        for (int i=0;;i++){
            for (int j=0;;j++){
                if(j==needle.length()){
                    return i;
                }
                if(i+j==haystack.length()){
                    return -1;
                }
                if(needle.charAt(j)!=haystack.charAt(i+j)){
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        String haystack="hello";
        String needle="ll";
        int output= new ImplementstrStr().strStr(haystack,needle);
        System.out.println(output);
    }
}
