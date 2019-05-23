package com.N1TON10;

public class N10 {
    public boolean isMatch(String s, String p) {

            //递归可能存在重复计算，将计算中间结果保存。

            Boolean[][] result = new Boolean[s.length()+1][p.length()+1];
            return process(s,p,result);
        }


        public  boolean process(String s, String p, Boolean[][] result) {
            //1.当长度都为0，递归结束。
            //2.当正则p长度为0，s长度不为0，需要检查正则p第二个是否是*，不是直接返回 false 如果是递归判断（s,p.substring(2)）
            //3.将问题化解为不同情况的子问题 一共就这4种分支。分支对应着不同的递归方法。
            //3.1第一个字符 和第一个匹配字符不相等, 但匹配字符串第二个字符是*情况
            //3.2第一个字符 和第一个匹配字符不相等, 但匹配字符串第二个字符不是*情况
            //3.3第一个字符 和第一个匹配字符相等, 但匹配字符串第二个字符是*情况
            //3.4第一个字符 和第一个匹配字符相等, 但匹配字符串第二个字符不是*情况
            int sLength=s.length();
            int pLength=p.length();
            if(null!= result[sLength][pLength]){
                return  result[sLength][pLength];
            }
            if(sLength==0 && pLength==0){
                return  result[sLength][pLength]=true;
            }
            if(sLength>0 && pLength==0){
                return  result[sLength][pLength]=false;
            }else if(sLength==0 && pLength>0){
                if(pLength>1 && p.charAt(1)=='*'){
                    return	 result[sLength][pLength]=process(s,p.substring(2),result);
                }else{
                    return  result[sLength][pLength]=false ;
                }
            }

            if(s.charAt(0) !=p.charAt(0) && p.charAt(0)!='.' &&(pLength>1 &&  p.charAt(1)!='*' )){
                return result[sLength][pLength]=false;
            }else{
                if(s.charAt(0) !=p.charAt(0) && p.charAt(0)!='.' &&(pLength>1 &&  p.charAt(1)=='*' ) ){
                    return  result[sLength][pLength]=process(s,p.substring(2),result);
                }else if( s.charAt(0) ==p.charAt(0) || p.charAt(0)=='.') {
                    if(pLength>1 &&  p.charAt(1)=='*'){
                        return   result[sLength][pLength]=process( s.substring(1), p.substring(2),result)  || process( s,  p.substring(2),result) ||
                                process( s.substring(1), p,result);
                    }else{
                        return   result[sLength][pLength]=process( s.substring(1), p.substring(1),result);
                    }
                }else{
                    return  result[sLength][pLength]=false;
                }
            }

        }
}
