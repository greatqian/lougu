package luogu;

import java.util.Scanner;

public class P1428 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] cuteDegree = new int[n];
		int[] lowerDegreeCount = new int[n];
		for (int i = 0; i < n; i++) {
			cuteDegree[i] = input.nextInt();
			if (i == 0) {
				lowerDegreeCount[i] = 0;
				continue;
			}
			int count = 0;
			for (int j = 0; j < i; j++) {
				if (cuteDegree[j] < cuteDegree[i]) {
					count++;
				}
			}
			lowerDegreeCount[i] = count;
		}
		for (int i = 0; i < lowerDegreeCount.length; i++) {
			System.out.print(lowerDegreeCount[i] + " ");
		}
		
	}

}
