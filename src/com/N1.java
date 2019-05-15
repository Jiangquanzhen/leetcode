package com;

public class N1 {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int ret = target - nums[i];
            for (int j = 0; j < nums.length && i != j; j++) {
                if(nums[j] == ret){
                    int[] reint = new int[2];
                    reint[0] = i;
                    reint[1] = j;
                    return reint;
                }
            }
        }
        return null;
    }
}
