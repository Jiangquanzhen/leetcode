package com.N20TO30;

public class N29 {
    public int divide(int dividend, int divisor) {

        boolean flag = true;
        int re = 0;
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        if(divisor < 0){
            flag = false;
            divisor = 0-divisor;
        }
        if(dividend == Integer.MIN_VALUE){
            dividend = dividend + divisor;
            re += 1;
        }
        if(dividend < 0 ){
            dividend = 0-dividend;
            flag = !flag;
        }
        while (dividend >= divisor){
            dividend = dividend -divisor;
            re +=1;
        }
        if(flag){
            return re;
        }else{
            return 0-re;
        }

    }
}
