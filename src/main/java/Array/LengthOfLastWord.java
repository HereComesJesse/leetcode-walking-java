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
 * @date 2019/8/2220:33
 */
public class LengthOfLastWord {
    /**
     * Description:
     * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
     *
     * If the last word does not exist, return 0.
     *
     * Note: A word is defined as a character sequence consists of non-space characters only.
     * @param s
     * @return
     */
    public int LengthOfLastWord(String s){
        return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }

    public static void main(String[] args) {
        String input="Hello world";
        int output= new LengthOfLastWord().LengthOfLastWord(input);
        System.out.println(output);
    }
}
