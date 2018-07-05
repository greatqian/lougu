package luogu2;

import java.util.Scanner;

public class P1328 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int na = input.nextInt();
		int nb = input.nextInt();
		int[][] resultMatrix = {{0, -1, 1, 1, 1, -1}, {1, 0, -1, 1, -1}, {-1, 1, 0, -1, 1}, {-1, -1, 1, 0, 1}, {1, 1, -1, -1, 0}};
		int[] aSequence = new int[na];
		int[] bSequence = new int[nb];
		for (int i = 0; i < na; i++) {
			aSequence[i] = input.nextInt();
		}
		for (int i = 0; i < nb; i++) {
			bSequence[i] = input.nextInt();
		}
		
		int aScore = 0;
		int bScore = 0;
		for (int i = 0; i < n; i++) {
			int aChoose = aSequence[i % na];
			int bChoose = bSequence[i % nb];
			if (resultMatrix[aChoose][bChoose] == 1) {
				aScore++;
			}
			if (resultMatrix[aChoose][bChoose] == -1) {
				bScore++;
			}
		}
		System.out.println(aScore + " " + bScore);
	}

}
