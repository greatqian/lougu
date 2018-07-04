package luogu2;

import java.util.Scanner;

public class P1003 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[][] carpets = new int[n][4];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				carpets[i][j] = input.nextInt();
			}
		}
		int x = input.nextInt();
		int y = input.nextInt();
		for (int i = n - 1; i >= 0; i--) {
			if (x <= (carpets[i][0] + carpets[i][2]) && x >= carpets[i][0] && y <= (carpets[i][1] + carpets[i][3]) && y >= carpets[i][1]) {
				System.out.println(i + 1);
				return;
			}
		}
		System.out.println(-1);
	}

}
