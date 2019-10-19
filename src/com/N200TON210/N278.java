package com.N200TON210;

public class N278 {

	public int firstBadVersion(int n) {
		int start = 0;
		int end = n;
		int mid = (start + end)/2;
		while(start + 1 < end) {
			if(isBadVersion(mid)) {
				end = mid;
				mid = getMid(start , end);
			}else {
				start = mid;
				mid = getMid(start , end);
			}
		}
		if(isBadVersion(start)) {
			return start;
		}else {
			return start + 1;
		}
	}

	public boolean isBadVersion(int version) {
		return version >= 1702766719;
	}

	public int getMid(int a ,int b) {
		
		if((a%2 + b%2) == 2) {
			return a/2 + b/2 + 1;
		}else {
			return a/2 + b/2;
		}
	}
}
