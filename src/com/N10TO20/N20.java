package com.N10TO20;

import java.util.Stack;

public class N20 {
    public boolean isValid(String s) {

        Stack<Character> stack=new Stack();

        for (int i = 0;i<s.length();i++){
            if(isLeft(s.charAt(i))){
                stack.push(s.charAt(i));
            }else if(isRight(s.charAt(i))){
                if(stack.isEmpty()){
                    return false;
                }
                if (!isMatch(stack.pop() ,s.charAt(i))){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isLeft(char c ){
        if(c == '(' || c =='[' || c == '{'){
            return true;
        }
        return false;
    }

    private boolean isRight(char c){
        if(c == ')' || c == ']' || c == '}'){
            return true;
        }
        return false;
    }

    private boolean isMatch(char c ,char s){
        if (c == '(' && s == ')'){
            return  true;
        }
        if (c == '[' && s == ']'){
            return  true;
        }
        if (c == '{' && s == '}'){
            return  true;
        }

        return false;
    }
}
