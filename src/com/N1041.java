package com;

public class N1041 {
    public boolean isRobotBounded(String instructions) {
        if (instructions.length() == 0){
            return false;
        }
        int d = 0;
        int[] a = {0,0};
        for (int i = 0; i <instructions.length() ; i++) {
            if(instructions.charAt(i) == 'G'){
                a = GI(d,a);
            }else if (instructions.charAt(i) == 'L'){
                d = LI(d);
            }else if (instructions.charAt(i) == 'R'){
                d = RI(d);
            }
        }

        if(a[0] == 0 && a[1] == 0){
            return true;
        }else if(d == 0){
            return true;
        }
        return false;
    }

    private int[] GI(int d,int[] l){
        if(d == 0){
            int[] a ={l[0],l[1] +1};
            return a;
        }else if(d == 1){
            int[] a = {l[0] - 1,l[1]};
            return a;
        }else if(d == 2){
            int[] a ={l[0],l[1] - 1};
            return a;
        }else if(d == 3){
            int[] a = {l[0] + 1, l[1]};
            return a;
        }
        return null;
    }

    private int LI(int d){
        if(d == 3){
            return 0;
        }else{
            return d + 1;
        }
    }

    private int RI(int d){
        if(d == 0){
            return 3;
        }else{
            return d -1;
        }
    }
}
