package com.N10TO20;

public class N13 {

    public int romanToInt(String s) {

        int rei = 0;
        for (int i = 0; i <s.length()  ; i++) {
            if(s.charAt(i) == 'M'){
                rei += 1000;
                continue;
            }else if(s.charAt(i) == 'D'){
                rei += 500;
            }else if(s.charAt(i) == 'C'){
                if(i + 1<s.length() && s.charAt(i+1) =='D' ){
                    rei += 400;
                    i++;
                    continue;
                }else if(i + 1 <s.length() && s.charAt( i + 1) == 'M'){
                    rei += 900;
                    i++;
                    continue;
                }else{
                    rei += 100;
                    continue;
                }
            }else if(s.charAt(i) == 'L'){
                rei += 50;
            }else if (s.charAt(i) == 'X'){
                if(i + 1<s.length() && s.charAt(i+1) =='L'){
                    rei += 40;
                    i++;
                    continue;
                }else if(i + 1 <s.length() && s.charAt( i + 1) == 'C'){
                    rei += 90;
                    i++;
                    continue;
                }else{
                    rei += 10;
                    continue;
                }
            }else if(s.charAt(i) == 'V'){
                rei += 5;
            }else if (s.charAt(i) == 'I'){
                if(i + 1<s.length() && s.charAt(i+1) =='V'){
                    rei += 4;
                    i++;
                    continue;
                }else if(i + 1 <s.length() && s.charAt( i + 1) == 'X'){
                    rei += 9;
                    i++;
                    continue;
                }else{
                    rei += 1;
                    continue;
                }
            }


        }


        return rei;
    }
}
