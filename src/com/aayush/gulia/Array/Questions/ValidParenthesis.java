package com.aayush.gulia.Array.Questions;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();

        char[] chars = str.toCharArray();

        for (int i=0; i< chars.length; i++){
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{'){
                stack.push(chars[i]);
            }

            else if (chars[i] == ')' && stack.peek() == '('){
                stack.pop();
            }

            else if (chars[i] == ']' && stack.peek() == '['){
                stack.pop();
            }

            else if (chars[i] == '}' && stack.peek() == '{'){
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
