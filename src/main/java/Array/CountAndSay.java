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
 * @date 2019/8/2023:15
 */
public class CountAndSay {
    public String countAndSay(int n){
        if(n==1){
            return "1";
        }
        StringBuilder res=new StringBuilder();

        String s=countAndSay(n-1)+"0";
        for (int i=0,c=1;i<s.length()-1;i++,c++){
            if(s.charAt(i+1) != s.charAt(i)){
                res.append(c).append(s.charAt(i));
                c=0;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        int input=4;
        String output= new CountAndSay().countAndSay(input);
        System.out.println(output);
    }
}
