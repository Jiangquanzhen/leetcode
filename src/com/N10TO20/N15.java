package com.N10TO20;

import java.lang.reflect.Array;
import java.util.*;

public class N15 {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> s = new HashSet<>();
        Set<List<Integer>> s1 = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j <nums.length ; j++) {
                List<Integer> re2 = new ArrayList<>();
                if(nums[i] > nums[j]){
                    re2.add(nums[j]);
                    re2.add(nums[i]);
                }else{
                    re2.add(nums[i]);
                    re2.add(nums[j]);
                }
                if(s1.contains(re2)){
                    continue;
                }
                for (int k = j +1; k < nums.length; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> re = new ArrayList<>();
                        List<Integer> re1 = new ArrayList<>();
                        re.add(nums[i]);
                        re.add(nums[j]);
                        re.add(nums[k]);
                        Collections.sort(re);
                        s.add(re);

                        if(nums[i] > nums[j]){
                            re1.add(nums[j]);
                            re1.add(nums[i]);
                        }else{
                            re1.add(nums[i]);
                            re1.add(nums[j]);
                        }
                        s1.add(re1);

                    }
                }
            }
        }

        return new ArrayList<>(s);

    }

 }
