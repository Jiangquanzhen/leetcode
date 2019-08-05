package com.N10TO20;

import java.util.*;

public class N17 {
    public List<String> letterCombinations(String digits) {

        String[] zd = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        char[] ca = digits.toCharArray();
        List<String> re = new ArrayList<>();

        if (digits.length() == 0){
            return re;
        }
        else if (digits.length() == 1){
            for (int i = 0; i < zd[Integer.valueOf(digits.charAt(0) + "")].length(); i++) {
                re.add(zd[Integer.valueOf(digits.charAt(0) + "")].charAt(i) + "");
            }
        }else{
            re = ttt(digits.charAt(0),digits.substring(1,digits.length() ));
        }

        return re;
    }

    public List<String> ttt(char a,String s){
        String[] zd = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> re = new ArrayList<>();
        if(s.length() == 1){
            for (int j = 0; j < zd[Integer.valueOf(s)].length(); j++) {
                for (int i = 0; i < zd[Integer.valueOf(a+"")].length(); i++) {
                    re.add(zd[Integer.valueOf(a+"")].charAt(i)+"" +zd[Integer.valueOf(s)].charAt(j));
                }

            }
            return re;
        }else{
            List<String> ll = ttt(s.charAt(0),s.substring(1,s.length() ));
            for (int i = 0; i < ll.size(); i++) {
                for (int j = 0; j < zd[Integer.valueOf(a+"")].length(); j++) {
                    re.add(zd[Integer.valueOf(a+"")].charAt(j) + ll.get(i));
                }
            }
            return re;
        }


    }
}
