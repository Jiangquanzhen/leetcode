package com.N30TO40;

public class N33 {
	public int search(int[] nums, int target) {
		
		if(nums.length == 0) {
			return -1;
		}
		if(nums[0] > target && nums[nums.length -1] < target) {
			return -1;
		}
		int st = 0;
		int end = nums.length -1;
		int mid = (st + end)/2;
		while(st + 1 < end) {
			if(nums[mid] == target) {
				return mid;
			}
			if(nums[mid] > nums[st] ) {
				if(nums[mid] > target && target >= nums[st])  {
					end = mid;
					mid = (st + end)/2;
				}else {
					st = mid;
					mid = (st + end)/2;
				}
			}else {
				if(nums[mid] < target && target <= nums[end])  {
					st = mid;
					mid = (st + end)/2;
				}else {
					end = mid;
					mid = (st + end)/2;
				}
			}
		}
		if(nums[st] == target) return st;
		if(nums[end] == target) return end;
		
		return -1;
	}
}
