package com.N10TO20;

public class N12 {

    public String intToRoman(int num) {

        int mi = num/1000;
        StringBuffer re = new StringBuffer();
        if(mi != 0){
            num -= mi * 1000;
            for (int i = 0; i < mi; i++) {
                re.append("M");
            }
        }

        if(num >= 900){
            num -= 900;
            re.append("CM");
        }
        if(num >= 500){
            num -= 500;
            re.append("D");
        }
        if(num >= 400){
            num -= 400;
            re.append("CD");
        }
        mi = num/100;
        if(mi != 0){
            num -= mi*100;
            for (int i = 0; i <mi ; i++) {
                re.append("C");
            }
        }

        if(num >= 90){
            num -= 90;
            re.append("XC");
        }
        if(num >= 50){
            num -= 50;
            re.append("L");
        }
        if(num >= 40){
            num -= 40;
            re.append("XL");
        }

        mi = num/10;
        if(mi != 0){
            num -= mi*10;
            for (int i = 0; i <mi ; i++) {
                re.append("X");
            }
        }

        if(num >= 9){
            num -= 9;
            re.append("IX");
        }
        if(num >= 5){
            num -= 5;
            re.append("V");
        }
        if(num >= 4){
            num -= 4;
            re.append("IV");
        }
        mi = num;
        if(mi != 0){

            for (int i = 0; i <mi ; i++) {
                re.append("I");
            }
        }

        return re.toString();
    }
}
