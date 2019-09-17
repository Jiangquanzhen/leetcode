import com.N30TO40.N36;

public class Test36 {

	public static void main(String[] args) {
		
		
		char[][] chars = new char[9][9];
		
		chars[0] = new char[]{'5','3','.','.','7','.','.','.','.'};
		chars[1] = new char[]{'6','.','.','1','9','5','.','.','.'};
		chars[2] = new char[]{'.','9','8','.','.','.','.','6','.'};
		chars[3] = new char[]{'8','.','.','.','6','.','.','.','3'};
		chars[4] = new char[]{'4','.','.','8','.','3','.','.','1'};
		chars[5] = new char[]{'7','.','.','.','2','.','.','.','6'};
		chars[6] = new char[]{'.','6','.','.','.','.','2','8','.'};
		chars[7] = new char[]{'.','.','.','4','1','9','.','.','5'};
		chars[8] = new char[]{'.','.','.','.','8','.','.','7','9'};
		
		N36 n = new N36();
		System.out.println(n.isValidSudoku(chars));
		
	}
}
