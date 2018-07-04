package luogu;

import java.util.Scanner;

public class P1047 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int roadLength = input.nextInt();
		int[] noTrees = new int[roadLength + 1];
		int intervalCount = input.nextInt();
		for (int i = 0; i < intervalCount; i++) {
			int left = input.nextInt();
			int right = input.nextInt();
			for (int j = left; j <= right; j++) {
				noTrees[j] = 1;
			}
		}
		int count = 0;
		for (int i = 0; i < roadLength + 1; i++) {
			if (noTrees[i] == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
