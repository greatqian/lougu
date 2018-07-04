package luogu2;

import java.util.Arrays;
import java.util.Scanner;

public class P1056 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m, n, k, l, d;
		m = input.nextInt();
		n = input.nextInt();
		k = input.nextInt();
		l = input.nextInt();
		d = input.nextInt();
		int[][] badBoys = new int[d][4];
		for (int i = 0; i < d; i++) {
			for (int j = 0; j < 4; j++) {
				badBoys[i][j] = input.nextInt();
			}
		}
		int[] rowBadBoyCouples = new int[m + 1];
		int[] colBadBoyCouples = new int[n + 1];
		for (int i = 0; i < d; i++) {
			if (badBoys[i][0] == badBoys[i][2]) {
				int col = Math.min(badBoys[i][1], badBoys[i][3]);
				colBadBoyCouples[col]++;
			}
			if (badBoys[i][1] == badBoys[i][3]) {
				int row = Math.min(badBoys[i][0], badBoys[i][2]);
				rowBadBoyCouples[row]++;
			}
		}
		boolean[] choosedRow = new boolean[m + 1];
		for (int i = 0; i < k; i++) {
			int max = 0;
			int index = 1;
			for (int j = 1; j < m + 1; j++) {
				if (!choosedRow[j] && rowBadBoyCouples[j] > max) {
					max = rowBadBoyCouples[j];
					index = j;
				}
			}
			choosedRow[index] = true;
		}
		int count = 0;
		for (int i = 1; i < m + 1; i++) {
			if (choosedRow[i]) {
				count++;
				System.out.printf(i + (count == k ? "\n" : " "));
			}
		}
		
		boolean[] choosedCol = new boolean[n + 1];
		for (int i = 0; i < l; i++) {
			int max = 0;
			int index = 1;
			for (int j = 1; j < n + 1; j++) {
				if (!choosedCol[j] && colBadBoyCouples[j] > max) {
					max = colBadBoyCouples[j];
					index = j;
				}
			}
			choosedCol[index] = true;
		}
		count = 0;
		for (int i = 1; i < n + 1; i++) {
			if (choosedCol[i]) {
				count++;
				System.out.printf(i + (count == l ? "\n" : " "));
			}
		}
	}

}
