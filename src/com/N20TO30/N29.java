package com.N20TO30;

public class N29 {
    public int divide(int dividend, int divisor) {

        boolean flag = true;
        int re = 0;
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        if(divisor == Integer.MIN_VALUE && dividend == Integer.MIN_VALUE){
            return 1;
        }else if(divisor == Integer.MIN_VALUE ){
            return 0;
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
        int tem_divend = dividend;
        int tem_divsor = divisor;
        int tem_con = 1;
        while (tem_divend >= tem_divsor && tem_divsor > 0){
            tem_divend = tem_divend -tem_divsor;
            re +=tem_con;

            tem_divsor += tem_divsor;
            tem_con += tem_con;
            if(tem_divend - tem_divsor < divisor){
                tem_divsor = divisor;
                tem_con = 1;
            }
        }
        if(flag){
            return re;
        }else{
            return 0-re;
        }

    }
}
