package com.N20TO30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class N22 {
    public List<String> generateParenthesis(int n) {
        Set<StringBuffer> re ;
        re = temp(n);

        Set<String> re1 = new HashSet<>();
        for(StringBuffer s:re){
            re1.add(s.toString());
        }
        return new ArrayList<>(re1);

    }

    public Set<StringBuffer> temp(int n){
        Set<StringBuffer> re = new HashSet<>();
        if(n == 1){
            StringBuffer sb = new StringBuffer();
            sb.append("()");
            re.add(sb);
            return re;
        }
        Set<StringBuffer> list = temp( n - 1);
        list.forEach(o->{
            for (int i = 0;i<o.length();i++){
                StringBuffer ss = new StringBuffer(o);
                ss.insert(i,"()");
                re.add(ss);
            }
        });
        return re;
    }
}
