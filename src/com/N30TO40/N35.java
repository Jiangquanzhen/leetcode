package com.N30TO40;

public class N35 {
	public int searchInsert(int[] nums, int target) {

		if(nums.length == 0 || nums[0] >=target) {
			return 0;
		}
		if(nums[nums.length -1] < target) {
			return nums.length;
		}
		int start = 0;
		int end = nums.length;
		int mid = (start + end)/2;
		while(start + 1 < end) {
			if(nums[mid] == target) {
				return mid;
			}else if(nums[mid] < target){
				start = mid;
				mid = (start + end)/2;
			}else if(nums[mid] > target) {
				end = mid;
				mid = (start + end)/2;
				
			}
		}
		//if(nums[end] > target && target > nums[start]) {
			return start + 1;
		//}
			
	}
}
