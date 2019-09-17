package com.N30TO40;

public class N36 {
	public boolean isValidSudoku(char[][] board) {
		char[] row = new char[9];
		char[] col = new char[9];
		char[] block = new char[9];
		for(int i  = 0;i<9;i++ ) {
			row = board[i];
			if(!isValid(row)) {
				return false;
			}
			
			for(int j = 0;j<9;j++) {
				col[j] = board[j][i];
				
				if(i%3 == 0 && j%3 == 0) {
					for(int k = 0,l = i,m = j;k< 9;k++) {
						block[k] = board[l][m];
						if((m+1)%3 == 0) {
							if((l+1)%3 == 0) {
								break;
							}
							l++;m=j;
						}else {
							m++;
						}
					}
					if(!isValid(block)) {
						return false;
					}
				}
			}
			if(!isValid(col)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isValid(char[] chars) {
		boolean flag = true;
		for(int i = 0;i<9;i++) {
			if(chars[i] == '.') {
				continue;
			}else {
				for(int j = i +1;j<9;j++) {
					if(chars[i] == chars[j]) {
						flag = false;
					}
				}
			}
		}
		
		return flag;
	}
}
