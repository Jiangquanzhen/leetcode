package com.N1TON10;

public class N7 {

    public int reverse(int x) {

        int temp = 0;
        while( x != 0){
            int ret = x % 10;
            x = x/10;
            if(temp * 10l > Integer.MAX_VALUE || temp * 10l < Integer.MIN_VALUE){
                return 0;
            }
            temp =temp * 10 + ret ;

        }

        return temp;
    }
}
