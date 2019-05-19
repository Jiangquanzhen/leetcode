package com.N10TO20;

public class N11 {
    public int maxArea(int[] height) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i +1; j < height.length; j++) {
                b = (j - i) * Math.min(height[i],height[j]);
                if (a < b){
                    a = b;
                }
            }
        }
        return a;
    }

}
