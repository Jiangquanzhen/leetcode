package com;

public class N739 {

	public int[] dailyTemperatures(int[] T) {

		if(T == null || T.length == 0) {
			return null;
		}
		
		int[] back = new int[T.length];
		
		for(int i = 0; i < T.length;i++) {
			int base = T[i];
			int j = i + 1;
			for(;j<T.length;j++) {
				if(T[j] > T[i]) {
					back[i] = j - i;
					break;
				}
			}
			if(j == T.length) {
				back[i] = 0;
			}
		}
		return back;
	}

	public static void main(String[] args) {
		
		int[] t = {73, 74, 75, 71, 69, 72, 76, 73};
		
		N739 n = new N739();
		
		int[] back = n.dailyTemperatures(t);
		
		for(int i : back) {
			System.out.println(i);
		}
		
		
	}
}
