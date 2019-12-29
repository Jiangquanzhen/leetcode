package com.N30TO40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class N39 {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {

		List<Integer> con = new ArrayList();
		
		for(int i :candidates) {
			con.add(i);
		}
		Collections.sort(con);  
		
		List<List<Integer>> back = new ArrayList<List<Integer>>();
		back.add(con);
		for(int i:con) {
			
			test(con,target - i,back);
		}
		

		return back;
	}

	public List<List<Integer>> test(List<Integer> con, int tager, List<List<Integer>> back) {

		for (int c : con) {
			if (tager - c > con.get(0) ) {
				
//				back.forEach(b->{
//					b.add(c);
//				});
				
				for(int i = 0;i<back.size();i++) {
					back.get(i).add(c);
				}
				
				List<List<Integer>> list = test(con, tager - c,back);
			}
			if(tager - c == 0) {
				return back;
			}else {
				return back;
			}
			
			
		}
		return back;

	}

	public static void main(String[] args) {

		N39 n = new N39();

		int[] a = { 2, 3, 6, 7 };

		int t = 7;

		List<List<Integer>> list = n.combinationSum(a, t);
		
		list.forEach(c->{
			System.out.println("----");
			c.forEach(d->{
				
				System.out.println(d);
			});
		});

	}
}
