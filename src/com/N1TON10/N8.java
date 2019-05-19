package com.N1TON10;

public class N8 {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0){
            return 0;
        }
        String s = str;
        int ri = 0;
        int n = 1;
        boolean f = false;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ' && !f){
                continue;
            }else if (s.charAt(i) != '+' && s.charAt(i) != '-' && (s.charAt(i) < '0' || s.charAt(i) > '9') && !f){
                return 0;
            }else if (s.charAt(i) == '-' && !f){
                n = -1;
                f = true;
                if((i+1) < s.length() && s.charAt(i + 1) > '0' && s.charAt(i + 1) <='9'){
                    ri = -1*Integer.valueOf(s.charAt(i+1)+"");
                    i++;
                }else{
                    return 0;
                }
            }else if (s.charAt(i) == '+' && !f){
                f = true;
                n = 1;
                if((i+1) < s.length() && s.charAt(i + 1) > '0' && s.charAt(i + 1) <='9'){
                    ri = Integer.valueOf(s.charAt(i+1)+"");
                    i++;
                }else{
                    return 0;
                }
            }
            else if ('0' <=s.charAt(i) && s.charAt(i) <= '9'){
                f = true;
                if(ri * 10L + Integer.valueOf(s.charAt(i)+"")> Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }else if(ri * 10L + -1 *Integer.valueOf(s.charAt(i)+"")< Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
                ri = ri * 10 + Integer.valueOf(s.charAt(i)+"") * n;
            }else if ((s.charAt(i) < '0' || s.charAt(i) > '9') && f){
                return ri;
            }
        }
        return ri;
    }
}
