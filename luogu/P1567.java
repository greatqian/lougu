package luogu;

import java.util.Scanner;

public class P1567 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] temps = new int[n];
		for (int i = 0; i < n; i++) {
			temps[i] = input.nextInt();
		}
		int currentCount = 0;
		int longestCount = 0;
		for (int i = 1; i < n; i++) {
			if (temps[i] > temps[i - 1]) {
				currentCount++;
				longestCount = (currentCount > longestCount ? currentCount : longestCount);
			} else {
				currentCount = 0;
			}
		}
		longestCount = (longestCount > 0 ? (longestCount + 1) : 0);
		System.out.println(longestCount);
	}
	
	public static void tle() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int lastDayTemp = 0;
		int currentCount = 0;
		int longestCount = 0;
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				lastDayTemp = input.nextInt();
				continue;
			}
			int temperature = input.nextInt();
			if (temperature > lastDayTemp) {
				currentCount++;
				longestCount = (currentCount > longestCount ? currentCount : longestCount);
			} else {
				currentCount = 0;
			}
			lastDayTemp = temperature;
		}
		longestCount = (longestCount > 0 ? (longestCount + 1) : 0);
		System.out.println(longestCount);
	}

}
