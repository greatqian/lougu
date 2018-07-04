package luogu;

import java.util.Scanner;

public class P1478 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int appleCount = input.nextInt();
		int strength = input.nextInt();
		int chairHeight = input.nextInt();
		int handsLength = input.nextInt();
		int[][] apples = new int[appleCount][3];
		for (int i = 0; i < appleCount; i++) {
			apples[i][0] = input.nextInt();
			apples[i][1] = input.nextInt();
			apples[i][2] = 0;
		}
		int reachHeight = chairHeight + handsLength;
		int count = 0;
		while (true) {
			int minAppleStrength = 9999;
			int minStrengthAppleIndex = 0;
			for (int i = 0; i < appleCount; i++) {
				if (apples[i][2] != 1 && apples[i][1] < minAppleStrength && reachHeight >= apples[i][0]) {
					minAppleStrength = apples[i][1];
					minStrengthAppleIndex = i;
				}
			}
			if (minAppleStrength == 9999) {
				break;
			}
			if ((strength - minAppleStrength) < 0) {
				break;
			}
			strength = strength - minAppleStrength;
			apples[minStrengthAppleIndex][2] = 1;
			count++;
		}
		System.out.println(count);
	}

}
