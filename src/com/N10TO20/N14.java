package com.N10TO20;

public class N14 {
    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0){
            return "";
        }
        StringBuffer ls = new StringBuffer();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if(strs[i] == null || strs[i].length() == 0){
                return "";
            }
            if(min > strs[i].length()){
                min = strs[i].length();
            }
        }

        for (int i = 0; i < min; i++) {
            char f = strs[0].charAt(i);
            for (int j = 0; j <strs.length ; j++) {
                if(strs[j].charAt(i) != f){
                    return ls.toString();
                }

            }
            ls.append(f);
        }
        return ls.toString();
    }
}
