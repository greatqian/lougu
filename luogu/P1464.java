package luogu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1464 {
	
	public static int[][][] w = new int[21][21][21];
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<String> results = new ArrayList();
		long n1, n2, n3;
		initW();
		do {
			n1 = input.nextInt();
			n2 = input.nextInt();
			n3 = input.nextInt();
			if (!(n1 == -1 && n2 == -1 && n3 == -1)) {
				results.add(getResult(n1, n2, n3));
			}
		} while (!(n1 == -1 && n2 == -1 && n3 == -1));
		
		for (String s: results) {
			System.out.println(s);
		}
		
	}
	
	public static String getResult(long n1, long n2, long n3) {
		if (n1 <= 0 || n2 <= 0 || n3 <= 0) {
			return "w(" + n1 + ", " + n2 + ", " + n3 + ") = 1"; 
		}
		if (n1 > 20 || n2 > 20 || n3 > 20) {
			return "w(" + n1 + ", " + n2 + ", " + n3 + ") = " + w[20][20][20];
		}
		return "w(" + n1 + ", " + n2 + ", " + n3 + ") = " + w[(int) n1][(int) n2][(int) n3];
	}
	
	public static void initW() {
		w[0][0][0] = 1;
		for (int i = 0; i < 21; i++) {
			for (int j = 0; j < 21; j++) {
				for (int k = 0; k < 21; k++) {
					w[i][j][k] = getNumber(i, j, k);
				}
			}
		}
	}
	
	public static int getNumber(int i, int j, int k) {
		if (i <= 0 || j <= 0 || k <= 0) {
			return 1;
		}
		if (i < j && j < k) {
			return w[i][j][k-1] + w[i][j-1][k-1] - w[i][j-1][k];
		}
		return w[i-1][j][k] + w[i-1][j-1][k] + w[i-1][j][k-1] - w[i-1][j-1][k-1];
	}

}
