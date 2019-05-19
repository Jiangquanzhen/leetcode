package com.N1TON10;

public class N9 {
    public boolean isPalindrome(int x) {
        if( x < 0){
            return false;
        }else{
            int ri = 0;
            int rx = x;
            while(x != 0){
                int f = x % 10;
                x = x/10;
                ri = ri * 10 + f;
            }
            if(ri == rx){
                return true;
            }
            return false;
        }
    }
}
