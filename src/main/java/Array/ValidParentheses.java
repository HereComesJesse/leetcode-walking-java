/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package Array;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author zhangjundong
 * @date 2019/8/1421:04
 */
public class ValidParentheses {

    private HashMap<Character,Character> mappings;

    public ValidParentheses(){
        mappings=new HashMap<Character, Character>();
        mappings.put(')','(');
        mappings.put('}','{');
        mappings.put(']','[');
    }

    /**
     * Description:
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     *
     * An input string is valid if:
     *
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Note that an empty string is also considered valid.
     *
     * Solutions:
     * Time Complexity:O(n)  Space Complexity:O(n)
     * @param s
     * @return
     */
    public Boolean isValid(String s){
        Stack<Character> stack=new Stack<Character>();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(mappings.containsKey(c)){
                char topElement= stack.isEmpty()?'#':stack.pop();
                if(topElement != mappings.get(c)){
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input="()[]{}";
        Boolean output= new ValidParentheses().isValid(input);
        System.out.println(output);
    }
}
