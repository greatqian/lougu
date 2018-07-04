package luogu;

import java.util.Scanner;

public class P1028 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		long result = getSpecialNumberCountCirculaly(n);
		System.out.println(result);
	}
	
	public static long getSpecialNumberCountCirculaly(int n) {
		if (n == 1) {
			return 1;
		}
		int half = n / 2;
		long[] numberCount = new long[half + 1];
		numberCount[1] = 1;
		for (int i = 2; i <= half; i++) {
			int numberHalf = i / 2;
			int count = 1;
			for (int j = 1; j <= numberHalf; j++) {
				count += numberCount[j];
			}
			numberCount[i] = count;
		}
		long result = 1;
		for (int i = 1; i <= half; i++) {
			result += numberCount[i];
		}
		return result;
	}
	
	public static long getSpecialNumberCountRecursively(int n) {
		if (n == 1) {
			return 1;
		}
		int half = n / 2;
		long number = 1;
		for (int i = 1; i <= half; i++) {
			number = number + getSpecialNumberCountRecursively(i);
		}
		return number;
	}

}
